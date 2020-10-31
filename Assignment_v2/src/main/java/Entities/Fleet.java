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
public class Fleet {
    private List<Airplane> airplaneDirectory;

    public Fleet() {
        this.airplaneDirectory = new ArrayList<>();
    }

    public List<Airplane> getAirplaneDirectory() {
        return airplaneDirectory;
    }

    public void setAirplaneDirectory(List<Airplane> airplaneDirectory) {
        this.airplaneDirectory = airplaneDirectory;
    }
    
    public void addAirplane(Airplane airplane) {
        airplaneDirectory.add(airplane);
    }

    public Airplane searchAirplaneBySerialNumber(int serialNumber) {
        Airplane curAir = null;
        
        for (Airplane airplane : airplaneDirectory) {
            if (airplane.getSerialNumber() == serialNumber) {
                curAir = airplane;
            }
        }
        return curAir;
        
    }
    
    
    
    
    
}
