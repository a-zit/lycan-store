/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.model;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DEMO TEST
 */
@Entity
@Table(name = "PAYMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Payment.findAll", query = "SELECT p FROM Payment p")
    , @NamedQuery(name = "Payment.findByPaymentid", query = "SELECT p FROM Payment p WHERE p.paymentid = :paymentid")
    , @NamedQuery(name = "Payment.findByCardid", query = "SELECT p FROM Payment p WHERE p.cardid = :cardid")
    , @NamedQuery(name = "Payment.findByCardowner", query = "SELECT p FROM Payment p WHERE p.cardowner = :cardowner")
    , @NamedQuery(name = "Payment.findByExpmonth", query = "SELECT p FROM Payment p WHERE p.expmonth = :expmonth")
    , @NamedQuery(name = "Payment.findByExpyear", query = "SELECT p FROM Payment p WHERE p.expyear = :expyear")
    , @NamedQuery(name = "Payment.findByCvv", query = "SELECT p FROM Payment p WHERE p.cvv = :cvv")})
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PAYMENTID")
    private Integer paymentid;
    @Size(max = 16)
    @Column(name = "CARDID")
    private String cardid;
    @Size(max = 50)
    @Column(name = "CARDOWNER")
    private String cardowner;
    @Size(max = 2)
    @Column(name = "EXPMONTH")
    private String expmonth;
    @Size(max = 2)
    @Column(name = "EXPYEAR")
    private String expyear;
    @Size(max = 3)
    @Column(name = "CVV")
    private String cvv;
    @JoinColumn(name = "ORDERSID", referencedColumnName = "ORDERSID")
    @ManyToOne
    private Orders ordersid;

    public Payment() {
    }

    public Payment(Integer paymentid) {
        this.paymentid = paymentid;
    }

    public Integer getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(Integer paymentid) {
        this.paymentid = paymentid;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getCardowner() {
        return cardowner;
    }

    public void setCardowner(String cardowner) {
        this.cardowner = cardowner;
    }

    public String getExpmonth() {
        return expmonth;
    }

    public void setExpmonth(String expmonth) {
        this.expmonth = expmonth;
    }

    public String getExpyear() {
        return expyear;
    }

    public void setExpyear(String expyear) {
        this.expyear = expyear;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public Orders getOrdersid() {
        return ordersid;
    }

    public void setOrdersid(Orders ordersid) {
        this.ordersid = ordersid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentid != null ? paymentid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payment)) {
            return false;
        }
        Payment other = (Payment) object;
        if ((this.paymentid == null && other.paymentid != null) || (this.paymentid != null && !this.paymentid.equals(other.paymentid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.model.Payment[ paymentid=" + paymentid + " ]";
    }
    
}
