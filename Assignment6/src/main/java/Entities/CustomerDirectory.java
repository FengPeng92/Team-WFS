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
    private InitDate initDate;

    public CustomerDirectory() {
        initDate = new InitDate();
        this.customerDirctory = initDate.getCustomerList();
        

    }
    
    public List<Customer> getCustomerList() {
        return this.customerDirctory;
    }

    public Customer searchCustomerByName(String username) {
        Customer customer = null; 
        for (Customer c : customerDirctory) {
            if (c.getUserName().equals(username)) {
                customer = c;
                break;
            }
        }
        return customer;
    }

    
}
