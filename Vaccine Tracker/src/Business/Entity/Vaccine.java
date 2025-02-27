/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entity;

import Business.Enterprise.Enterprise;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    //private List<Enterprise> hospitalList;
    private Map<Enterprise, Phase> hospitalList;
    private String status;
    //private List<User> userList;
    
    private AnimalDirectory animalDirectory;

    public Vaccine(String vaccineName, String vaccineType, String detail, String status, Date createdTime) {
        this.vaccineName = vaccineName;
        this.vaccineType = vaccineType;
        this.detail = detail;
        this.phases = new ArrayList<>();
        this.hospitalList = new HashMap<>();
        this.createdTime = createdTime;
        this.animalDirectory = new AnimalDirectory();
        this.status = status;
        //this.userList = new ArrayList<>();
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

    public Date getCreatedTime() {
        return this.createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return this.vaccineName;
    }

//    public List<Enterprise> getHospitalList() {
//        return hospitalList;
//    }
//
//    public void setHospitalList(List<Enterprise> hospitalList) {
//        this.hospitalList = hospitalList;
//    }

    public Map<Enterprise, Phase> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(Map<Enterprise, Phase> hospitalList) {
        this.hospitalList = hospitalList;
    }
    
    public AnimalDirectory getAnimalDirectory() {
        return animalDirectory;
    }

    public void setAnimalDirectory(AnimalDirectory animalDirectory) {
        this.animalDirectory = animalDirectory;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
