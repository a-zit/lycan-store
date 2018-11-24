/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.model.controller;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import jpa.model.Customer;
import jpa.model.Payment;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.UserTransaction;
import jpa.model.Orders;
import jpa.model.controller.exceptions.NonexistentEntityException;
import jpa.model.controller.exceptions.RollbackFailureException;

/**
 *
 * @author DEMO TEST
 */
public class OrdersJpaController implements Serializable {

    public OrdersJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Orders orders) throws RollbackFailureException, Exception {
        if (orders.getPaymentList() == null) {
            orders.setPaymentList(new ArrayList<Payment>());
        }
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Customer customerid = orders.getCustomerid();
            if (customerid != null) {
                customerid = em.getReference(customerid.getClass(), customerid.getCustomerid());
                orders.setCustomerid(customerid);
            }
            List<Payment> attachedPaymentList = new ArrayList<Payment>();
            for (Payment paymentListPaymentToAttach : orders.getPaymentList()) {
                paymentListPaymentToAttach = em.getReference(paymentListPaymentToAttach.getClass(), paymentListPaymentToAttach.getPaymentid());
                attachedPaymentList.add(paymentListPaymentToAttach);
            }
            orders.setPaymentList(attachedPaymentList);
            em.persist(orders);
            if (customerid != null) {
                customerid.getOrdersList().add(orders);
                customerid = em.merge(customerid);
            }
            for (Payment paymentListPayment : orders.getPaymentList()) {
                Orders oldOrdersidOfPaymentListPayment = paymentListPayment.getOrdersid();
                paymentListPayment.setOrdersid(orders);
                paymentListPayment = em.merge(paymentListPayment);
                if (oldOrdersidOfPaymentListPayment != null) {
                    oldOrdersidOfPaymentListPayment.getPaymentList().remove(paymentListPayment);
                    oldOrdersidOfPaymentListPayment = em.merge(oldOrdersidOfPaymentListPayment);
                }
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

    public void edit(Orders orders) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Orders persistentOrders = em.find(Orders.class, orders.getOrdersid());
            Customer customeridOld = persistentOrders.getCustomerid();
            Customer customeridNew = orders.getCustomerid();
            List<Payment> paymentListOld = persistentOrders.getPaymentList();
            List<Payment> paymentListNew = orders.getPaymentList();
            if (customeridNew != null) {
                customeridNew = em.getReference(customeridNew.getClass(), customeridNew.getCustomerid());
                orders.setCustomerid(customeridNew);
            }
            List<Payment> attachedPaymentListNew = new ArrayList<Payment>();
            for (Payment paymentListNewPaymentToAttach : paymentListNew) {
                paymentListNewPaymentToAttach = em.getReference(paymentListNewPaymentToAttach.getClass(), paymentListNewPaymentToAttach.getPaymentid());
                attachedPaymentListNew.add(paymentListNewPaymentToAttach);
            }
            paymentListNew = attachedPaymentListNew;
            orders.setPaymentList(paymentListNew);
            orders = em.merge(orders);
            if (customeridOld != null && !customeridOld.equals(customeridNew)) {
                customeridOld.getOrdersList().remove(orders);
                customeridOld = em.merge(customeridOld);
            }
            if (customeridNew != null && !customeridNew.equals(customeridOld)) {
                customeridNew.getOrdersList().add(orders);
                customeridNew = em.merge(customeridNew);
            }
            for (Payment paymentListOldPayment : paymentListOld) {
                if (!paymentListNew.contains(paymentListOldPayment)) {
                    paymentListOldPayment.setOrdersid(null);
                    paymentListOldPayment = em.merge(paymentListOldPayment);
                }
            }
            for (Payment paymentListNewPayment : paymentListNew) {
                if (!paymentListOld.contains(paymentListNewPayment)) {
                    Orders oldOrdersidOfPaymentListNewPayment = paymentListNewPayment.getOrdersid();
                    paymentListNewPayment.setOrdersid(orders);
                    paymentListNewPayment = em.merge(paymentListNewPayment);
                    if (oldOrdersidOfPaymentListNewPayment != null && !oldOrdersidOfPaymentListNewPayment.equals(orders)) {
                        oldOrdersidOfPaymentListNewPayment.getPaymentList().remove(paymentListNewPayment);
                        oldOrdersidOfPaymentListNewPayment = em.merge(oldOrdersidOfPaymentListNewPayment);
                    }
                }
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
                Integer id = orders.getOrdersid();
                if (findOrders(id) == null) {
                    throw new NonexistentEntityException("The orders with id " + id + " no longer exists.");
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
            Orders orders;
            try {
                orders = em.getReference(Orders.class, id);
                orders.getOrdersid();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The orders with id " + id + " no longer exists.", enfe);
            }
            Customer customerid = orders.getCustomerid();
            if (customerid != null) {
                customerid.getOrdersList().remove(orders);
                customerid = em.merge(customerid);
            }
            List<Payment> paymentList = orders.getPaymentList();
            for (Payment paymentListPayment : paymentList) {
                paymentListPayment.setOrdersid(null);
                paymentListPayment = em.merge(paymentListPayment);
            }
            em.remove(orders);
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

    public List<Orders> findOrdersEntities() {
        return findOrdersEntities(true, -1, -1);
    }

    public List<Orders> findOrdersEntities(int maxResults, int firstResult) {
        return findOrdersEntities(false, maxResults, firstResult);
    }

    private List<Orders> findOrdersEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Orders.class));
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

    public Orders findOrders(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Orders.class, id);
        } finally {
            em.close();
        }
    }

    public int getOrdersCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Orders> rt = cq.from(Orders.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
