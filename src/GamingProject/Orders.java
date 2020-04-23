/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GamingProject;

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
@Table(name = "Orders")
@NamedQueries({
    @NamedQuery(name = "Orders.findAll", query = "SELECT o FROM Orders o"),
    @NamedQuery(name = "Orders.findByOrderID", query = "SELECT o FROM Orders o WHERE o.orderID = :orderID"),
    @NamedQuery(name = "Orders.findByPartTotal", query = "SELECT o FROM Orders o WHERE o.partTotal = :partTotal"),
    @NamedQuery(name = "Orders.findByTax", query = "SELECT o FROM Orders o WHERE o.tax = :tax"),
    @NamedQuery(name = "Orders.findByShipping", query = "SELECT o FROM Orders o WHERE o.shipping = :shipping"),
    @NamedQuery(name = "Orders.findByOrderTotal", query = "SELECT o FROM Orders o WHERE o.orderTotal = :orderTotal"),
    @NamedQuery(name = "Orders.findByTrackingNumber", query = "SELECT o FROM Orders o WHERE o.trackingNumber = :trackingNumber")})
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "OrderID")
    @Temporal(TemporalType.TIME)
    private Date orderID;
    @Basic(optional = false)
    @Column(name = "PartTotal")
    private double partTotal;
    @Basic(optional = false)
    @Column(name = "Tax")
    private double tax;
    @Basic(optional = false)
    @Column(name = "Shipping")
    private double shipping;
    @Basic(optional = false)
    @Column(name = "OrderTotal")
    private double orderTotal;
    @Id
    @Basic(optional = false)
    @Column(name = "TrackingNumber")
    private Integer trackingNumber;

    public Orders() {
    }

    public Orders(Integer trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Orders(Integer trackingNumber, double partTotal, double tax, double shipping, double orderTotal) {
        this.trackingNumber = trackingNumber;
        this.partTotal = partTotal;
        this.tax = tax;
        this.shipping = shipping;
        this.orderTotal = orderTotal;
    }

    public Date getOrderID() {
        return orderID;
    }

    public void setOrderID(Date orderID) {
        this.orderID = orderID;
    }

    public double getPartTotal() {
        return partTotal;
    }

    public void setPartTotal(double partTotal) {
        this.partTotal = partTotal;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getShipping() {
        return shipping;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Integer getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(Integer trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trackingNumber != null ? trackingNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.trackingNumber == null && other.trackingNumber != null) || (this.trackingNumber != null && !this.trackingNumber.equals(other.trackingNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Orders[ trackingNumber=" + trackingNumber + " ]";
    }
    
}
