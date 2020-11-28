/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author fengpeng
 */
public class Vaccine {
    private String vaccineName;
    private List<Phase> phases;
    private String vaccineType;
    private String detail;
    private Date createdTime;
    private SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

    public Vaccine(String vaccineName, String vaccineType, String detail) {
        this.vaccineName = vaccineName;
        this.vaccineType = vaccineType;
        this.detail = detail;
        this.phases = new ArrayList<>();
        this.createdTime = new Date();
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public List<Phase> getPhases() {
        return phases;
    }

    public void setPhases(List<Phase> phases) {
        this.phases = phases;
    }

    public String getVaccineType() {
        return vaccineType;
    }

    public void setVaccineType(String vaccineType) {
        this.vaccineType = vaccineType;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getCreatedTime() {      
        return ft.format(createdTime);
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return this.vaccineName;
    }
    
    
    
    
    
}
