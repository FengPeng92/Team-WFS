/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fengpeng
 */
public class VaccineDirectory {
    private List<Vaccine> vaccineList;

    public VaccineDirectory() {
        vaccineList = new ArrayList<>();
    }

    public List<Vaccine> getVaccineList() {
        System.out.println("vaccine list");
        return vaccineList;
    }

    public void setVaccineList(List<Vaccine> vaccineList) {
        this.vaccineList = vaccineList;
    }

    public Vaccine searchVaccineByName(String searchVaccine) {
        for (Vaccine vaccine : vaccineList) {
            if (vaccine.getVaccineName().equals(searchVaccine)) {
                return vaccine;
            }
        }       
        return null;
    }
    
    
    
}
