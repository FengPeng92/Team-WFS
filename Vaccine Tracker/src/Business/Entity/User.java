/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entity;

import Business.UserAccount.UserAccount;

/**
 *
 * @author fengpeng
 */
public class User {
    
    private UserAccount userAccount;
    private String email;
    private int age;

    public User(UserAccount userAccount, String email, int age) {
        this.userAccount = userAccount;
        this.email = email;
        this.age = age;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.userAccount.getUsername();
    }
    
    
    
}
