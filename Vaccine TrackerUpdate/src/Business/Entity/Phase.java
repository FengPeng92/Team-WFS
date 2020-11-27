/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entity;

import Business.UserAccount.UserAccount;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author fengpeng
 */
public class Phase {
    private String name;
    private Date startDate;
    private Date endDate;
    private String description;
    //----------------------------
    private String WHOdescription;
    private double effectiveRate;
    List<UserAccount> volunteers; 
    private String status;
    private SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

    public Phase(String name, String description, String status) {
        this.name = name;
        this.description = description;
        //---------------------------------
        this.WHOdescription = WHOdescription;
        this.status = status;
        this.startDate = new Date();
        this.endDate = null;
        this.volunteers = new ArrayList<>();
        
    }
    
    public String getWHOdescription() {
        return WHOdescription;
    }

    public void setWHOdescription(String WHOdescription) {    
        this.WHOdescription = WHOdescription;
    }
    //--------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return ft.format(startDate);
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return ft.format(endDate);
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getEffectiveRate() {
        return effectiveRate;
    }

    public void setEffectiveRate(double effectiveRate) {
        this.effectiveRate = effectiveRate;
    }

    public List<UserAccount> getVolunteers() {
        return volunteers;
    }

    public void setVolunteers(List<UserAccount> volunteers) {
        this.volunteers = volunteers;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
