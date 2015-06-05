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
 * Created by kinyua on 5/28/15.
 */
@Entity
@Table(name = "pharmacy_myExpiredDrug")
public class ExpiredDrug extends BaseOpenmrsObject implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;

    @Id
    @Column(name="myDrugId")
    private Integer drugId;

    @Id
    @Column(name="unitsExpired")
    private Integer unitsExpired;

    @Id
    @Column(name="dateOfExpiry")
    private Date dateOfExpiry;

    @Id
    @Column(name="dateReported")
    private Date dateReported;

    public Set<ExpiredDrug> getMyExpiredDrugs() {
        return myExpiredDrugs;
    }

    public void setMyExpiredDrugs(Set<ExpiredDrug> myExpiredDrugs) {
        this.myExpiredDrugs = myExpiredDrugs;
    }

    private Set<ExpiredDrug> myExpiredDrugs;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public Integer getUnitsExpired() {
        return unitsExpired;
    }

    public void setUnitsExpired(Integer unitsExpired) {
        this.unitsExpired = unitsExpired;
    }

    public Date getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(Date dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public Date getDateReported() {
        return dateReported;
    }

    public void setDateReported(Date dateReported) {
        this.dateReported = dateReported;
    }


}
