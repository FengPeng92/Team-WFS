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
public class Airplane {
    private List<Flight> flights;
    private Airliner airliner;
    private String serialNumber;
    private String model;
    private String manudaturer;

    public Airplane(Airliner airliner, String serialNumber, String model, String manudaturer) {
        flights = new ArrayList<>();
        this.airliner = airliner;
        this.serialNumber = serialNumber;
        this.model = model;
        this.manudaturer = manudaturer;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public Airliner getAirliner() {
        return airliner;
    }

    public void setAirliner(Airliner airliner) {
        this.airliner = airliner;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManudaturer() {
        return manudaturer;
    }

    public void setManudaturer(String manudaturer) {
        this.manudaturer = manudaturer;
    }
    
    
    
    
}
