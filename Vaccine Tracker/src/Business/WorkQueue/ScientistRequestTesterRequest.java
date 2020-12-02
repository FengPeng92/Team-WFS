/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Entity.Vaccine;

/**
 *
 * @author fengpeng
 */
public class ScientistRequestTesterRequest extends WorkRequest{
    
    private Vaccine vaccine;
    private boolean isTested;
    private Enterprise enterprise;

    public ScientistRequestTesterRequest(Vaccine vaccine, Enterprise enterprise) {
        this.vaccine = vaccine;
        this.enterprise = enterprise;
        this.isTested = false;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public boolean isIsTested() {
        return isTested;
    }

    public void setIsTested(boolean isTested) {
        this.isTested = isTested;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    @Override
    public String toString() {
        return this.vaccine.toString();
    }
    
    
    
}
