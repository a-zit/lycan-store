/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DEMO TEST
 */
@Entity
@Table(name = "REVIEW")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Review.findAll", query = "SELECT r FROM Review r")
    , @NamedQuery(name = "Review.findByReviewid", query = "SELECT r FROM Review r WHERE r.reviewid = :reviewid")
    , @NamedQuery(name = "Review.findByReviewtopic", query = "SELECT r FROM Review r WHERE r.reviewtopic = :reviewtopic")
    , @NamedQuery(name = "Review.findByDescription", query = "SELECT r FROM Review r WHERE r.description = :description")
    , @NamedQuery(name = "Review.findByReviewtime", query = "SELECT r FROM Review r WHERE r.reviewtime = :reviewtime")})
public class Review implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "REVIEWID")
    private Integer reviewid;
    @Size(max = 50)
    @Column(name = "REVIEWTOPIC")
    private String reviewtopic;
    @Size(max = 250)
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "REVIEWTIME")
    @Temporal(TemporalType.DATE)
    private Date reviewtime;
    @JoinColumn(name = "PRODUCTID", referencedColumnName = "PRODUCTID")
    @ManyToOne
    private Product productid;

    public Review() {
    }

    public Review(Integer reviewid) {
        this.reviewid = reviewid;
    }

    public Integer getReviewid() {
        return reviewid;
    }

    public void setReviewid(Integer reviewid) {
        this.reviewid = reviewid;
    }

    public String getReviewtopic() {
        return reviewtopic;
    }

    public void setReviewtopic(String reviewtopic) {
        this.reviewtopic = reviewtopic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReviewtime() {
        return reviewtime;
    }

    public void setReviewtime(Date reviewtime) {
        this.reviewtime = reviewtime;
    }

    public Product getProductid() {
        return productid;
    }

    public void setProductid(Product productid) {
        this.productid = productid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reviewid != null ? reviewid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Review)) {
            return false;
        }
        Review other = (Review) object;
        if ((this.reviewid == null && other.reviewid != null) || (this.reviewid != null && !this.reviewid.equals(other.reviewid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.model.Review[ reviewid=" + reviewid + " ]";
    }
    
}
