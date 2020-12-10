/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NormalUserWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Entity.User;
import Business.Entity.Vaccine;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.VolunteerWorkArea.VolunteerRegisterJPanel;

/**
 *
 * @author raunak
 */
public class NormalUserWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private Vaccine selectedVaccine;
    private User user;
    private SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public NormalUserWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = system;
        
        user = enterprise.getUserDirectory().searchUserByUserAccount(userAccount);
        
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
        DefaultTableModel dtm =(DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        for (Enterprise enterprise : system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Institution) {
                for (Vaccine vaccine : enterprise.getVaccineDirectory().getVaccineList()) {
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
            
        }
    }
    
    public void populateVaccinesByInstitution(Enterprise enterprise) {
        DefaultTableModel dtm =(DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        for (Vaccine vaccine : enterprise.getVaccineDirectory().getVaccineList()) {
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
    
    public void populateVaccinesByPhase(String phaseName) {
        DefaultTableModel dtm =(DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        for (Enterprise enterprise : system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()) {
            for (Vaccine vaccine : enterprise.getVaccineDirectory().getVaccineList()) {
                int size = vaccine.getPhases().size();
                if (vaccine.getPhases().get(size-1).getName().equals(phaseName)) {
                    Object[] row = new Object[5];
                    row[0] = vaccine;
                    row[1] = vaccine.getVaccineType();
                    row[2] = ft.format(vaccine.getCreatedTime());
                    row[3] = vaccine.getPhases().get(size-1).getName();
                    row[4] = vaccine.getPhases().get(size-1).getStatus();
                    dtm.addRow(row);
                }
                
            }
        }
    }
    
    public void populateVaccinesByInstitutionAndPhase(Enterprise enterprise, String phaseName) {
        DefaultTableModel dtm =(DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        for (Vaccine vaccine : enterprise.getVaccineDirectory().getVaccineList()) {
            int size = vaccine.getPhases().size();
            if (vaccine.getPhases().get(size-1).getName().equals(phaseName)) {
                Object[] row = new Object[5];
                row[0] = vaccine;
                row[1] = vaccine.getVaccineType();
                row[2] = ft.format(vaccine.getCreatedTime());
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

        jLabel4 = new javax.swing.JLabel();
        boxInstitution = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        boxPhase = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 700));

        jLabel4.setText("Institution Name: ");

        jLabel5.setText("Phase: ");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Vaccine Information");

        jButton2.setText("View Vaccine Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel7.setText("Do you want to be a volunteer? ");

        jButton3.setText("Go");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        boxPhase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Phases", "Preclinical", "Phase 1", "Phase 2", "Phase 3", "Approved" }));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setText("Normal User");

        jLabel2.setText("Welcome: ");

        jLabel3.setText("Normal User Username");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(301, 301, 301))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boxInstitution, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxPhase, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(jButton1)
                                .addGap(0, 1378, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(75, 75, 75))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxInstitution, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxPhase, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1134, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow >= 0) {
            selectedVaccine = (Vaccine)jTable1.getValueAt(selectedRow, 0);
            Enterprise selectedenterprise = system.getNetworkList().get(0).getEnterpriseDirectory().searchEnterpiseByVaccine(selectedVaccine);
            ViewVaccineInfoJPanel viewVaccineInfoJPanel = new ViewVaccineInfoJPanel(userProcessContainer, userAccount, selectedenterprise, system, selectedVaccine);
            userProcessContainer.add("ViewVaccineInfoJPanel", viewVaccineInfoJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        VolunteerRegisterJPanel volunteerRegisterJPanel = new VolunteerRegisterJPanel(userProcessContainer, userAccount, organization, enterprise, system, user);
        userProcessContainer.add("VolunteerRegisterJPanel", volunteerRegisterJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxInstitution;
    private javax.swing.JComboBox<String> boxPhase;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
