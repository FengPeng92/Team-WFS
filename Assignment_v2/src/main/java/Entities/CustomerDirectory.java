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
public class CustomerDirectory {
    private List<Customer> customerDirctory;

    public CustomerDirectory() {        
        this.customerDirctory = new ArrayList<>();
        

    }
    
    public List<Customer> getCustomerList() {
        return this.customerDirctory;
    }

    public Customer searchCustomerByName(String username, String travelOffice) {
        Customer customer = null; 
        for (Customer c : customerDirctory) {
            if (c.getUserName().equals(username) && c.getTravelOffice().getUserName().equals(travelOffice)) {
                customer = c;
                break;
            }
        }
        return customer;
    }

    public boolean verfyUsername(String username) {
        for (Customer c : customerDirctory) {
            if (c.getUserName().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void addNewCustomer(Customer newCustomer) {
        customerDirctory.add(newCustomer);
    }

    public void setCustomerDirctory(List<Customer> customerDirctory) {
        this.customerDirctory = customerDirctory;
    }
    
    

    
}
