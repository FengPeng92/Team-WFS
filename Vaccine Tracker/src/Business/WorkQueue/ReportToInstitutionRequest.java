/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Entity.User;
import Business.Entity.Vaccine;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fengpeng
 */
public class ReportToInstitutionRequest extends WorkRequest {
    
    private Vaccine vaccine;

    public ReportToInstitutionRequest() {

    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

   
}
