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
import jpa.model.Review;
import jpa.model.controller.exceptions.NonexistentEntityException;
import jpa.model.controller.exceptions.RollbackFailureException;

/**
 *
 * @author DEMO TEST
 */
public class ReviewJpaController implements Serializable {

    public ReviewJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Review review) throws RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Product productid = review.getProductid();
            if (productid != null) {
                productid = em.getReference(productid.getClass(), productid.getProductid());
                review.setProductid(productid);
            }
            em.persist(review);
            if (productid != null) {
                productid.getReviewList().add(review);
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

    public void edit(Review review) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Review persistentReview = em.find(Review.class, review.getReviewid());
            Product productidOld = persistentReview.getProductid();
            Product productidNew = review.getProductid();
            if (productidNew != null) {
                productidNew = em.getReference(productidNew.getClass(), productidNew.getProductid());
                review.setProductid(productidNew);
            }
            review = em.merge(review);
            if (productidOld != null && !productidOld.equals(productidNew)) {
                productidOld.getReviewList().remove(review);
                productidOld = em.merge(productidOld);
            }
            if (productidNew != null && !productidNew.equals(productidOld)) {
                productidNew.getReviewList().add(review);
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
                Integer id = review.getReviewid();
                if (findReview(id) == null) {
                    throw new NonexistentEntityException("The review with id " + id + " no longer exists.");
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
            Review review;
            try {
                review = em.getReference(Review.class, id);
                review.getReviewid();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The review with id " + id + " no longer exists.", enfe);
            }
            Product productid = review.getProductid();
            if (productid != null) {
                productid.getReviewList().remove(review);
                productid = em.merge(productid);
            }
            em.remove(review);
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

    public List<Review> findReviewEntities() {
        return findReviewEntities(true, -1, -1);
    }

    public List<Review> findReviewEntities(int maxResults, int firstResult) {
        return findReviewEntities(false, maxResults, firstResult);
    }

    private List<Review> findReviewEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Review.class));
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

    public Review findReview(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Review.class, id);
        } finally {
            em.close();
        }
    }

    public int getReviewCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Review> rt = cq.from(Review.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
