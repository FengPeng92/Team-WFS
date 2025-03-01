/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NormalUserWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Entity.User;
import Business.Role.NormalUserRole;
import Business.UserAccount.UserAccount;
import Business.Util.SendEmail;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author fengpeng
 */
public class UserRegisterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserRegisterJPanel
     */
    private JPanel container;
    private EcoSystem system;
    public UserRegisterJPanel() {
        
    }

    public UserRegisterJPanel(JPanel container, EcoSystem system) {
        initComponents();
        this.container = container;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtRepassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Name: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 122, 34));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 134, 34));

        jLabel3.setText("Username: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 122, 34));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 134, 34));

        jLabel4.setText("Password:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 140, 34));

        jLabel5.setText("Confirm Password: ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, 34));

        jLabel6.setText("Email:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 140, 34));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 134, 34));

        btnRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 115, 43));

        jLabel7.setText("Age:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 122, 34));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 134, 34));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Register.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 34, 142, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/depositphotos_33777219-stock-photo-register-here-sign.jpg"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 280, 150));
        add(txtRepassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 130, 40));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 130, 40));
    }// </editor-fold>//GEN-END:initComponents

    public boolean emailVlidation(String email) {
        /*String regex = "^[a-zA-Z0-9_+&*-] + (?:\\\\.[a-zA-Z0-9_+&*-]\n" +"+ )*@(?:[a-zA-Z0-9-]+\\\\.) + [a-zA-Z]{2, 7}";
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            return true;
        }
        return false;*/
        int check = 0;
         if(email == null) {
             return false;
         }

         if(email.indexOf("@") > 0 && email.indexOf('@') == email.lastIndexOf('@') && email.indexOf('@') < email.length()-1) {
             check += 1;
         }

         if(email.indexOf('.',email.indexOf('@')) > email.indexOf('@')+1 ) {
             check += 1;
         }

         if(email.indexOf('.') < email.indexOf('@')-1 || email.indexOf('.') > email.indexOf('@')+1 ) {
             check += 1;
         }

         if(email.indexOf('@') > 1 ) {
             check += 1;
         }
         
         if(email.endsWith("com") || email.endsWith("org") || email.endsWith("cn") ||email.endsWith("net") || email.endsWith("edu")) {
             check += 1;
         }
         if(check == 5) {
             return true;
         }
         return false;
    }
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        try {
            String username = txtUsername.getText();
            if (system.checkIfUsernameIsUnique(username)) {
                String name = txtName.getText();
            
//                String password = txtPassword.getPassword().toString();
//                String repassword = txtRepassword.getPassword().toString();
                char[] passwordCharArray = txtPassword.getPassword();
                String password = String.valueOf(passwordCharArray);
                char[] repasswordCharArray = txtRepassword.getPassword();
                String repassword = String.valueOf(repasswordCharArray);
                String email = txtEmail.getText();
                int age = Integer.parseInt(txtAge.getText());
                if (emailVlidation(email)) {
                    if (name.equals("") || username.equals("") || password.equals("") || repassword.equals("") || email.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill in all information.");
                    } else {
                        if (password.equals(repassword)) {
                            Enterprise userEnterprise = null;
                            for (Enterprise enterprise : system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()) {
                                if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.People) {
                                    userEnterprise = enterprise;
                                    break;
                                }
                            }

                            Employee employee = userEnterprise.getEmployeeDirectory().createEmployee(name);
                            UserAccount account = userEnterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new NormalUserRole());
                            //system.getUserAccountDirectory().getUserAccountList().add(account);
                            User user = new User(account, email, age);
                            userEnterprise.getUserDirectory().getUserList().add(user);
                            SendEmail send = new SendEmail(email);
                            send.userRegister();
                            JOptionPane.showMessageDialog(null, "Register successfully!");

                            } else {
                                JOptionPane.showMessageDialog(null, "The two passwords you entered did not match.");
                            }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Email is not qualified. "); 
                        }
                } else {
                JOptionPane.showMessageDialog(null, "This userAccount is already existed. ");
            }  
           
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Age must be integer");
            return;
        }
        
    }//GEN-LAST:event_btnRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRepassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
