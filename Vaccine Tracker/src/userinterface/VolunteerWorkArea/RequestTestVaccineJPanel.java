/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VolunteerWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Entity.User;
import Business.Entity.Vaccine;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VaccineShootRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fengpeng
 */
public class RequestTestVaccineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestTestVaccineJPanel
     */
    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private Vaccine selectedVaccine;
    private Enterprise selectedHospital;
    private WorkRequest newRequest;
    private User selectedUser;
    private SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public RequestTestVaccineJPanel() {
    }

    RequestTestVaccineJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system, User selectedUser) {
        initComponents();
        jScrollPane1.getViewport().setBackground(new java.awt.Color(255, 255, 255));

        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.system = system;
        this.selectedUser = selectedUser;
        
        jLabel3.setText(userAccount.getUsername());
        populateInstitution();
    }
    
    //To be Completed
    public void populateHospitalByVaccine(Vaccine vaccine) {
        DefaultTableModel dtm =(DefaultTableModel) tableHospital.getModel();
        dtm.setRowCount(0);
        
        for (Enterprise enterprise: vaccine.getHospitalList()) {
                Object[] row = new Object[3];
                row[0] = enterprise;
                dtm.addRow(row);
            
        }
    }
    
    public void populateInstitution() {
        boxInstitution.addItem("All Institutions");
        for (Enterprise enterprise: system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Institution) {
                boxInstitution.addItem(enterprise.getName());
            }
        }
    }
    
    public void populateAllVaccine() {
        DefaultTableModel dtm =(DefaultTableModel) tableVaccine.getModel();
        dtm.setRowCount(0);
        
        for (Vaccine vaccine : system.getNetworkList().get(0).getVaccineDirectory().getVaccineList()) {
            //if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Institution) {
                //for (Vaccine vaccine : enterprise.getVaccineDirectory().getVaccineList()) {
            Object[] row = new Object[5];
            row[0] = vaccine;
            row[1] = vaccine.getVaccineType();
            row[2] = ft.format(vaccine.getCreatedTime());
            int size = vaccine.getPhases().size();
            row[3] = vaccine.getPhases().get(size-1).getName();
            row[4] = vaccine.getPhases().get(size-1).getStatus();
            dtm.addRow(row);
                }
            //}
            
        //}
    }
    
    public void populateVaccineByName(String name) {
        DefaultTableModel dtm =(DefaultTableModel) tableVaccine.getModel();
        dtm.setRowCount(0);
        
        for (Vaccine vaccine : system.getNetworkList().get(0).getVaccineDirectory().getVaccineList()) {
                if (vaccine.getVaccineName().equals(name)) {
                    Object[] row = new Object[5];
                    row[0] = vaccine;
                    row[1] = vaccine.getVaccineType();
                    row[2] = ft.format(vaccine.getCreatedTime());
                    int size = vaccine.getPhases().size();
                    row[3] = vaccine.getPhases().get(size-1).getName();
                    row[4] = vaccine.getPhases().get(size-1).getStatus();
                    dtm.addRow(row);
                    break;
                }
            
        }
    }
    
    public void populateVaccineByInstitution(String institutionName) {
        Enterprise selectedEnterprise = system.getNetworkList().get(0).getEnterpriseDirectory().searchEnterpiseByName(institutionName);
        DefaultTableModel dtm =(DefaultTableModel) tableVaccine.getModel();
        dtm.setRowCount(0);
        
        for (Vaccine vaccine : selectedEnterprise.getVaccineDirectory().getVaccineList()) {
            Object[] row = new Object[5];
            row[0] = vaccine;
            row[1] = vaccine.getVaccineType();
            row[2] = ft.format(vaccine.getCreatedTime());
            int size = vaccine.getPhases().size();
            row[3] = vaccine.getPhases().get(size-1).getName();
            row[4] = vaccine.getPhases().get(size-1).getStatus();
            dtm.addRow(row);
        }  
    }
     
    public void populateVaccineByNameAndInstitu(String institutionName, String vaccineName) {
        Enterprise selectedEnterprise = system.getNetworkList().get(0).getEnterpriseDirectory().searchEnterpiseByName(institutionName);
        DefaultTableModel dtm =(DefaultTableModel) tableVaccine.getModel();
        dtm.setRowCount(0);
        
        for (Vaccine vaccine : selectedEnterprise.getVaccineDirectory().getVaccineList()) {
            if (vaccine.getVaccineName().equals(vaccineName)) {
                Object[] row = new Object[5];
                row[0] = vaccine;
                row[1] = vaccine.getVaccineType();
                row[2] = ft.format(vaccine.getCreatedTime());
                int size = vaccine.getPhases().size();
                row[3] = vaccine.getPhases().get(size-1).getName();
                row[4] = vaccine.getPhases().get(size-1).getStatus();
                dtm.addRow(row);
                break;
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

        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVaccine = new javax.swing.JTable();
        txtVaccine = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        boxInstitution = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHospital = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Vaccine: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 121, 103, 31));

        tableVaccine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Vaccine Name", "Vaccine Type", "Create Time", "Phase", "Status"
            }
        ));
        jScrollPane1.setViewportView(tableVaccine);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 163, 810, 211));
        add(txtVaccine, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 118, 108, 38));

        jLabel5.setText("Institution: ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 120, 112, 32));

        add(boxInstitution, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 117, 181, 38));

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 116, -1, 41));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Select a Vaccine");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 392, -1, 41));

        tableHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Hospital"
            }
        ));
        jScrollPane2.setViewportView(tableHospital);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 451, 466, 224));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("View my appoinment");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(764, 628, -1, 47));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Make an appoinment");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(764, 451, -1, 47));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 67, -1, 43));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setText("Volunteer");

        jLabel2.setText("Welcome: ");

        jLabel3.setText("Volunteer Username");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Appointment1.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 370, 230));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String vaccineName = txtVaccine.getText();
        String searchInstitution = boxInstitution.getSelectedItem().toString();
        
        if (searchInstitution.equals("All Institutions") && vaccineName.equals("")) {
            populateAllVaccine();
        } else if (searchInstitution.equals("All Institutions")) {
            populateVaccineByName(vaccineName);
        } else if (vaccineName.equals("")) {
            populateVaccineByInstitution(searchInstitution);
        } else {
            populateVaccineByNameAndInstitu(searchInstitution, vaccineName);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tableVaccine.getSelectedRow();
        
        if (selectedRow >= 0) {
            selectedVaccine = (Vaccine)tableVaccine.getValueAt(selectedRow, 0);
            populateHospitalByVaccine(selectedVaccine);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (selectedUser.getVaccine() != null) {
            JOptionPane.showMessageDialog(null, "You have areadly made an appoinment.");
        } else {
            int selectedRow = tableHospital.getSelectedRow();
        
            if (selectedRow >= 0) {
                selectedHospital = (Enterprise)tableHospital.getValueAt(selectedRow, 0);
                String shootingId = system.getWorkQueue().getVaccineShootRequestList().size() + selectedHospital.getName();

                newRequest = new VaccineShootRequest(selectedVaccine, shootingId, selectedUser, selectedHospital);
                selectedHospital.getUserDirectory().getUserList().add(selectedUser);
                ((VaccineShootRequest)newRequest).setShootingStatus("Request to Shoot");               
                selectedUser.setVaccine(selectedVaccine);
                int size = selectedVaccine.getPhases().size();
                selectedVaccine.getPhases().get(size-1).getVolunteers().add(selectedUser);
                System.out.println(system.getWorkQueue().getVaccineShootRequestList().size() + " request");
                newRequest.setSender(userAccount);
                system.getWorkQueue().getWorkRequestList().add(newRequest);
                JOptionPane.showMessageDialog(null, "Your appoinment has been booked successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Please select a row.");
            }
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (newRequest == null) {
            JOptionPane.showMessageDialog(null, "Please book an appoinmnet first. ");
        } else {
            TestAppoinmentViewJPanel testAppoinmentViewJPanel = new TestAppoinmentViewJPanel(userProcessContainer, userAccount, organization, enterprise, system, newRequest, selectedUser);
            userProcessContainer.add("TestAppoinmentViewJPanel", testAppoinmentViewJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
       
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxInstitution;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableHospital;
    private javax.swing.JTable tableVaccine;
    private javax.swing.JTextField txtVaccine;
    // End of variables declaration//GEN-END:variables
}
