/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entity;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fengpeng
 */
public class UserDirectory {
    private List<User> userList;

    public UserDirectory() {
        userList = new ArrayList<>();
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public User searchUserByUserAccount(UserAccount userAccount) {
        for (User user :userList) {
            if (user.getUserAccount() == userAccount) {
                return user;
            }
        }
        return null;
    }
    
    public User searchUserByUserName(String username) {
        for (User user :userList) {
            if (user.getUserAccount().getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
    
    
    
    
    
    
    
}
