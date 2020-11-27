/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Entity.Questionary;

/**
 *
 * @author fengpeng
 */
public class VolunteerApplicationRequest extends WorkRequest {
    
    private Questionary questionary;
    private boolean isQualified;
    private String description;

    public VolunteerApplicationRequest(Questionary questionary, boolean isQualified, String description) {
        this.questionary = questionary;
        this.isQualified = isQualified;
        this.description = description;
    }

    public VolunteerApplicationRequest() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    
    
}
