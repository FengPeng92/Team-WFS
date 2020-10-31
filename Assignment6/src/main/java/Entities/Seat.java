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
    
    
    
    
}
