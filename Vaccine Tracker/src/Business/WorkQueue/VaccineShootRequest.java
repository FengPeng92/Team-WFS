/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Entity.Vaccine;

/**
 *
 * @author fengpeng
 */
public class VaccineShootRequest extends WorkRequest {
    private String shootingId;
    private Vaccine vaccine;
    private String status;
    private String hasAntibody;

    public VaccineShootRequest(Vaccine vaccine, String shootingId) {
        super();
        this.vaccine = vaccine;
        this.status = "Request to Shoot";
        this.shootingId = shootingId;
        this.hasAntibody = "Not tested";
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    
    
    
    
    
    @Override
    public String toString() {
        return shootingId;
    }
    
    
    
    
    
}
