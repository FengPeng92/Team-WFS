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
public class TravelOffice extends User {
    
    private CustomerDirectory customerDirectory;

    public TravelOffice(CustomerDirectory customerDirectory, String userName, String password) {
        super(userName, password, "Travel Office");
        this.customerDirectory = customerDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public void addNewCustomer(Customer newCustomer) {
        customerDirectory.addNewCustomer(newCustomer);
    }
    
    
    
    
}
