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
@Table(name = "pharmacy_myDispensedDrug")
public class DispenseDrug extends BaseOpenmrsObject implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="dispenseId")
    private  Integer id;
    @Id
    @Column(name="patient_id")
    private Integer patientID;

    @Id
    @Column(name="dateOfDispense")
    private Date dateOfDispense;

    @Id
    @Column(name="myDrugId")
    private Integer drugId;

    @Id
    @Column(name="unitsDispensed")
    private int unitsDispensed;

    @Id
    @Column(name="transactionId")
    private Integer transactionId;

    @Id
    @Column(name="paymentStatus")
    private boolean paymentStatus;

    @Id
    @Column(name="comments")
    private String comments;

    private Set<DispenseDrug> myDispensedDrugs;

    public Set<DispenseDrug> getMyDispensedDrugs() {
        return myDispensedDrugs;
    }

    public void setMyDispensedDrugs(Set<DispenseDrug> myDispensedDrugs) {
        this.myDispensedDrugs = myDispensedDrugs;
    }

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }

    public Date getDateOfDispense() {
        return dateOfDispense;
    }

    public void setDateOfDispense(Date dateOfDispense) {
        this.dateOfDispense = dateOfDispense;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public int getUnitsDispensed() {
        return unitsDispensed;
    }

    public void setUnitsDispensed(int unitsDispensed) {
        this.unitsDispensed = unitsDispensed;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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
