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

    public VaccineShootRequest(Vaccine vaccine, String status, String shootingId) {
        this.vaccine = vaccine;
        this.status = status;
        this.shootingId = shootingId;
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

    @Override
    public String toString() {
        return shootingId;
    }
    
    
    
    
    
}
