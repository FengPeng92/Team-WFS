/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.DoctorRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fengpeng
 */
public class ManageDoctorsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDoctorsJPanel
     */
    
    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private UserAccount selectedDoctor;
    public ManageDoctorsJPanel() {
        initComponents();
    }

    ManageDoctorsJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {
        
        initComponents();
        jScrollPane1.getViewport().setBackground(new java.awt.Color(255, 255, 255));

        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.system = system;
        
        jLabel1.setText(enterprise.getName());
        jLabel3.setText(userAccount.getUsername());
        
        populateTable();
    }

    
    public void populateTable() {
        DefaultTableModel dtm=(DefaultTableModel) tableDoctors.getModel();
        dtm.setRowCount(0);
        
        for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
            if (userAccount.getRole() instanceof DoctorRole) {
                Object[] row = new Object[3];
                row[0] = userAccount;
                row[1] = userAccount.getEmployee().getName();
                row[2] = userAccount.getPassword();
                
                dtm.addRow(row);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableDoctors = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAddName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAddUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAddPassword = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUpdateName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtUpdateUsername = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtUpdatePassword = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnSelect = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDoctors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Doctor Username", "Doctor Name", "Password"
            }
        ));
        jScrollPane1.setViewportView(tableDoctors);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 155, 794, 209));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Add a New Doctor ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 397, 228, 36));

        jLabel5.setText("Name: ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 465, 108, 34));
        add(txtAddName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 465, 102, 34));

        jLabel6.setText("Username: ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 515, 108, 34));
        add(txtAddUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 515, 102, 34));

        jLabel7.setText("Password: ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 567, 108, 34));
        add(txtAddPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 567, 102, 34));

        btnCreate.setBackground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 617, 228, 47));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Update a Doctor Information ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 399, 228, 36));

        jLabel9.setText("Name: ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 465, 108, 34));

        txtUpdateName.setEnabled(false);
        add(txtUpdateName, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 465, 102, 34));

        jLabel10.setText("Username: ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 515, 108, 34));

        txtUpdateUsername.setEnabled(false);
        add(txtUpdateUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 515, 102, 34));

        jLabel11.setText("Password: ");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 567, 108, 34));

        txtUpdatePassword.setEnabled(false);
        add(txtUpdatePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 567, 102, 34));

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 617, 95, 47));

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 617, 95, 47));

        btnSelect.setBackground(new java.awt.Color(255, 255, 255));
        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });
        add(btnSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, 95, 47));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Doctors Information");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 118, 794, 28));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 73, -1, 40));

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setText("Hospital Name");

        jLabel2.setText("Welcome: ");

        jLabel3.setText("HospitalAdmin  Username");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/u=2842511349,2106666337&fm=26&gp=0.jpg"))); // NOI18N
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 590, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableDoctors.getSelectedRow(); 
        
        if (selectedRow >= 0) {
            selectedDoctor = (UserAccount) tableDoctors.getValueAt(selectedRow, 0);
            txtUpdateName.setText(selectedDoctor.getEmployee().getName());
            txtUpdateUsername.setText(selectedDoctor.getUsername());
            txtUpdatePassword.setText(selectedDoctor.getPassword());
            
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtUpdateName.setEnabled(true);
        txtUpdateUsername.setEnabled(true);
        txtUpdatePassword.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        
        if (!txtUpdateName.getText().equals("") && !txtUpdateUsername.getText().equals("") && !txtUpdatePassword.getText().equals("")) {
            String username = txtUpdateUsername.getText();
            if (system.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
                selectedDoctor.getEmployee().setName(txtUpdateName.getText());
                selectedDoctor.setUsername(txtUpdateUsername.getText());
                selectedDoctor.setPassword(txtUpdatePassword.getText());
                txtUpdateName.setEnabled(false);
                txtUpdateUsername.setEnabled(false);
                txtUpdatePassword.setEnabled(false);
                populateTable();
                JOptionPane.showMessageDialog(null, "Update successfully");
            } else {
                JOptionPane.showMessageDialog(null, "UserAccount is already existed");
            }           
        } else {
            JOptionPane.showMessageDialog(null, "Please fill in all updated information");
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String username = txtAddUsername.getText();
        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            String name = txtAddName.getText();
        
            String password = txtAddPassword.getText();
            if (!name.equals("") && !username.equals("") && !password.equals("")) {
                Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
                UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new DoctorRole());
                populateTable();
                txtAddName.setText("");
                txtAddUsername.setText("");
                txtAddPassword.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Please fill in all updated information");
            }
        } else {
            JOptionPane.showMessageDialog(null, "UserAccount is already existed");
        }
        
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDoctors;
    private javax.swing.JTextField txtAddName;
    private javax.swing.JTextField txtAddPassword;
    private javax.swing.JTextField txtAddUsername;
    private javax.swing.JTextField txtUpdateName;
    private javax.swing.JTextField txtUpdatePassword;
    private javax.swing.JTextField txtUpdateUsername;
    // End of variables declaration//GEN-END:variables
}
