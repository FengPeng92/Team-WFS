/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author fengpeng
 */
public class Flight {
    private String flightNumber;
    private String from;
    private String to;
    private Date departureTime;
    private Date arriveTime;
    private List<Seat> seats;
    private double price;
    SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

    public Flight(String flightNumber, String from, String to, Date departureTime, Date arriveTime, double price) {
        this.flightNumber = flightNumber;
        this.from = from;
        this.to = to;
        this.departureTime = departureTime;
        this.arriveTime = arriveTime;
        this.price = price;
        this.seats = new ArrayList<>();
        
        initSeats();
    }
    
    public void initSeats() {
        //int row, int column, String location, Flight flight, boolean isAvailable, Customer customer
        for (int col = 1; col <= 2; col++) {
            for (int row = 1; row <= 25; row++) {
                Seat leftSeat = new Seat(row, col, "left", this, true, null);
                Seat middleSeat = new Seat(row, col, "middle", this, true, null);
                Seat rightSeat = new Seat(row, col, "right", this, true, null);
                
                seats.add(leftSeat);
                seats.add(middleSeat);
                seats.add(rightSeat);
            }
        }
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureTime() {
        return ft.format(departureTime);
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public String getArriveTime() {
        return ft.format(arriveTime);
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Seat findSeat(int row, int col, String location) {
        Seat curSeat = null;
        for (Seat seat : seats) {
            if (seat.getRow() == row && seat.getColumn() == col && seat.getLocation().equals(location)) {
                curSeat = seat;
                break;
            }
        }
        return curSeat;
    }

    public int findRestSeats() {
        int num = 0;
        for (Seat seat : seats) {
            if (seat.isIsAvailable()) {
                num++;
            }
        }
        return num;
    }
    
    
    
    
    
    
    
}
