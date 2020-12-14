/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VolunteerManagerWorkArea;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Entity.User;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.VolunteerRole;
import Business.UserAccount.UserAccount;
import Business.Util.SendEmail;
import Business.WorkQueue.VolunteerApplicationRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class VolunteerManagerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private WorkRequest selectedRequest;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public VolunteerManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        jScrollPane1.getViewport().setBackground(new java.awt.Color(255, 255, 255));

        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = system;
        
        jLabel1.setText(enterprise.getName());
        jLabel3.setText(userAccount.getUsername());
        
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        System.out.println(system.getWorkQueue().getVolunteerApplicationRequestList().size());
        
        for (WorkRequest request : system.getWorkQueue().getVolunteerApplicationRequestList()) {           
            if (((VolunteerApplicationRequest)request).isIsChecked()) continue;
            Object[] row = new Object[4];
            row[0] = ((VolunteerApplicationRequest)request).getUser();
            row[1] = ((VolunteerApplicationRequest)request).getUser().getUserAccount().getEmployee().getName();
            row[2] = ((VolunteerApplicationRequest)request).getUser().getAge();
            row[3] = ((VolunteerApplicationRequest)request).getUser().getEmail();
            dtm.addRow(row);
        }
    }
    
    public void populateQuestionary(WorkRequest request) {
        VolunteerApplicationRequest applicationRequest = (VolunteerApplicationRequest)request;
        if (applicationRequest.getQuestionary().isIsAlcoholic()) {
            radioAlcoholicYes.setSelected(true);
        } else {
            radioAlcoholicNo.setSelected(true);
        }
        
        if (applicationRequest.getQuestionary().isIsAllergic()) {
            radioAllergicYes.setSelected(true);
        } else {
            radioAllergicNo.setSelected(true);
        }
        
        if (applicationRequest.getQuestionary().isIsCold()) {
            radioColdYes.setSelected(true);
        } else {
            radioColdNo.setSelected(true);
        }
        
        if (applicationRequest.getQuestionary().isIsSmoking()) {
            radioSmokingYes.setSelected(true);
        } else {
            radioSmokingNo.setSelected(true);
        }
        if (applicationRequest.getQuestionary().getTestResult().equals("No")) {
            radioTestNo.setSelected(true);
        } else if (applicationRequest.getQuestionary().getTestResult().equals("Positive")) {
            radioTestPositive.setSelected(true);
        } else if (applicationRequest.getQuestionary().getTestResult().equals("Negitive")) {
            radioTesNegitive.setSelected(true);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        radioAlcoholicYes = new javax.swing.JRadioButton();
        radioAlcoholicNo = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        radioSmokingYes = new javax.swing.JRadioButton();
        radioSmokingNo = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        radioAllergicYes = new javax.swing.JRadioButton();
        radioAllergicNo = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        radioColdYes = new javax.swing.JRadioButton();
        radioColdNo = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        radioTestNo = new javax.swing.JRadioButton();
        radioTestPositive = new javax.swing.JRadioButton();
        radioTesNegitive = new javax.swing.JRadioButton();
        agreeBtn = new javax.swing.JButton();
        disagreeBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Name", "Age", "Email"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 147, 869, 247));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Volunteer Requests");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 110, 869, 28));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 412, 92, 41));

        jLabel5.setText("Are you alcoholic? ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 471, 164, 34));

        buttonGroup1.add(radioAlcoholicYes);
        radioAlcoholicYes.setText("Yes");
        add(radioAlcoholicYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 471, -1, 34));

        buttonGroup1.add(radioAlcoholicNo);
        radioAlcoholicNo.setText("No");
        radioAlcoholicNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAlcoholicNoActionPerformed(evt);
            }
        });
        add(radioAlcoholicNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 471, -1, 34));

        jLabel6.setText("Are you smoking? ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 471, 164, 34));

        buttonGroup2.add(radioSmokingYes);
        radioSmokingYes.setText("Yes");
        add(radioSmokingYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 471, -1, 34));

        buttonGroup2.add(radioSmokingNo);
        radioSmokingNo.setText("No");
        radioSmokingNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSmokingNoActionPerformed(evt);
            }
        });
        add(radioSmokingNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 471, -1, 34));

        jLabel7.setText("Whether have an allergic reaction? ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 523, 231, 34));

        buttonGroup3.add(radioAllergicYes);
        radioAllergicYes.setText("Yes");
        add(radioAllergicYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 523, -1, 34));

        buttonGroup3.add(radioAllergicNo);
        radioAllergicNo.setText("No");
        radioAllergicNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAllergicNoActionPerformed(evt);
            }
        });
        add(radioAllergicNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 523, -1, 34));

        jLabel8.setText("Do you have a cold? ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 523, 164, 34));

        buttonGroup4.add(radioColdYes);
        radioColdYes.setText("Yes");
        add(radioColdYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 523, -1, 34));

        buttonGroup4.add(radioColdNo);
        radioColdNo.setText("No");
        radioColdNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioColdNoActionPerformed(evt);
            }
        });
        add(radioColdNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 523, -1, 34));

        jLabel9.setText("Do you get a covid-19 test? if yes, positive or negtive? ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 575, 389, 34));

        buttonGroup5.add(radioTestNo);
        radioTestNo.setText("No");
        add(radioTestNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 575, -1, 34));

        buttonGroup5.add(radioTestPositive);
        radioTestPositive.setText("Positive");
        add(radioTestPositive, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 575, -1, 34));

        buttonGroup5.add(radioTesNegitive);
        radioTesNegitive.setText("Negtive");
        radioTesNegitive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTesNegitiveActionPerformed(evt);
            }
        });
        add(radioTesNegitive, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 575, -1, 34));

        agreeBtn.setBackground(new java.awt.Color(255, 255, 255));
        agreeBtn.setText("Agree");
        agreeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreeBtnActionPerformed(evt);
            }
        });
        add(agreeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 627, 105, 39));

        disagreeBtn.setBackground(new java.awt.Color(255, 255, 255));
        disagreeBtn.setText("Disagree");
        disagreeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disagreeBtnActionPerformed(evt);
            }
        });
        add(disagreeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 627, 105, 39));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setText("Volunteer Management");

        jLabel2.setText("Welcome: ");

        jLabel3.setText("Volun Manager Username");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 488, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
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

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1066, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Doctor1.png"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 340, 270));
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow >= 0) {
            User selectedUser = (User)jTable1.getValueAt(selectedRow, 0);
            selectedRequest = system.getWorkQueue().searchRequestByUser(selectedUser);
            populateQuestionary(selectedRequest);
            
        } else {
            JOptionPane.showMessageDialog(null, "Please selected a row.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void agreeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreeBtnActionPerformed
        // TODO add your handling code here:
        ((VolunteerApplicationRequest)selectedRequest).setIsQualified(true);
        ((VolunteerApplicationRequest)selectedRequest).setIsChecked(true);
        Role role = new VolunteerRole();
        ((VolunteerApplicationRequest)selectedRequest).getUser().getUserAccount().setRole(role);
        
        SendEmail send = new SendEmail(((VolunteerApplicationRequest)selectedRequest).getUser().getEmail());
        send.VolunteerAgree();
        system.getWorkQueue().getVolunteerApplicationRequestList().remove(selectedRequest);
        populateTable();
        JOptionPane.showMessageDialog(null, "This person became a volunteer");
    }//GEN-LAST:event_agreeBtnActionPerformed

    private void disagreeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disagreeBtnActionPerformed
        // TODO add your handling code here:
        ((VolunteerApplicationRequest)selectedRequest).setIsQualified(false);
        ((VolunteerApplicationRequest)selectedRequest).setIsChecked(true);
        system.getWorkQueue().getVolunteerApplicationRequestList().remove(selectedRequest);
        populateTable();
        JOptionPane.showMessageDialog(null, "This person is not qualified to become a volunteer");
    }//GEN-LAST:event_disagreeBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agreeBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton disagreeBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
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
