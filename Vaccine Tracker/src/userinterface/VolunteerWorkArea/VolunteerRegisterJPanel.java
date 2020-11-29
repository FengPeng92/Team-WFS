/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VolunteerWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Entity.Questionary;
import Business.Entity.User;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VolunteerApplicationRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.DoctorWorkArea.VaccineShootRequestJPanel;

/**
 *
 * @author fengpeng
 */
public class VolunteerRegisterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VolunteerRegisterJPanel
     */
    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private User user;
    public VolunteerRegisterJPanel() {
        
    }

    public VolunteerRegisterJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system, User user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.system = system;
        this.user = user;
        
        jLabel3.setText(userAccount.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupAlcoholic = new javax.swing.ButtonGroup();
        groupSmoking = new javax.swing.ButtonGroup();
        groupAllergic = new javax.swing.ButtonGroup();
        groupCold = new javax.swing.ButtonGroup();
        groupTest = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        radioAlcoholicYes = new javax.swing.JRadioButton();
        radioAlcoholicNo = new javax.swing.JRadioButton();
        radioSmokingNo = new javax.swing.JRadioButton();
        radioSmokingYes = new javax.swing.JRadioButton();
        radioAllergicNo = new javax.swing.JRadioButton();
        radioAllergicYes = new javax.swing.JRadioButton();
        radioColdNo = new javax.swing.JRadioButton();
        radioColdYes = new javax.swing.JRadioButton();
        radioTesNegitive = new javax.swing.JRadioButton();
        radioTestNo = new javax.swing.JRadioButton();
        radioTestPositive = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 700));

        jLabel1.setText("Normal User");

        jLabel2.setText("Welcome: ");

        jLabel3.setText("Normal User Username");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Volunteer Questionary");

        jLabel5.setText("Are you alcoholic? ");

        jLabel6.setText("Are you Smoking?");

        jLabel7.setText("Have you ever had an allergic reaction? ");

        jLabel8.setText("Do you have a cold? ");

        jLabel9.setText("Do you get a covid-19 test? if yes, positive or negtive? ");

        groupAlcoholic.add(radioAlcoholicYes);
        radioAlcoholicYes.setText("Yes");

        groupAlcoholic.add(radioAlcoholicNo);
        radioAlcoholicNo.setText("No");
        radioAlcoholicNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAlcoholicNoActionPerformed(evt);
            }
        });

        groupSmoking.add(radioSmokingNo);
        radioSmokingNo.setText("No");
        radioSmokingNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSmokingNoActionPerformed(evt);
            }
        });

        groupSmoking.add(radioSmokingYes);
        radioSmokingYes.setText("Yes");

        groupAllergic.add(radioAllergicNo);
        radioAllergicNo.setText("No");
        radioAllergicNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAllergicNoActionPerformed(evt);
            }
        });

        groupAllergic.add(radioAllergicYes);
        radioAllergicYes.setText("Yes");

        groupCold.add(radioColdNo);
        radioColdNo.setText("No");
        radioColdNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioColdNoActionPerformed(evt);
            }
        });

        groupCold.add(radioColdYes);
        radioColdYes.setText("Yes");

        groupTest.add(radioTesNegitive);
        radioTesNegitive.setText("Negtive");
        radioTesNegitive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTesNegitiveActionPerformed(evt);
            }
        });

        groupTest.add(radioTestNo);
        radioTestNo.setText("No");

        groupTest.add(radioTestPositive);
        radioTestPositive.setText("Positive");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioAlcoholicYes)
                                        .addGap(36, 36, 36)
                                        .addComponent(radioAlcoholicNo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioSmokingYes)
                                        .addGap(36, 36, 36)
                                        .addComponent(radioSmokingNo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radioAllergicYes)
                                            .addComponent(radioColdYes)
                                            .addComponent(radioTestNo))
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radioTestPositive)
                                                .addGap(47, 47, 47)
                                                .addComponent(radioTesNegitive))
                                            .addComponent(radioColdNo)
                                            .addComponent(radioAllergicNo)))))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioAlcoholicYes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioAlcoholicNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioSmokingYes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioSmokingNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioAllergicYes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioAllergicNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioColdYes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioColdNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioTestNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioTesNegitive, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioTestPositive, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void radioAlcoholicNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAlcoholicNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioAlcoholicNoActionPerformed

    private void radioSmokingNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSmokingNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSmokingNoActionPerformed

    private void radioAllergicNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAllergicNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioAllergicNoActionPerformed

    private void radioColdNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioColdNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioColdNoActionPerformed

    private void radioTesNegitiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTesNegitiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTesNegitiveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (groupAlcoholic.getSelection() != null && groupAllergic.getSelection() != null && groupCold.getSelection() != null && groupSmoking.getSelection() != null && groupTest.getSelection() != null) {
            Questionary questionary = new Questionary();
            if (radioAlcoholicNo.isSelected()) {
                questionary.setIsAlcoholic(false);
            }
            if (radioAlcoholicYes.isSelected()) {
                questionary.setIsAlcoholic(true);
            }
            if (radioAllergicNo.isSelected()) {
                questionary.setIsAllergic(false);
            }
            if (radioAllergicYes.isSelected()) {
                questionary.setIsAllergic(true);
            }
            if (radioColdNo.isSelected()) {
                questionary.setIsCold(false);
            }
            if (radioColdYes.isSelected()) {
                questionary.setIsCold(true);
            }
            if (radioSmokingNo.isSelected()) {
                questionary.setIsSmoking(false);
            }
            if (radioSmokingYes.isSelected()) {
                questionary.setIsSmoking(true);
            }
            if (radioTestNo.isSelected()) {
                questionary.setTestResult("No");
            }
            if (radioTestPositive.isSelected()) {
                questionary.setTestResult("Positive");
            }
            if (radioTesNegitive.isSelected()) {
                questionary.setTestResult("Negitive");
            }
            
            VolunteerApplicationRequest application = new VolunteerApplicationRequest(questionary, false, "");
            application.setSender(userAccount);
            application.setUser(user);
            application.setStatus("Requested");
            
            system.getWorkQueue().getWorkRequestList().add(application);
            JOptionPane.showMessageDialog(null, "reported successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Please fill out the questionary");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup groupAlcoholic;
    private javax.swing.ButtonGroup groupAllergic;
    private javax.swing.ButtonGroup groupCold;
    private javax.swing.ButtonGroup groupSmoking;
    private javax.swing.ButtonGroup groupTest;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton radioAlcoholicNo;
    private javax.swing.JRadioButton radioAlcoholicYes;
    private javax.swing.JRadioButton radioAllergicNo;
    private javax.swing.JRadioButton radioAllergicYes;
    private javax.swing.JRadioButton radioColdNo;
    private javax.swing.JRadioButton radioColdYes;
    private javax.swing.JRadioButton radioSmokingNo;
    private javax.swing.JRadioButton radioSmokingYes;
    private javax.swing.JRadioButton radioTesNegitive;
    private javax.swing.JRadioButton radioTestNo;
    private javax.swing.JRadioButton radioTestPositive;
    // End of variables declaration//GEN-END:variables
}
