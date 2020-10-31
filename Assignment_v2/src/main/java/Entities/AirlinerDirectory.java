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

    public AirlinerDirectory() {
        //String country, Fleet fleet, String userName, String password, String role
        this.airlinerDirectory = new ArrayList<>();
        
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

    public List<Flight> getAllFligths() {
        List<Flight> allFlight = new ArrayList<>();
        for (Airliner airliner : airlinerDirectory) {
            for (Airplane airplane : airliner.getFleet().getAirplaneDirectory()) {
                for (Flight flight : airplane.getFlights()) {
                    allFlight.add(flight);
                }
            }
        }
        return allFlight;
    }

    public Flight searchFlightByFlightNumber(String flightNumber) {
        List<Flight> allFlight = getAllFligths();
        Flight curFlight = null;
        for (Flight flight :allFlight) {
            if(flight.getFlightNumber().equals(flightNumber)) {
                curFlight = flight;
            }
        }
        return curFlight;
    }

    public void setAirlinerDirectory(List<Airliner> airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }

    public List<Flight> getAllFligthsByCondition(String from, String to, String departureTime) {
        List<Flight> flights = new ArrayList<>();
        if (departureTime.equals("")) {
            for (Airliner airliner : airlinerDirectory) {
                for (Airplane airplane : airliner.getFleet().getAirplaneDirectory()) {
                    for (Flight flight : airplane.getFlights()) {
                        if (flight.getFrom().equals(from) && flight.getTo().equals(to)) {
                            flights.add(flight);
                        }
                    }
                }
            }
        } else {
            for (Airliner airliner : airlinerDirectory) {
                for (Airplane airplane : airliner.getFleet().getAirplaneDirectory()) {
                    for (Flight flight : airplane.getFlights()) {
                        if (flight.getFrom().equals(from) && flight.getTo().equals(to) && flight.getDepartureTime().equals(departureTime)) {
                            flights.add(flight);
                        }
                    }
                }
            }
        }      
        return flights;
    }
    
    
    
}
