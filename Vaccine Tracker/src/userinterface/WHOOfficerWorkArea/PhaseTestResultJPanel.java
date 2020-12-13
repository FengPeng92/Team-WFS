/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.WHOOfficerWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Entity.Phase;
import Business.Entity.Vaccine;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ReportToWHORequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.TesterWorkArea.TesterWorkAreaJPanel;

/**
 *
 * @author fengpeng
 */
public class PhaseTestResultJPanel extends javax.swing.JPanel {
     private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise selectedenterprise;
    private EcoSystem system;
    private WorkRequest selectedWorkRequest;
    private Phase phase;
    private Vaccine selectedVaccine;
    private SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    /**
     * Creates new form PhaseTestResultJPanel
     */
    public PhaseTestResultJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, WorkRequest selectedWorkRequest) {
        initComponents();
        
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.selectedenterprise = enterprise;
        this.selectedWorkRequest = selectedWorkRequest;
        selectedVaccine = ((ReportToWHORequest)selectedWorkRequest).getVaccine();
        int size = selectedVaccine.getPhases().size();
        phase = selectedVaccine.getPhases().get(size-1);
        
        
        txtVaccineName.setText(selectedVaccine.getVaccineName());
        txtPhase.setText(phase.getName());
        txtVaccineType.setText(selectedVaccine.getVaccineType());
        txtCreateTime.setText(ft.format(selectedVaccine.getCreatedTime()));
        txtStartTime.setText(ft.format(phase.getStartDate()));
        txtEndTime.setText(ft.format(phase.getEndDate()) == null ? "" : ft.format(phase.getEndDate()));
        txtStatus.setText(phase.getStatus());
        txtEffectiveRate.setText(phase.getEffectiveRate() == 0 ? "TBD" : String.valueOf(phase.getEffectiveRate()));
        txtDescription.setText(phase.getDescription());
        txtWHODescription.setText(phase.getWHOdescription());
        txtDetail.setText(selectedVaccine.getDetail());
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
        jLabel7 = new javax.swing.JLabel();
        txtVaccineName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCreateTime = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtVaccineType = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtStartTime = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtEndTime = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtEffectiveRate = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        txtPhase = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtWHODescription = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDetail = new javax.swing.JTextArea();
        jRadioBtnYes = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioBtnNo = new javax.swing.JRadioButton();
        submitBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setEnabled(false);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Vaccine Name: ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 148, 128, 35));

        txtVaccineName.setEnabled(false);
        add(txtVaccineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 148, 123, 35));

        jLabel8.setText("Create Time:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 201, 128, 35));

        txtCreateTime.setEnabled(false);
        add(txtCreateTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 201, 123, 35));

        jLabel9.setText("Detail: ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 317, 128, 35));

        jLabel10.setText("Vaccine Type: ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 254, 128, 35));

        txtVaccineType.setEnabled(false);
        add(txtVaccineType, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 254, 123, 35));

        jLabel11.setText("Phase: ");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 148, 128, 35));

        jLabel12.setText("Start Time: ");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 201, 128, 35));

        txtStartTime.setEnabled(false);
        add(txtStartTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 201, 136, 35));

        jLabel13.setText("End Time:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 254, 128, 35));

        txtEndTime.setEnabled(false);
        add(txtEndTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 254, 136, 35));

        txtStatus.setEnabled(false);
        add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 317, 138, 35));

        jLabel14.setText("Status: ");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 317, 128, 35));

        jLabel15.setText("Effective Rate: ");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 370, 128, 35));

        txtEffectiveRate.setEnabled(false);
        add(txtEffectiveRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 58, 35));

        jLabel16.setText("%");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 372, 44, 30));

        jLabel17.setText("Description: ");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 456, 128, 35));

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        txtDescription.setEnabled(false);
        jScrollPane2.setViewportView(txtDescription);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 456, -1, 108));

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Vaccine Information Detail");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 83, 485, 37));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 82, 83, 39));

        txtPhase.setEnabled(false);
        add(txtPhase, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 148, 136, 35));

        jLabel19.setText("WHO Officer Description: ");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 456, 177, 35));

        txtWHODescription.setColumns(20);
        txtWHODescription.setRows(5);
        jScrollPane3.setViewportView(txtWHODescription);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 456, 244, -1));

        txtDetail.setColumns(20);
        txtDetail.setRows(5);
        txtDetail.setEnabled(false);
        jScrollPane4.setViewportView(txtDetail);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 317, -1, -1));

        buttonGroup1.add(jRadioBtnYes);
        jRadioBtnYes.setText("Yes");
        add(jRadioBtnYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 615, -1, -1));

        jLabel1.setText("Whether can go to next test stage? ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 612, 244, 35));

        buttonGroup1.add(jRadioBtnNo);
        jRadioBtnNo.setText("No");
        add(jRadioBtnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 615, -1, -1));

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 607, -1, 44));

        jPanel5.setBackground(new java.awt.Color(102, 153, 255));

        jLabel4.setText("Institution Name");

        jLabel5.setText("Welcome: ");

        jLabel6.setText("WHO Officer Username");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(428, 428, 428))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/WHOOfficerWorkArea/World-Health-Organization-Logo.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 540, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        WHOOfficerWorkAreaJPanel panel = (WHOOfficerWorkAreaJPanel) component;
        panel.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:Phase preclinical = new Phase("Preclinical", "", "Still testing");
        if (!jRadioBtnYes.isSelected()&&!jRadioBtnNo.isSelected()){
            JOptionPane.showMessageDialog(null, "Plesase choose if can go to next stage");
            return;
        } else if (jRadioBtnYes.isSelected()) {
            ((ReportToWHORequest)selectedWorkRequest).setIsChecked(true);
            if (selectedVaccine.getPhases().size() == 1) {
                ((ReportToWHORequest)selectedWorkRequest).getVaccine().getPhases().get(0).setStatus("Finished");
            } else if (selectedVaccine.getPhases().size() == 2) {
                ((ReportToWHORequest)selectedWorkRequest).getVaccine().getPhases().get(1).setStatus("Finished");
//                Phase phase2 = new Phase("Phase 2", "", "Started");
//                selectedVaccine.getPhases().add(phase2);
            } else if (selectedVaccine.getPhases().size() == 3) {
                ((ReportToWHORequest)selectedWorkRequest).getVaccine().getPhases().get(2).setStatus("Finished");
//                Phase phase3 = new Phase("Phase 3", "", "Started");
//                selectedVaccine.getPhases().add(phase3);
            } else if (selectedVaccine.getPhases().size() == 4) {
                ((ReportToWHORequest)selectedWorkRequest).getVaccine().getPhases().get(3).setStatus("Finished");
//                Phase approve = new Phase("Approve", "", "Started");
//                selectedVaccine.getPhases().add(approve);
            }
            JOptionPane.showMessageDialog(null, "submit successfully");
            system.getWorkQueue().getReportToWHORequestList().remove(selectedWorkRequest);
            
        } else if (jRadioBtnNo.isSelected()) {
            int size = ((ReportToWHORequest)selectedWorkRequest).getVaccine().getPhases().size();
            ((ReportToWHORequest)selectedWorkRequest).getVaccine().getPhases().remove(size-1);
            ((ReportToWHORequest)selectedWorkRequest).setIsChecked(true);
            JOptionPane.showMessageDialog(null, "submit successfully");
        }
        
        
        
    }//GEN-LAST:event_submitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioBtnNo;
    private javax.swing.JRadioButton jRadioBtnYes;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField txtCreateTime;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextArea txtDetail;
    private javax.swing.JTextField txtEffectiveRate;
    private javax.swing.JTextField txtEndTime;
    private javax.swing.JTextField txtPhase;
    private javax.swing.JTextField txtStartTime;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtVaccineName;
    private javax.swing.JTextField txtVaccineType;
    private javax.swing.JTextArea txtWHODescription;
    // End of variables declaration//GEN-END:variables
}
