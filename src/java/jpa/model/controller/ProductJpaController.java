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
import jpa.model.Reviewproduct;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.UserTransaction;
import jpa.model.Product;
import jpa.model.controller.exceptions.NonexistentEntityException;
import jpa.model.controller.exceptions.RollbackFailureException;

/**
 *
 * @author Pluem
 */
public class ProductJpaController implements Serializable {

    public ProductJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Product product) throws RollbackFailureException, Exception {
        if (product.getReviewproductList() == null) {
            product.setReviewproductList(new ArrayList<Reviewproduct>());
        }
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            List<Reviewproduct> attachedReviewproductList = new ArrayList<Reviewproduct>();
            for (Reviewproduct reviewproductListReviewproductToAttach : product.getReviewproductList()) {
                reviewproductListReviewproductToAttach = em.getReference(reviewproductListReviewproductToAttach.getClass(), reviewproductListReviewproductToAttach.getReviewid());
                attachedReviewproductList.add(reviewproductListReviewproductToAttach);
            }
            product.setReviewproductList(attachedReviewproductList);
            em.persist(product);
            for (Reviewproduct reviewproductListReviewproduct : product.getReviewproductList()) {
                Product oldProductidOfReviewproductListReviewproduct = reviewproductListReviewproduct.getProductid();
                reviewproductListReviewproduct.setProductid(product);
                reviewproductListReviewproduct = em.merge(reviewproductListReviewproduct);
                if (oldProductidOfReviewproductListReviewproduct != null) {
                    oldProductidOfReviewproductListReviewproduct.getReviewproductList().remove(reviewproductListReviewproduct);
                    oldProductidOfReviewproductListReviewproduct = em.merge(oldProductidOfReviewproductListReviewproduct);
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

    public void edit(Product product) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Product persistentProduct = em.find(Product.class, product.getProductid());
            List<Reviewproduct> reviewproductListOld = persistentProduct.getReviewproductList();
            List<Reviewproduct> reviewproductListNew = product.getReviewproductList();
            List<Reviewproduct> attachedReviewproductListNew = new ArrayList<Reviewproduct>();
            for (Reviewproduct reviewproductListNewReviewproductToAttach : reviewproductListNew) {
                reviewproductListNewReviewproductToAttach = em.getReference(reviewproductListNewReviewproductToAttach.getClass(), reviewproductListNewReviewproductToAttach.getReviewid());
                attachedReviewproductListNew.add(reviewproductListNewReviewproductToAttach);
            }
            reviewproductListNew = attachedReviewproductListNew;
            product.setReviewproductList(reviewproductListNew);
            product = em.merge(product);
            for (Reviewproduct reviewproductListOldReviewproduct : reviewproductListOld) {
                if (!reviewproductListNew.contains(reviewproductListOldReviewproduct)) {
                    reviewproductListOldReviewproduct.setProductid(null);
                    reviewproductListOldReviewproduct = em.merge(reviewproductListOldReviewproduct);
                }
            }
            for (Reviewproduct reviewproductListNewReviewproduct : reviewproductListNew) {
                if (!reviewproductListOld.contains(reviewproductListNewReviewproduct)) {
                    Product oldProductidOfReviewproductListNewReviewproduct = reviewproductListNewReviewproduct.getProductid();
                    reviewproductListNewReviewproduct.setProductid(product);
                    reviewproductListNewReviewproduct = em.merge(reviewproductListNewReviewproduct);
                    if (oldProductidOfReviewproductListNewReviewproduct != null && !oldProductidOfReviewproductListNewReviewproduct.equals(product)) {
                        oldProductidOfReviewproductListNewReviewproduct.getReviewproductList().remove(reviewproductListNewReviewproduct);
                        oldProductidOfReviewproductListNewReviewproduct = em.merge(oldProductidOfReviewproductListNewReviewproduct);
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
                Integer id = product.getProductid();
                if (findProduct(id) == null) {
                    throw new NonexistentEntityException("The product with id " + id + " no longer exists.");
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
            Product product;
            try {
                product = em.getReference(Product.class, id);
                product.getProductid();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The product with id " + id + " no longer exists.", enfe);
            }
            List<Reviewproduct> reviewproductList = product.getReviewproductList();
            for (Reviewproduct reviewproductListReviewproduct : reviewproductList) {
                reviewproductListReviewproduct.setProductid(null);
                reviewproductListReviewproduct = em.merge(reviewproductListReviewproduct);
            }
            em.remove(product);
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

    public List<Product> findProductEntities() {
        return findProductEntities(true, -1, -1);
    }

    public List<Product> findProductEntities(int maxResults, int firstResult) {
        return findProductEntities(false, maxResults, firstResult);
    }

    private List<Product> findProductEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Product.class));
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

    public Product findProduct(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Product.class, id);
        } finally {
            em.close();
        }
    }

    public int getProductCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Product> rt = cq.from(Product.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
