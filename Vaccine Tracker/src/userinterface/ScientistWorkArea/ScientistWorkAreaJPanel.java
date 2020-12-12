/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ScientistWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Entity.Phase;
import Business.Entity.Vaccine;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ScientistRequestTesterRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author raunak
 */
public class ScientistWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private Vaccine selectedVaccine;
    private SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    //public ArrayList<Enterprise> listEnterprise;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public ScientistWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = system;
        
        jLabel1.setText(enterprise.getName());
        jLabel3.setText(account.getUsername());
        
        populate();
    }
   
    public void populateSelect() {
        DefaultTableModel dtm2=(DefaultTableModel) jTable3.getModel();
        dtm2.setRowCount(0);
        for (Enterprise e : selectedVaccine.getHospitalList()) {
            Object[] row = new Object[1];
            row[0] = e;
            dtm2.addRow(row);
        }
    }
    
    public void populateAll(){
        DefaultTableModel dtm1=(DefaultTableModel) jTable2.getModel();
        dtm1.setRowCount(0);
        for (Enterprise h : system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()) {
            if (h.getEnterpriseType() == Enterprise.EnterpriseType.Hospital && !selectedVaccine.getHospitalList().contains(h)) {
                Object[] row = new Object[1];
                row[0] = h;
                dtm1.addRow(row);
            }
        }
    }
    
    public void populate() {
        DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);

        if (enterprise.getVaccineDirectory().getVaccineList() == null) {
            System.out.println("null");
        }
        
        for (Vaccine vaccine : enterprise.getVaccineDirectory().getVaccineList()) {
            System.out.println(vaccine.getVaccineName());
            Object[] row = new Object[5];
            row[0] = vaccine.getVaccineType();
            row[1] = vaccine;
            row[2] = ft.format(vaccine.getCreatedTime());
            //row[4] = vaccine.getStatus();
            int size = vaccine.getPhases().size();
            if (size == 0) {
                dtm.addRow(row);
            } else {               
                row[3] = vaccine.getPhases().get(vaccine.getPhases().size()-1).getName();
                row[4] = vaccine.getPhases().get(vaccine.getPhases().size()-1).getStatus();
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
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Vaccine Type", "Vaccine Name", "Create Time", "Phase", "Phase Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 794, 211));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Vaccine Table");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 794, 36));

        jButton1.setText("Develop A New Vaccine");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 169, 43));

        jButton2.setText("View Vaccine Info");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, 43));

        jButton3.setText("Request Preclinical Trial");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, 43));

        jButton4.setText("Request Hospital Tests");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, -1, 43));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Hospital Name"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 206, 238));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("All Hospitals");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 206, 32));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Hospital Name"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 206, 238));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Selected Hospitals");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 206, 32));

        jButton5.setText("Add");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, -1, 47));

        jButton6.setText("Submit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 630, 128, 43));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setText("Institution Name");

        jLabel2.setText("Welcome: ");

        jLabel3.setText("Scientist Username");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ScientistWorkArea/u=2379368442,2132415513&fm=26&gp=0.jpg"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 590, 370));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        NewVaccineJPanel panel = new NewVaccineJPanel(userProcessContainer, userAccount, organization, enterprise, system);
        userProcessContainer.add("NewVaccineJPanel", panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectAccept = jTable1.getSelectedRow();
        if (selectAccept >= 0) {
            Vaccine v1 = (Vaccine)jTable1.getValueAt(selectAccept, 1);

            VaccineInfoJPanel panel = new VaccineInfoJPanel(userProcessContainer, userAccount, organization, enterprise, system, v1);
            userProcessContainer.add("VaccineInfoJPanel", panel);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row");
            populate();
        }
        return;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int selectEnterprise = jTable2.getSelectedRow();
        if (selectEnterprise >= 0) {
            Enterprise e1 = (Enterprise)jTable2.getValueAt(selectEnterprise, 0);
            selectedVaccine.getHospitalList().add(e1);
            populateSelect();
            populateAll();
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row");
            populateSelect();
        }
        return;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        int selectAccept = jTable1.getSelectedRow();
        if (selectAccept >= 0) {
            
            selectedVaccine = (Vaccine)jTable1.getValueAt(selectAccept, 1);
            int size = selectedVaccine.getPhases().size();
            if (size == 0) {
                JOptionPane.showMessageDialog(null, "Please finish preclinical test first.");
            } else if (size ==  1 && selectedVaccine.getPhases().get(size-1).getStatus().equals("Finished")) {
                Phase phase1 = new Phase("Phase 1", "", "Started");
                System.out.println(phase1);
                selectedVaccine.getPhases().add(phase1);
                populateAll();
                populateSelect();
                populate();
            } else if (size ==  2 && selectedVaccine.getPhases().get(size-1).getStatus().equals("Finished")) {
                Phase phase2 = new Phase("Phase 2", "", "Started");
                System.out.println(phase2);
                selectedVaccine.getPhases().add(phase2);
                populateAll();
                populateSelect();
                populate();
            } else if (size ==  3 && selectedVaccine.getPhases().get(size-1).getStatus().equals("Finished")){
                Phase phase3 = new Phase("Phase 3", "", "Started");
                System.out.println(phase3);
                selectedVaccine.getPhases().add(phase3);
                populateAll();
                populateSelect();
                populate();
            } else if (size ==  4 && selectedVaccine.getPhases().get(size-1).getStatus().equals("Finished")) {
                Phase approve = new Phase("Approve", "", "Started");
                System.out.println(approve);
                selectedVaccine.getPhases().add(approve);
                populateAll();
                populateSelect();
                populate();
            } else {
                JOptionPane.showMessageDialog(null, "The last phase of testing has not been completed. ");
            } 
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row");
            populate();
        }
        return;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectAccept = jTable1.getSelectedRow();
        if (selectAccept >= 0) {
            
            Vaccine v1 = (Vaccine)jTable1.getValueAt(selectAccept, 1);
            
            if (v1.getPhases().size() == 0) {
                v1.setStatus("Preclinical");
                Phase preclinical = new Phase("Preclinical", "", "Started");
                v1.getPhases().add(preclinical);

                WorkRequest request = new ScientistRequestTesterRequest(v1, enterprise);
                system.getWorkQueue().getWorkRequestList().add(request);
                populate();
                JOptionPane.showMessageDialog(null, "Preclinical test request.");
            } else {
                JOptionPane.showMessageDialog(null, "You already test the preclinical. ");
            }
            
            
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row");
            populate();
        }
        return;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        for (Enterprise enterprise : selectedVaccine.getHospitalList()) {
            enterprise.getVaccineDirectory().getVaccineList().add(selectedVaccine);
        }
        
        JOptionPane.showMessageDialog(null, "Assign to hospital successfully");
    }//GEN-LAST:event_jButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables

    
}
