/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VolunteerWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Entity.Vaccine;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VaccineShootRequest;
import java.awt.CardLayout;
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
    private VaccineShootRequest newRequest;
    public RequestTestVaccineJPanel() {
    }

    RequestTestVaccineJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.system = system;
        
        jLabel3.setText(userAccount.getUsername());
        populateInstitution();
    }
    
    //To be Completed
    public void populateHospitalByVaccine() {
        DefaultTableModel dtm =(DefaultTableModel) tableHospital.getModel();
        dtm.setRowCount(0);
        
        for (Enterprise enterprise: system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Hospital) {
                Object[] row = new Object[3];
                row[0] = enterprise;
                
                dtm.addRow(row);
            }
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
        
        for (Enterprise enterprise : system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()) {
            for (Vaccine vaccine : enterprise.getVaccineDirectory().getVaccineList()) {
                Object[] row = new Object[5];
                row[0] = vaccine;
                row[1] = vaccine.getVaccineType();
                row[2] = vaccine.getCreatedTime();
                int size = vaccine.getPhases().size();
                row[3] = vaccine.getPhases().get(size-1).getName();
                row[4] = vaccine.getPhases().get(size-1).getStatus();
                dtm.addRow(row);
            }
        }
    }
    
    public void populateVaccineByName(String name) {
        DefaultTableModel dtm =(DefaultTableModel) tableVaccine.getModel();
        dtm.setRowCount(0);
        
        for (Enterprise enterprise : system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()) {
            for (Vaccine vaccine : enterprise.getVaccineDirectory().getVaccineList()) {
                if (vaccine.getVaccineName().equals(name)) {
                    Object[] row = new Object[5];
                    row[0] = vaccine;
                    row[1] = vaccine.getVaccineType();
                    row[2] = vaccine.getCreatedTime();
                    int size = vaccine.getPhases().size();
                    row[3] = vaccine.getPhases().get(size-1).getName();
                    row[4] = vaccine.getPhases().get(size-1).getStatus();
                    dtm.addRow(row);
                    break;
                }
                
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
            row[2] = vaccine.getCreatedTime();
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
                row[2] = vaccine.getCreatedTime();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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

        setPreferredSize(new java.awt.Dimension(1000, 700));

        jLabel1.setText("Volunteer");

        jLabel2.setText("Welcome: ");

        jLabel3.setText("Volunteer Username");

        jLabel4.setText("Vaccine: ");

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

        jLabel5.setText("Institution: ");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jButton2.setText("Select a Vaccine");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tableHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Hospital", "Address", "Phone"
            }
        ));
        jScrollPane2.setViewportView(tableHospital);

        jButton4.setText("View my appoinment");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Make an appoinment");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnBack.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxInstitution, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                .addComponent(btnSearch)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(95, 95, 95))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxInstitution, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
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
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableHospital.getSelectedRow();
        
        if (selectedRow >= 0) {
            selectedHospital = (Enterprise)tableHospital.getValueAt(selectedRow, 0);
            String shootingId = system.getWorkQueue().getVaccineShootRequestList().size() + selectedHospital.getName();
            
            newRequest = new VaccineShootRequest(selectedVaccine, shootingId);
            system.getWorkQueue().getVaccineShootRequestList().add(newRequest);
            newRequest.setSender(userAccount);
            
            JOptionPane.showMessageDialog(null, "Your appoinment has been booked successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (newRequest == null) {
            JOptionPane.showMessageDialog(null, "Please book an appoinmnet first. ");
        } else {
            TestAppoinmentViewJPanel testAppoinmentViewJPanel = new TestAppoinmentViewJPanel(userProcessContainer, userAccount, organization, enterprise, system, newRequest);
            userProcessContainer.add("TestAppoinmentViewJPanel", testAppoinmentViewJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
       
        
    }//GEN-LAST:event_jButton4ActionPerformed


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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableHospital;
    private javax.swing.JTable tableVaccine;
    private javax.swing.JTextField txtVaccine;
    // End of variables declaration//GEN-END:variables
}
