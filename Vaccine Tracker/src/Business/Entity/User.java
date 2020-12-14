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
    private Vaccine vaccine;
    private boolean result;
    private boolean isTested;
    private int phaseIndex = 0;

    public User(UserAccount userAccount, String email, int age) {
        this.userAccount = userAccount;
        this.email = email;
        this.age = age;
        this.vaccine = null;
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

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public int getPhaseIndex() {
        return phaseIndex;
    }

    public void setPhaseIndex(int phaseIndex) {
        this.phaseIndex = phaseIndex;
    }

    public boolean isIsTested() {
        return isTested;
    }

    public void setIsTested(boolean isTested) {
        this.isTested = isTested;
    }
    
    

    

    @Override
    public String toString() {
        return this.userAccount.getUsername();
    }
    
    
    
}
