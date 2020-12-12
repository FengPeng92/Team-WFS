/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Entity.User;
import Business.Entity.Vaccine;

/**
 *
 * @author fengpeng
 */
public class VaccineShootRequest extends WorkRequest {
    private String shootingId;
    private Vaccine vaccine;
    private String shootingStatus;
    private String hasAntibody;
    private User user;
    private boolean hasTest;
    private Enterprise hospital;

    public VaccineShootRequest(Vaccine vaccine, String shootingId, User user, Enterprise hospital) {
        super();
        this.vaccine = vaccine;
        this.shootingStatus = "Request to Shoot";
        this.shootingId = shootingId;
        this.hasAntibody = "Not tested";
        this.user = user;
        this.hasTest = false;
        this.hospital = hospital;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public String getShootingStatus() {
        return shootingStatus;
    }

    public void setShootingStatus(String shootingStatus) {
        this.shootingStatus = shootingStatus;
    }

    public String getHasAntibody() {
        return hasAntibody;
    }

    public void setHasAntibody(String hasAntibody) {
        this.hasAntibody = hasAntibody;
    }

    public String getShootingId() {
        return shootingId;
    }

    public void setShootingId(String shootingId) {
        this.shootingId = shootingId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isHasTest() {
        return hasTest;
    }

    public void setHasTest(boolean hasTest) {
        this.hasTest = hasTest;
    }

    public Enterprise getHospital() {
        return hospital;
    }

    public void setHospital(Enterprise hospital) {
        this.hospital = hospital;
    }
    
    @Override
    public String toString() {
        return shootingId;
    }
     
}
