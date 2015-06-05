package org.openmrs.module.pharmacy;

import org.openmrs.BaseOpenmrsObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Created by kinyua on 5/27/15.
 */
@Entity
@Table(name="pharmacy_myDrugOrder")
public class DrugOrder extends BaseOpenmrsObject implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="myDrugOrderId")
    private  Integer id;

    @Id
    @Column(name="unitsDelivered")
    private String unitsDelivered;

    @Id
    @Column(name="dateOfDelivery")
    private Date dateOfDelivery;

    @Id
    @Column(name="dateOfExpiry")
    private Date dateOfExpiry;

    @Id
    @Column(name="myDrugId")
    private  Integer myDrugId;

    public Set<DrugOrder> getMyDrugOrders() {
        return myDrugOrders;
    }

    public void setMyDrugOrders(Set<DrugOrder> myDrugOrders) {
        this.myDrugOrders = myDrugOrders;
    }

    private Set<DrugOrder> myDrugOrders;

    public Integer getMyDrugId() {
        return myDrugId;
    }

    public void setMyDrugId(Integer myDrugId) {
        this.myDrugId = myDrugId;
    }

    public String getUnitsDelivered() {
        return unitsDelivered;
    }

    public void setUnitsDelivered(String unitsDelivered) {
        this.unitsDelivered = unitsDelivered;
    }

    public Date getDateOfDelivery() {
        return dateOfDelivery;
    }

    public void setDateOfDelivery(Date dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    public Date getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(Date dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id= id;
    }

}
