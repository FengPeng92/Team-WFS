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
public class TravelOfficeDirectory {
    private List<TravelOffice> travelOfficeDirectory;
    private InitDate initDate;

    public TravelOfficeDirectory() {
        //CustomerDirectory customerDirectory, String userName, String password
        initDate = new InitDate();
        this.travelOfficeDirectory = initDate.getTravelOfficeList();
        

    }

    public List<TravelOffice> getTravelOfficeList() {
        return this.travelOfficeDirectory;
    }

    public TravelOffice searchTravelOfficeByName(String username) {
        TravelOffice travelOffice = null;
        
        for (TravelOffice to : travelOfficeDirectory) {
            if (to.getUserName().equals(username)) {
                travelOffice = to;
                break;
            }
        }
        return travelOffice;
    }
    
    
    
}
