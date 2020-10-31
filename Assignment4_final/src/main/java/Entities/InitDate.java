/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author fengpeng
 */
public class InitDate {
    
    private List<Airliner> airlinerList  = new ArrayList<>();
    private List<Customer> customerList = new ArrayList<>();
    private List<TravelOffice> travelOfficeList = new ArrayList<>();
    SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");   

    
    public InitDate() {
        try {
            
            //Airliner airliner, String serialNumber, String model, String manudaturer
            
            //airlinerList;
            //String country, Fleet fleet, String userName, String password
            Airliner airliner1 = new Airliner("China", new Fleet(), "Air China", "123456");
            Airliner airliner2 = new Airliner("America", new Fleet(), "Air America", "123456");
            Airliner airliner3 = new Airliner("Canada", new Fleet(), "Air Canada", "123456");
            airlinerList.add(airliner1);
            airlinerList.add(airliner2);
            airlinerList.add(airliner3);

            TravelOffice TravelOffice1 = new TravelOffice(new CustomerDirectory(), "Office A", "123456");
            TravelOffice TravelOffice2 = new TravelOffice(new CustomerDirectory(), "Office B", "123456");
            TravelOffice TravelOffice3 = new TravelOffice(new CustomerDirectory(), "Office C", "123456");
            travelOfficeList.add(TravelOffice1);
            travelOfficeList.add(TravelOffice2);
            travelOfficeList.add(TravelOffice3);
            
            
            Airplane airplane1 = new Airplane(airliner1, 1, "aaa", "AAA");
            Airplane airplane2 = new Airplane(airliner1, 2, "bbb", "BBB");
            Airplane airplane3 = new Airplane(airliner1, 3, "ccc", "CCC");
            Airplane airplane4 = new Airplane(airliner2, 4, "ddd", "DDD");
            Airplane airplane5 = new Airplane(airliner2, 5, "eee", "EEE");
            Airplane airplane6 = new Airplane(airliner2, 6, "fff", "FFF");
            Airplane airplane7 = new Airplane(airliner3, 7, "ggg", "GGG");
            Airplane airplane8 = new Airplane(airliner3, 8, "xxx", "XXX");
            Airplane airplane9 = new Airplane(airliner3, 9, "zzz", "ZZZ");
            airliner1.getFleet().addAirplane(airplane1);
            airliner1.getFleet().addAirplane(airplane2);
            airliner1.getFleet().addAirplane(airplane3);
            airliner2.getFleet().addAirplane(airplane4);
            airliner2.getFleet().addAirplane(airplane5);
            airliner2.getFleet().addAirplane(airplane6);
            airliner3.getFleet().addAirplane(airplane7);
            airliner3.getFleet().addAirplane(airplane8);
            airliner3.getFleet().addAirplane(airplane9);

            //
            //TravelOffice travelOffice, String gender, int age, String userName, String password
            Customer customer1 = new Customer(TravelOffice1, "Male", 23, "Feng", "123456");
            Customer customer2 = new Customer(TravelOffice2, "Female", 23, "Mary", "123456");
            Customer customer3 = new Customer(TravelOffice3, "Male", 23, "Andy", "123456");
            customerList.add(customer1);
            customerList.add(customer2);
            customerList.add(customer3);
            TravelOffice1.getCustomerDirectory().addNewCustomer(customer1);
            TravelOffice2.getCustomerDirectory().addNewCustomer(customer2);
            TravelOffice3.getCustomerDirectory().addNewCustomer(customer3);
       

            //String flightNumber, String from, String to, Date departureTime, Date arriveTime, double price
            //String departureTime = "08/12/2020";
            //String arriveTime = "08/13/2020";
        
            //int row, int column, String location, Flight flight, boolean isAvailable, Customer customer
            Flight flight1 = new Flight("a1", "Boston", "Beijing", ft.parse("2020-10-22"), ft.parse("2020-10-23"), 320.0);
            Flight flight2 = new Flight("a2", "Boston", "Beijing", ft.parse("2020-10-22"), ft.parse("2020-10-23"), 1000.0);
            Flight flight3 = new Flight("a3", "Beijing", "Shanghai", ft.parse("2020-10-20"), ft.parse("2020-10-21"), 500.0);
            Flight flight4 = new Flight("a4", "Beijing", "Wuhan", ft.parse("2020-10-20"), ft.parse("2020-10-20"), 300.0);
            Flight flight5 = new Flight("a5", "Wuhan", "Beijing", ft.parse("2020-10-21"), ft.parse("2020-10-21"), 400.0);
            Flight flight6 = new Flight("a6", "Boston", "Wuhan", ft.parse("2020-10-22"), ft.parse("2020-10-24"), 430.0);
            Flight flight7 = new Flight("a7", "Chengdu", "Beijing", ft.parse("2020-10-21"), ft.parse("2020-10-21"), 540.0);
            Flight flight8 = new Flight("a8", "Guangzhou", "Beijing", ft.parse("2020-10-19"), ft.parse("2020-10-20"), 550.0);
            Flight flight9 = new Flight("a9", "Shanghai", "Beijing", ft.parse("2020-10-24"), ft.parse("2020-10-25"), 660.0);
            Flight flight10 = new Flight("a10", "Shanghai", "Beijing", ft.parse("2020-10-26"), ft.parse("2020-10-27"), 600.0);
            Flight flight11 = new Flight("a11", "Boston", "Guangzhou", ft.parse("2020-10-25"), ft.parse("2020-10-25"), 520.0);
            Flight flight12 = new Flight("a12", "Boston", "Shanghai", ft.parse("2020-10-22"), ft.parse("2020-10-23"), 800.0);
            
            Seat seat1 = new Seat(12, 1, "middle", flight1, true, customer1);
            Seat seat2 = new Seat(10, 1, "left", flight2, true, customer1);
            Seat seat3 = new Seat(1, 1, "right", flight3, true, customer1);
            Seat seat4 = new Seat(2, 1, "left", flight4, true, customer2);
            Seat seat5 = new Seat(20, 2, "right", flight5, true, customer2);
            Seat seat6 = new Seat(15, 1, "middle", flight6, true, customer2);
            Seat seat7 = new Seat(16, 2, "left", flight7, true, customer3);
            Seat seat8 = new Seat(17, 1, "right", flight1, true, customer3);
            Seat seat9 = new Seat(5, 2, "middle", flight2, true, customer3);
            
            
            customer1.addSeat(seat1);
            customer1.addSeat(seat2);
            customer1.addSeat(seat3);
            customer2.addSeat(seat4);
            customer2.addSeat(seat5);
            customer2.addSeat(seat6);
            customer3.addSeat(seat7);
            customer3.addSeat(seat8);
            customer3.addSeat(seat9);
            
            airplane1.addFlight(flight1); 
            airplane2.addFlight(flight2);
            airplane3.addFlight(flight3);
            airplane4.addFlight(flight4);
            airplane5.addFlight(flight5);
            airplane6.addFlight(flight6);
            airplane7.addFlight(flight7);
            airplane8.addFlight(flight8);
            airplane9.addFlight(flight9);
            airplane1.addFlight(flight10);
            airplane2.addFlight(flight11);
            airplane3.addFlight(flight12);
            
        } catch(Exception e) {
            
        }  
    }

    public List<Airliner> getAirlinerList() {
        return airlinerList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public List<TravelOffice> getTravelOfficeList() {
        return travelOfficeList;
    }
    
    
    
   
}
