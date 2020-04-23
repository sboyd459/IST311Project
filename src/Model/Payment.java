/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Sydney
 */
@Entity
@Table(name = "Payment")
@NamedQueries({
    @NamedQuery(name = "Payment.findAll", query = "SELECT p FROM Payment p"),
    @NamedQuery(name = "Payment.findByPaymentID", query = "SELECT p FROM Payment p WHERE p.paymentID = :paymentID"),
    @NamedQuery(name = "Payment.findByCreditCardNumber", query = "SELECT p FROM Payment p WHERE p.creditCardNumber = :creditCardNumber"),
    @NamedQuery(name = "Payment.findByExpirationDate", query = "SELECT p FROM Payment p WHERE p.expirationDate = :expirationDate"),
    @NamedQuery(name = "Payment.findByCvp", query = "SELECT p FROM Payment p WHERE p.cvp = :cvp")})
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "PaymentID")
    private Integer paymentID;
    @Id
    @Basic(optional = false)
    @Column(name = "CreditCardNumber")
    private Integer creditCardNumber;
    @Column(name = "ExpirationDate")
    @Temporal(TemporalType.DATE)
    private Date expirationDate;
    @Column(name = "CVP")
    private Integer cvp;

    public Payment() {
    }

    public Payment(Integer creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public Integer getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(Integer paymentID) {
        this.paymentID = paymentID;
    }

    public Integer getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(Integer creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Integer getCvp() {
        return cvp;
    }

    public void setCvp(Integer cvp) {
        this.cvp = cvp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (creditCardNumber != null ? creditCardNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payment)) {
            return false;
        }
        Payment other = (Payment) object;
        if ((this.creditCardNumber == null && other.creditCardNumber != null) || (this.creditCardNumber != null && !this.creditCardNumber.equals(other.creditCardNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Payment[ creditCardNumber=" + creditCardNumber + " ]";
    }
    
}
