/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VolunteerWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Entity.Vaccine;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class VolunteerViewVaccineInfoJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private Vaccine selectedVaccine;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public VolunteerViewVaccineInfoJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = system;
        
        jLabel3.setText(userAccount.getUsername());
        populateInstitution();
    }
    
    
    public void populateInstitution() {
        boxInstitution.addItem("All Institutions");
        for (Enterprise enterprise: system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Institution) {
                boxInstitution.addItem(enterprise.getName());
            }
        }
    }
    
    public void populateAllVaccines() {
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
    
    public void populateVaccinesByInstitution(Enterprise enterprise) {
        DefaultTableModel dtm =(DefaultTableModel) tableVaccine.getModel();
        dtm.setRowCount(0);
        
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
    
    public void populateVaccinesByPhase(String phaseName) {
        DefaultTableModel dtm =(DefaultTableModel) tableVaccine.getModel();
        dtm.setRowCount(0);
        
        for (Enterprise enterprise : system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()) {
            for (Vaccine vaccine : enterprise.getVaccineDirectory().getVaccineList()) {
                int size = vaccine.getPhases().size();
                if (vaccine.getPhases().get(size-1).getName().equals(phaseName)) {
                    Object[] row = new Object[5];
                    row[0] = vaccine;
                    row[1] = vaccine.getVaccineType();
                    row[2] = vaccine.getCreatedTime();
                    row[3] = vaccine.getPhases().get(size-1).getName();
                    row[4] = vaccine.getPhases().get(size-1).getStatus();
                    dtm.addRow(row);
                }
                
            }
        }
    }
    
    public void populateVaccinesByInstitutionAndPhase(Enterprise enterprise, String phaseName) {
        DefaultTableModel dtm =(DefaultTableModel) tableVaccine.getModel();
        dtm.setRowCount(0);
        
        for (Vaccine vaccine : enterprise.getVaccineDirectory().getVaccineList()) {
            int size = vaccine.getPhases().size();
            if (vaccine.getPhases().get(size-1).getName().equals(phaseName)) {
                Object[] row = new Object[5];
                row[0] = vaccine;
                row[1] = vaccine.getVaccineType();
                row[2] = vaccine.getCreatedTime();
                row[3] = vaccine.getPhases().get(size-1).getName();
                row[4] = vaccine.getPhases().get(size-1).getStatus();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        boxInstitution = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        boxPhase = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVaccine = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 700));

        jLabel1.setText("Volunteer");

        jLabel2.setText("Welcome: ");

        jLabel3.setText("Volunteer Username");

        jLabel4.setText("Institution Name: ");

        jLabel5.setText("Phase: ");

        boxPhase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Phases", "Preclinical", "Phase 1", "Phase 2", "Phase 3", "Approved" }));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

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

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Vaccine Information");

        jButton2.setText("View Vaccine Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boxInstitution, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boxPhase, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                .addComponent(btnSearch))
                            .addComponent(jScrollPane1))))
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxInstitution, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxPhase, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String searchInstitu = boxInstitution.getSelectedItem().toString();
        String selectedPhase = boxPhase.getSelectedItem().toString();
        
        if (searchInstitu.equals("All Institutions") && selectedPhase.equals("All Phases")) {
            populateAllVaccines();
        } else if (searchInstitu.equals("All Institutions")) {
            populateVaccinesByPhase(selectedPhase);    
        } else if (selectedPhase.equals("All Phases")) {
            Enterprise selectedEnterprise = system.getNetworkList().get(0).getEnterpriseDirectory().searchEnterpiseByName(searchInstitu);
            populateVaccinesByInstitution(selectedEnterprise);
        } else {
            Enterprise selectedEnterprise = system.getNetworkList().get(0).getEnterpriseDirectory().searchEnterpiseByName(searchInstitu);
            populateVaccinesByInstitutionAndPhase(selectedEnterprise, selectedPhase);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableVaccine.getSelectedRow();
        
        if (selectedRow >= 0) {
            selectedVaccine = (Vaccine)tableVaccine.getValueAt(selectedRow, 0);
            Enterprise selectedenterprise = system.getNetworkList().get(0).getEnterpriseDirectory().searchEnterpiseByVaccine(selectedVaccine);
            VolunteerViewVaccineDetailJPanel volunteerViewVaccineDetailJPanel = new VolunteerViewVaccineDetailJPanel(userProcessContainer, userAccount, selectedenterprise, system, selectedVaccine);
            userProcessContainer.add("VolunteerViewVaccineDetailJPanel", volunteerViewVaccineDetailJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxInstitution;
    private javax.swing.JComboBox<String> boxPhase;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableVaccine;
    // End of variables declaration//GEN-END:variables
}
