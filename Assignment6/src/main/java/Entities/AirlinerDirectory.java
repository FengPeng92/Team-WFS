/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fengpeng
 */
public class AirlinerDirectory {
    
    private List<Airliner> airlinerDirectory;
    private InitDate initDate;

    public AirlinerDirectory() {
        //String country, Fleet fleet, String userName, String password, String role
        initDate = new InitDate();
        this.airlinerDirectory = initDate.getAirlinerList();
        
    }

    public List<Airliner> getAirlinerList() {
        return this.airlinerDirectory;
    }
    
    public void setAirlinerList(List<Airliner> airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }

    public void addAirliner(Airliner addairliner){
        airlinerDirectory.add(addairliner);
        return;
    }
    
    public Airliner searchAirlinerByName(String username) {
        Airliner airliner = null;
        for (Airliner a : airlinerDirectory) {
            if (a.getUserName().equals(username)) {
                airliner = a;
                break;
            }
        }
        return airliner;
    }
    
    
}
