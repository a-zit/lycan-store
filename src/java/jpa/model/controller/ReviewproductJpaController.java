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
import jpa.model.Product;
import jpa.model.Reviewproduct;
import jpa.model.controller.exceptions.NonexistentEntityException;
import jpa.model.controller.exceptions.RollbackFailureException;

/**
 *
 * @author Pluem
 */
public class ReviewproductJpaController implements Serializable {

    public ReviewproductJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Reviewproduct reviewproduct) throws RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Product productid = reviewproduct.getProductid();
            if (productid != null) {
                productid = em.getReference(productid.getClass(), productid.getProductid());
                reviewproduct.setProductid(productid);
            }
            em.persist(reviewproduct);
            if (productid != null) {
                productid.getReviewproductList().add(reviewproduct);
                productid = em.merge(productid);
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

    public void edit(Reviewproduct reviewproduct) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Reviewproduct persistentReviewproduct = em.find(Reviewproduct.class, reviewproduct.getReviewid());
            Product productidOld = persistentReviewproduct.getProductid();
            Product productidNew = reviewproduct.getProductid();
            if (productidNew != null) {
                productidNew = em.getReference(productidNew.getClass(), productidNew.getProductid());
                reviewproduct.setProductid(productidNew);
            }
            reviewproduct = em.merge(reviewproduct);
            if (productidOld != null && !productidOld.equals(productidNew)) {
                productidOld.getReviewproductList().remove(reviewproduct);
                productidOld = em.merge(productidOld);
            }
            if (productidNew != null && !productidNew.equals(productidOld)) {
                productidNew.getReviewproductList().add(reviewproduct);
                productidNew = em.merge(productidNew);
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
                Integer id = reviewproduct.getReviewid();
                if (findReviewproduct(id) == null) {
                    throw new NonexistentEntityException("The reviewproduct with id " + id + " no longer exists.");
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
            Reviewproduct reviewproduct;
            try {
                reviewproduct = em.getReference(Reviewproduct.class, id);
                reviewproduct.getReviewid();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The reviewproduct with id " + id + " no longer exists.", enfe);
            }
            Product productid = reviewproduct.getProductid();
            if (productid != null) {
                productid.getReviewproductList().remove(reviewproduct);
                productid = em.merge(productid);
            }
            em.remove(reviewproduct);
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

    public List<Reviewproduct> findReviewproductEntities() {
        return findReviewproductEntities(true, -1, -1);
    }

    public List<Reviewproduct> findReviewproductEntities(int maxResults, int firstResult) {
        return findReviewproductEntities(false, maxResults, firstResult);
    }

    private List<Reviewproduct> findReviewproductEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Reviewproduct.class));
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

    public Reviewproduct findReviewproduct(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Reviewproduct.class, id);
        } finally {
            em.close();
        }
    }

    public int getReviewproductCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Reviewproduct> rt = cq.from(Reviewproduct.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
