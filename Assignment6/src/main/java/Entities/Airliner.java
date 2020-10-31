/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author fengpeng
 */
public class Airliner extends User {
    private String country;
    private Fleet fleet; 

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Fleet getFleet() {
        return fleet;
    }

    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
    }


    public Airliner(String country, Fleet fleet, String userName, String password) {
        super(userName, password, "Airliner");
        this.country = country;
        this.fleet = fleet;
    }
    
    
}
