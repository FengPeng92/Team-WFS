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
public class Customer extends User{
    private TravelOffice travelOffice;    
    private String gender;
    private int age;
    private List<Seat> mySeats;

    public Customer(TravelOffice travelOffice, String gender, int age, String userName, String password) {
        super(userName, password, "Customer");
        mySeats = new ArrayList<>();
        this.travelOffice = travelOffice;
        this.gender = gender;
        this.age = age;
    }

    public TravelOffice getTravelOffice() {
        return travelOffice;
    }

    public void setTravelOffice(TravelOffice travelOffice) {
        this.travelOffice = travelOffice;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Seat> getMySeats() {
        return mySeats;
    }

    public void setMySeats(List<Seat> mySeats) {
        this.mySeats = mySeats;
    }
    
    public void addSeat(Seat seat) {
        seat.setIsAvailable(false);
        mySeats.add(seat);
    }
    
    public void deleteSeat(Seat seat) {
        seat.setIsAvailable(true);
        mySeats.remove(seat);
    }
    
    
    
    
    
}
