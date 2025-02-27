/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Entity.User;
import Business.Entity.Vaccine;
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
        jScrollPane1.getViewport().setBackground(new java.awt.Color(255, 255, 255));

        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.system = system;
        jLabel1.setText(enterprise.getName());
        jLabel3.setText(userAccount.getUsername());
    }
    
    public void populateTable(User searchUser) {
        DefaultTableModel dtm=(DefaultTableModel) tableResults.getModel();
        dtm.setRowCount(0);
        
        List<WorkRequest> requests = system.getWorkQueue().getVaccineShootRequestList();
        
        for (WorkRequest workRequest : requests) {
            if (((VaccineShootRequest)workRequest).getUser() == searchUser) {
                Object[] row = new Object[7];
                row[0] = ((VaccineShootRequest)workRequest).getShootingId();
                row[1] = searchUser.getUserAccount();
                row[2] = searchUser.getUserAccount().getEmployee().getName();
                row[3] = ((VaccineShootRequest)workRequest).getVaccine().getVaccineName();
                int index = ((VaccineShootRequest) workRequest).getUser().getPhaseIndex();
                row[4] = ((VaccineShootRequest) workRequest).getVaccine().getPhases().get(index).getName();
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
                int index = ((VaccineShootRequest) workRequest).getUser().getPhaseIndex();
                row[4] = ((VaccineShootRequest) workRequest).getVaccine().getPhases().get(index).getName();
                row[5] = ((VaccineShootRequest) workRequest).getHasAntibody();
                row[6] = ((VaccineShootRequest) workRequest).getShootingStatus();
                dtm.addRow(row);
            }
            
            
        }
    }
    
    public void calculateEffectiveRate(VaccineShootRequest selectedShoot) {
        Vaccine vaccine = selectedShoot.getVaccine();
        int size = vaccine.getPhases().size();
        
        int number = 0;
        int denominator = 0;
        
        
        for (Enterprise enterprise :vaccine.getHospitalList().keySet()) {
            System.out.print("before: " + enterprise.getName() + vaccine.getHospitalList().get(enterprise).getEffectiveRate() + " ");
            System.out.println("before:" + vaccine.getHospitalList().get(enterprise).getNumerator() + " " + vaccine.getHospitalList().get(enterprise).getDenominator());
        } 
        
        for (User user : vaccine.getPhases().get(size-1).getVolunteers()) {
            if (enterprise.getUserDirectory().getUserList().contains(user) && user.isIsTested()) {
                denominator++;
                if (user.isResult()) {
                    number++;
                }
            }      
        }
        System.out.println(number);
        System.out.println(denominator);
        vaccine.getHospitalList().get(enterprise).setNumerator(number);
        vaccine.getHospitalList().get(enterprise).setDenominator(denominator);
//        vaccine.getPhases().get(size-1).setNumerator(number);
//        vaccine.getPhases().get(size-1).setDenominator(denominator);
        double result = (double)number * 100.0/(double)denominator;
        //vaccine.getPhases().get(size-1).setEffectiveRate(result);
        vaccine.getHospitalList().get(enterprise).setEffectiveRate(result);
        
        for (Enterprise enterprise :vaccine.getHospitalList().keySet()) {
            System.out.print("after: " + enterprise.getName() + vaccine.getHospitalList().get(enterprise).getEffectiveRate() + " ");
            System.out.println("after: " + vaccine.getHospitalList().get(enterprise).getNumerator() + " " + vaccine.getHospitalList().get(enterprise).getDenominator());
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
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Username: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 125, 97, 39));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 125, 121, 39));

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 125, -1, 39));

        btnAllVolunteers.setBackground(new java.awt.Color(255, 255, 255));
        btnAllVolunteers.setText("List All Volunteers");
        btnAllVolunteers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllVolunteersActionPerformed(evt);
            }
        });
        add(btnAllVolunteers, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 124, 152, 40));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 219, 879, 209));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Search Results");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 173, 879, 37));

        btnSelect.setBackground(new java.awt.Color(255, 255, 255));
        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });
        add(btnSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 135, 45));

        jLabel6.setText("Username:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 526, 135, 35));
        add(txtSelectUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 523, 139, 41));

        jLabel7.setText("Vaccine: ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 576, 135, 35));
        add(txtSelectedVaccine, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 573, 139, 41));

        jLabel8.setText("Does this person have antibody?");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 523, 344, 41));

        buttonGroup1.add(radioNo);
        radioNo.setText("No");
        add(radioNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(841, 522, -1, 42));

        buttonGroup1.add(radioYes);
        radioYes.setText("Yes");
        add(radioYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 523, 66, 41));

        btnConfirm.setBackground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(797, 598, 97, 46));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 66, 37));

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

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/volunteer1.jpg"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 940, 510));
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
                    selectedShoot.getUser().setResult(true);
                    selectedShoot.setHasTest(true);
                    selectedShoot.getUser().setResult(true);
                    selectedShoot.getUser().setIsTested(true);
                    populateTable(selectedShoot.getUser());
                    calculateEffectiveRate(selectedShoot);
                } else if (radioNo.isSelected()) {
                    selectedShoot.setHasTest(true);
                    selectedShoot.getUser().setResult(false);
                    selectedShoot.getUser().setIsTested(true);
                    selectedShoot.setHasAntibody("No");
                    populateTable(selectedShoot.getUser());
                    calculateEffectiveRate(selectedShoot);
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
    private javax.swing.JLabel jLabel10;
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
