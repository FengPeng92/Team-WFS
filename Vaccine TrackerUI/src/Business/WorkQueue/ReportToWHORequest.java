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
public class ReportToWHORequest extends WorkRequest {
    private Vaccine vaccine;
    private boolean isChecked;

    public ReportToWHORequest(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public boolean isIsChecked() {
        return isChecked;
    }

    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }
    
    
    
}
