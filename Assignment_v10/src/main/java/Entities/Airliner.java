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
public class Airliner extends User {
    private String country;
    private Fleet fleet; 


    public Airliner(String country, Fleet fleet, String userName, String password) {
        super(userName, password, "Airliner");
        this.country = country;
        this.fleet = fleet;
    }

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
    
    public void addAirplaneIntoFleet(Airplane airplane) {
        this.fleet.addAirplane(airplane);
    }

    public List<Flight> searchFlightByConditions(String from, String to, String departureTime) {
        List<Flight> flights = new ArrayList<>();
        if (departureTime.equals("")) {
            for (Airplane airplane : fleet.getAirplaneDirectory()) {
                for (Flight flight : airplane.getFlights()) {
                    if (flight.getFrom().equals(from) && flight.getTo().equals(to)) {
                        flights.add(flight);
                    }
                }
            }
        } else {
            for (Airplane airplane : fleet.getAirplaneDirectory()) {
                for (Flight flight : airplane.getFlights()) {
                    if (flight.getFrom().equals(from) && flight.getTo().equals(to) && flight.getDepartureTime().equals(departureTime)) {
                        flights.add(flight);
                    }
                }
            }
        }      
        return flights;
    }
    
    
    
    
}
