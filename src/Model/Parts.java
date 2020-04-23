/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Sydney
 */
@Entity
@Table(name = "Parts")
@NamedQueries({
    @NamedQuery(name = "Parts.findAll", query = "SELECT p FROM Parts p"),
    @NamedQuery(name = "Parts.findByPartID", query = "SELECT p FROM Parts p WHERE p.partID = :partID"),
    @NamedQuery(name = "Parts.findByPartName", query = "SELECT p FROM Parts p WHERE p.partName = :partName"),
    @NamedQuery(name = "Parts.findByPartDescription", query = "SELECT p FROM Parts p WHERE p.partDescription = :partDescription"),
    @NamedQuery(name = "Parts.findByInventory", query = "SELECT p FROM Parts p WHERE p.inventory = :inventory")})
public class Parts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "PartID")
    private int partID;
    @Id
    @Basic(optional = false)
    @Column(name = "PartName")
    private String partName;
    @Basic(optional = false)
    @Column(name = "PartDescription")
    private String partDescription;
    @Basic(optional = false)
    @Column(name = "Inventory")
    private int inventory;

    public Parts() {
    }

    public Parts(String partName) {
        this.partName = partName;
    }

    public Parts(String partName, int partID, String partDescription, int inventory) {
        this.partName = partName;
        this.partID = partID;
        this.partDescription = partDescription;
        this.inventory = inventory;
    }

    public int getPartID() {
        return partID;
    }

    public void setPartID(int partID) {
        this.partID = partID;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partName != null ? partName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parts)) {
            return false;
        }
        Parts other = (Parts) object;
        if ((this.partName == null && other.partName != null) || (this.partName != null && !this.partName.equals(other.partName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Parts[ partName=" + partName + " ]";
    }
    
}
