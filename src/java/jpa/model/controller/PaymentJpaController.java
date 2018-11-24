/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.model.controller;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.UserTransaction;
import jpa.model.Orders;
import jpa.model.Payment;
import jpa.model.controller.exceptions.NonexistentEntityException;
import jpa.model.controller.exceptions.RollbackFailureException;

/**
 *
 * @author DEMO TEST
 */
public class PaymentJpaController implements Serializable {

    public PaymentJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Payment payment) throws RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Orders ordersid = payment.getOrdersid();
            if (ordersid != null) {
                ordersid = em.getReference(ordersid.getClass(), ordersid.getOrdersid());
                payment.setOrdersid(ordersid);
            }
            em.persist(payment);
            if (ordersid != null) {
                ordersid.getPaymentList().add(payment);
                ordersid = em.merge(ordersid);
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Payment payment) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Payment persistentPayment = em.find(Payment.class, payment.getPaymentid());
            Orders ordersidOld = persistentPayment.getOrdersid();
            Orders ordersidNew = payment.getOrdersid();
            if (ordersidNew != null) {
                ordersidNew = em.getReference(ordersidNew.getClass(), ordersidNew.getOrdersid());
                payment.setOrdersid(ordersidNew);
            }
            payment = em.merge(payment);
            if (ordersidOld != null && !ordersidOld.equals(ordersidNew)) {
                ordersidOld.getPaymentList().remove(payment);
                ordersidOld = em.merge(ordersidOld);
            }
            if (ordersidNew != null && !ordersidNew.equals(ordersidOld)) {
                ordersidNew.getPaymentList().add(payment);
                ordersidNew = em.merge(ordersidNew);
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = payment.getPaymentid();
                if (findPayment(id) == null) {
                    throw new NonexistentEntityException("The payment with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Payment payment;
            try {
                payment = em.getReference(Payment.class, id);
                payment.getPaymentid();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The payment with id " + id + " no longer exists.", enfe);
            }
            Orders ordersid = payment.getOrdersid();
            if (ordersid != null) {
                ordersid.getPaymentList().remove(payment);
                ordersid = em.merge(ordersid);
            }
            em.remove(payment);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Payment> findPaymentEntities() {
        return findPaymentEntities(true, -1, -1);
    }

    public List<Payment> findPaymentEntities(int maxResults, int firstResult) {
        return findPaymentEntities(false, maxResults, firstResult);
    }

    private List<Payment> findPaymentEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Payment.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Payment findPayment(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Payment.class, id);
        } finally {
            em.close();
        }
    }

    public int getPaymentCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Payment> rt = cq.from(Payment.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
