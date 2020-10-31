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
public class Seat {
    private int row;
    private int column;
    private String location;
    private Flight flight;
    private boolean isAvailable;
    private Customer customer;

    public Seat(int row, int column, String location, Flight flight, boolean isAvailable, Customer customer) {
        this.row = row;
        this.column = column;
        this.location = location;
        this.flight = flight;
        this.isAvailable = isAvailable;
        this.customer = customer;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return flight.getFlightNumber();
    }
    
    
    
    
    
    
    
}
