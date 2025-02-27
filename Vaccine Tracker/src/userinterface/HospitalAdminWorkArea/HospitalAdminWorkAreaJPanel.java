/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Entity.Vaccine;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ReportToInstitutionRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class HospitalAdminWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private Vaccine selectedVaccine;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public HospitalAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        jScrollPane1.getViewport().setBackground(new java.awt.Color(255, 255, 255));

        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = system;
        
        
        jLabel1.setText(enterprise.getName());
        jLabel3.setText(userAccount.getUsername());
        
    }
    
    
    public void populateTable() {
        DefaultTableModel dtm=(DefaultTableModel) tableVaccine.getModel();
        dtm.setRowCount(0);
        
        for (Vaccine vaccine : enterprise.getVaccineDirectory().getVaccineList()) {
            Object[] row = new Object[4];
            row[0] = vaccine;
            row[1] = vaccine.getVaccineType();
            row[2] = vaccine.getHospitalList().get(enterprise).getName();
            row[3] = vaccine.getHospitalList().get(enterprise).getEffectiveRate() 
                    +" (" + vaccine.getHospitalList().get(enterprise).getNumerator() + "/" + 
                    vaccine.getHospitalList().get(enterprise).getDenominator() + ")";
            dtm.addRow(row);
        }
        
    }
    
    public void populateTable(Vaccine vaccine) {
        DefaultTableModel dtm=(DefaultTableModel) tableVaccine.getModel();
        dtm.setRowCount(0);
        
        Object[] row = new Object[4];
            row[0] = vaccine;
            row[1] = vaccine.getVaccineType();
            row[2] = vaccine.getHospitalList().get(enterprise).getName();
            row[3] = vaccine.getHospitalList().get(enterprise).getEffectiveRate() 
                    +" (" + vaccine.getHospitalList().get(enterprise).getNumerator() + "/" + 
                    vaccine.getHospitalList().get(enterprise).getDenominator() + ")";
            dtm.addRow(row);
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
        txtVaccine = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVaccine = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Vaccine: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 160, 113, 32));
        add(txtVaccine, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 156, 118, 40));

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 156, 109, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("List All Vaccines");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 156, 207, 40));

        tableVaccine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vaccine", "Vaccine Type", "Phase", "Effective Rate(%)"
            }
        ));
        jScrollPane1.setViewportView(tableVaccine);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 226, 794, 235));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Report to Institution");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 493, 153, 45));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Manage Doctors");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 493, 182, 45));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setText("Hospital Name");

        jLabel2.setText("Welcome: ");

        jLabel3.setText("HospitalAdmin  Username");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/vaccine-research-design-cartoon-scientific-doctor-vector-33886994.jpg"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1350, 760));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        String searchVaccine = txtVaccine.getText();
        if (searchVaccine.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the vaccine name.");
        } else {
            Vaccine searchedVaccine = enterprise.getVaccineDirectory().searchVaccineByName(searchVaccine);
            if (searchedVaccine == null) {
                JOptionPane.showMessageDialog(null, "No search result");
            } else {
                populateTable(searchedVaccine);
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ManageDoctorsJPanel manageDoctorsJPanel = new ManageDoctorsJPanel(userProcessContainer, userAccount, organization, enterprise, system);
        userProcessContainer.add("ManageDoctorsJPanel", manageDoctorsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableVaccine.getSelectedRow();
        
        if (selectedRow >= 0) {
            selectedVaccine = (Vaccine)tableVaccine.getValueAt(selectedRow, 0);
            WorkRequest request = new ReportToInstitutionRequest();
            ((ReportToInstitutionRequest)request).setVaccine(selectedVaccine);
            system.getWorkQueue().getWorkRequestList().add(request);
            int size = selectedVaccine.getPhases().size();
            
            int num = selectedVaccine.getPhases().get(size-1).getNumerator();
            num += selectedVaccine.getHospitalList().get(enterprise).getNumerator();
            int de = selectedVaccine.getPhases().get(size-1).getDenominator();
            de += selectedVaccine.getHospitalList().get(enterprise).getDenominator();
            selectedVaccine.getPhases().get(size-1).setNumerator(num);
            selectedVaccine.getPhases().get(size-1).setDenominator(de);
            double result = (double)num * 100.0 / (double)de;
            selectedVaccine.getPhases().get(size-1).setEffectiveRate(result);
            System.out.println(result);
            
//            int a = 0, b = 0;
//            for (WorkRequest workrequest : system.getWorkQueue().getReportToWHORequestList()) {
//                if (((ReportToInstitutionRequest)request).getVaccine() == selectedVaccine) {
//                    
//                    int size = ((ReportToInstitutionRequest)request).getVaccine().getPhases().size();
//                    
//                    a += ((ReportToInstitutionRequest)request).getVaccine().getPhases().get(size-1).setNumerator(a);
//                }
//            }
            JOptionPane.showMessageDialog(null, "Report successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Please selected a vaccine.");
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableVaccine;
    private javax.swing.JTextField txtVaccine;
    // End of variables declaration//GEN-END:variables
}
