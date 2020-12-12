/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Entity.User;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VaccineShootRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fengpeng
 */
public class SearchVolunteerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchVolunteerJPanel
     */
    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private VaccineShootRequest selectedShoot;
    private User searchUser;
    public SearchVolunteerJPanel() {
        initComponents();
    }

    SearchVolunteerJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {      
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.system = system;
    }
    
    public void populateTable(User searchUser) {
        DefaultTableModel dtm=(DefaultTableModel) tableResults.getModel();
        dtm.setRowCount(0);
        
        List<WorkRequest> requests = system.getWorkQueue().getVaccineShootRequestList();
        System.out.println(requests.size());
        
        for (WorkRequest workRequest : requests) {
            if (((VaccineShootRequest)workRequest).getUser() == searchUser) {
                Object[] row = new Object[7];
                row[0] = ((VaccineShootRequest)workRequest).getShootingId();
                row[1] = searchUser.getUserAccount();
                row[2] = searchUser.getUserAccount().getEmployee().getName();
                row[3] = ((VaccineShootRequest)workRequest).getVaccine().getVaccineName();
                int size = ((VaccineShootRequest) workRequest).getVaccine().getPhases().size();
                row[4] = ((VaccineShootRequest) workRequest).getVaccine().getPhases().get(size-1).getName();
                row[5] = ((VaccineShootRequest) workRequest).getHasAntibody();
                row[6] = ((VaccineShootRequest) workRequest).getShootingStatus();
                
                dtm.addRow(row);
            }
        }         
    } 
    
    public void populateTable() {
        DefaultTableModel dtm=(DefaultTableModel) tableResults.getModel();
        dtm.setRowCount(0);
        
        List<WorkRequest> requests = system.getWorkQueue().getVaccineShootRequestList();
        
        for (WorkRequest workRequest : requests) {
            if (enterprise.getUserDirectory().getUserList().contains(((VaccineShootRequest)workRequest).getUser())) {
                Object[] row = new Object[7];
                row[0] = ((VaccineShootRequest)workRequest).getShootingId();
                row[1] = ((VaccineShootRequest)workRequest).getUser().getUserAccount();
                row[2] = ((VaccineShootRequest)workRequest).getUser().getUserAccount().getEmployee().getName();
                row[3] = ((VaccineShootRequest)workRequest).getVaccine().getVaccineName();
                int size = ((VaccineShootRequest) workRequest).getVaccine().getPhases().size();
                row[4] = ((VaccineShootRequest) workRequest).getVaccine().getPhases().get(size-1).getName();
                row[5] = ((VaccineShootRequest) workRequest).getHasAntibody();
                row[6] = ((VaccineShootRequest) workRequest).getShootingStatus();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnAllVolunteers = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableResults = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnSelect = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtSelectUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSelectedVaccine = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        radioNo = new javax.swing.JRadioButton();
        radioYes = new javax.swing.JRadioButton();
        btnConfirm = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 700));

        jLabel4.setText("Username: ");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAllVolunteers.setText("List All Volunteers");
        btnAllVolunteers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllVolunteersActionPerformed(evt);
            }
        });

        tableResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ShootingId", "Username", "Name", "Vaccine", "Phase", "Has Antibody", "Shooting Status"
            }
        ));
        jScrollPane1.setViewportView(tableResults);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Search Results");

        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        jLabel6.setText("Username:");

        jLabel7.setText("Vaccine: ");

        jLabel8.setText("Does this person have antibody?");

        buttonGroup1.add(radioNo);
        radioNo.setText("No");

        buttonGroup1.add(radioYes);
        radioYes.setText("Yes");

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setText("Hospital Name");

        jLabel2.setText("Welcome: ");

        jLabel3.setText("Doctor  Username");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSelectedVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSelectUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(81, 81, 81)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(radioYes, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(radioNo))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAllVolunteers, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(106, 106, 106))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAllVolunteers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSelectUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioNo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioYes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSelectedVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String searchUsername = txtUsername.getText();
        if (searchUsername.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the username.");
        } else {
//            UserAccount searchAccount = system.getUserAccountDirectory().searchAccountByUsername(searchUsername);
//            System.out.println(searchAccount.getUsername());
            //User searchUser = system.getUserDirectory().searchUserByUserAccount(userAccount)
//            System.out.println(searchUsername);
//            UserAccount searchAccount = system.getUserAccountDirectory().searchAccountByUsername(searchUsername);
//            System.out.println(searchAccount);
            searchUser = enterprise.getUserDirectory().searchUserByUserName(searchUsername);
            System.out.println(searchUser);
            if (searchUser == null) {
//                DefaultTableModel dtm=(DefaultTableModel) tableResults.getModel();
//                dtm.setRowCount(0);
                JOptionPane.showMessageDialog(null, "No search results");
            } else {
                populateTable(searchUser);
            }
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAllVolunteersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllVolunteersActionPerformed
        // TODO add your handling code here:、
        populateTable();
    }//GEN-LAST:event_btnAllVolunteersActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableResults.getSelectedRow();
        List<WorkRequest> requests = system.getWorkQueue().getVaccineShootRequestList();
        
        
        if (selectedRow >= 0) {
            String shootingId = (String) tableResults.getValueAt(selectedRow, 0);
            for (WorkRequest workRequest : requests) {
                if (((VaccineShootRequest) workRequest).getShootingId().equals(shootingId)) {
                    selectedShoot = (VaccineShootRequest)workRequest;
                    break;
                }
            }
            
            txtSelectUsername.setText(selectedShoot.getUser().getUserAccount().getUsername());
            txtSelectedVaccine.setText(selectedShoot.getVaccine().getVaccineName());
            
            if (selectedShoot.isHasTest()) {
               
               if (selectedShoot.getHasAntibody().equals("Yes")) {
                   radioYes.setSelected(true);                  
               } else {
                   radioNo.setSelected(true);
               }
            }
//            if (radioYes.isSelected()) {
//                selectedShoot.setHasAntibody("Yes");
//                populateTable(selectedShoot.getSender());
//            } else if (radioNo.isSelected()) {
//                selectedShoot.setHasAntibody("No");
//                populateTable(selectedShoot.getSender());
//            } else {
//                JOptionPane.showMessageDialog(null, "Please select a radio button");
//            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Please selected a row");
        }
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        if (selectedShoot == null) {
            JOptionPane.showMessageDialog(null, "Please selected a volunteer first.");
        } else if (selectedShoot.getShootingStatus().equals("Finished")) {
            if (selectedShoot.isHasTest()) {
                if (selectedShoot.getHasAntibody().equals("Yes")) {
                   radioYes.setSelected(true);                  
               } else {
                   radioNo.setSelected(true);
               }
                JOptionPane.showMessageDialog(null, "This person has been tested.");
            } else {
                if (radioYes.isSelected()) {
                    selectedShoot.setHasAntibody("Yes");
                    selectedShoot.setHasTest(true);
                    populateTable(selectedShoot.getUser());
                } else if (radioNo.isSelected()) {
                    selectedShoot.setHasTest(true);
                    selectedShoot.setHasAntibody("No");
                    populateTable(selectedShoot.getUser());
                } else {
                    JOptionPane.showMessageDialog(null, "Please selected Yes or No.");
                }            
               
            }
        } else {
            JOptionPane.showMessageDialog(null, "This volunteer hasn't gotten vaccine yet.");
        }
    }//GEN-LAST:event_btnConfirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllVolunteers;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSelect;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioNo;
    private javax.swing.JRadioButton radioYes;
    private javax.swing.JTable tableResults;
    private javax.swing.JTextField txtSelectUsername;
    private javax.swing.JTextField txtSelectedVaccine;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
