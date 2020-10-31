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
public class InitDate {
    private List<Airliner> airlinerList  = new ArrayList<>();
    private List<Customer> customerList = new ArrayList<>();
    private List<TravelOffice> travelOfficeList = new ArrayList<>();
    
    public InitDate() {
        //airlinerList;
        Airliner airliner1 = new Airliner("China", null, "Air China", "123456");
        Airliner airliner2 = new Airliner("America", null, "Air America", "123456");
        Airliner airliner3 = new Airliner("Canada", null, "Air Canada", "123456");
        airlinerList.add(airliner1);
        airlinerList.add(airliner2);
        airlinerList.add(airliner3);
        
        TravelOffice TravelOffice1 = new TravelOffice(null, "Office A", "123456");
        TravelOffice TravelOffice2 = new TravelOffice(null, "Office B", "123456");
        travelOfficeList.add(TravelOffice1);
        travelOfficeList.add(TravelOffice2);
        
        //
        //TravelOffice travelOffice, String gender, int age, String userName, String password
        Customer customer1 = new Customer(TravelOffice1, "Male", 23, "Feng", "123456");
        Customer customer2 = new Customer(TravelOffice1, "Female", 23, "Mary", "123456");
        Customer customer3 = new Customer(TravelOffice2, "Male", 23, "Andy", "123456");
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
   
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
