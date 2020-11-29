/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Entity.Questionary;
import Business.Entity.User;

/**
 *
 * @author fengpeng
 */
public class VolunteerApplicationRequest extends WorkRequest {
    
    private Questionary questionary;
    private boolean isQualified;
    private String description;
    private User user;

    public VolunteerApplicationRequest(Questionary questionary, boolean isQualified, String description) {
        
        this.questionary = questionary;
        this.isQualified = isQualified;
        this.description = description;
    }

    public Questionary getQuestionary() {
        return questionary;
    }

    public void setQuestionary(Questionary questionary) {
        this.questionary = questionary;
    }

    public boolean isIsQualified() {
        return isQualified;
    }

    public void setIsQualified(boolean isQualified) {
        this.isQualified = isQualified;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
    
    
    
}
