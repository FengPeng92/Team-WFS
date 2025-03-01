/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VolunteerWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Entity.Phase;
import Business.Entity.Vaccine;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;

/**
 *
 * @author fengpeng
 */
public class VolunteerViewVaccineDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewVaccineInfoJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise selectedenterprise;
    private EcoSystem system;
    private Vaccine selectedVaccine;
    private SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public VolunteerViewVaccineDetailJPanel() {
        initComponents();
    }

    VolunteerViewVaccineDetailJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise selectedenterprise, EcoSystem system, Vaccine selectedVaccine) {
        initComponents();
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        this.selectedVaccine = selectedVaccine;
        this.system = system;
        this.selectedenterprise = selectedenterprise;
        
        labelUserName.setText(userAccount.getUsername());
        txtVaccineName.setText(selectedVaccine.getVaccineName());
        txtVaccineType.setText(selectedVaccine.getVaccineType());
        txtCreateTime.setText(ft.format(selectedVaccine.getCreatedTime()));
        txtDetail.setText(selectedVaccine.getDetail());
        
        populatePhaseBox();
        
        populatePhase("Preclinical");
        
    }
    
    public void populatePhaseBox() {
        for (Phase phase : selectedVaccine.getPhases()) {
            boxPhase.addItem(phase.getName());
        }
    }
    
    public void populatePhase(String phaseName) {
        for (Phase phase : selectedVaccine.getPhases()) {
            if (phase.getName().equals(phaseName)) {
                txtStartTime.setText(ft.format(phase.getStartDate()));
                txtEndTime.setText(ft.format(phase.getEndDate()).equals("") ? "Not Finished" : ft.format(phase.getEndDate()));
                txtStatus.setText(phase.getStatus());
                if (phase.getEffectiveRate() == 0) {
                    txtEffectiveRate.setText("0");
                } else {
                    String effective = phase.getEffectiveRate() + "%" + " (" + phase.getNumerator() + "/" + phase.getDenominator() + ")";
                    txtEffectiveRate.setText(effective);
                }
                //txtEffectiveRate.setText(phase.getEffectiveRate() == 0 ? "TBD" : String.valueOf(phase.getEffectiveRate()));
                txtDescription.setText(phase.getDescription());
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

        btnBack = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtVaccineName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCreateTime = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtVaccineType = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetail = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        boxPhase = new javax.swing.JComboBox<>();
        btnView = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtStartTime = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEndTime = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEffectiveRate = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelUserName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setEnabled(false);
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 86, 83, 39));

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Vaccine Information Detail");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 87, 574, 37));

        jLabel4.setText("Vaccine Name: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 145, 128, 35));

        txtVaccineName.setEnabled(false);
        add(txtVaccineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 123, 35));

        jLabel5.setText("Create Time:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 200, 128, 35));

        txtCreateTime.setEnabled(false);
        add(txtCreateTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 123, 35));

        jLabel7.setText("Vaccine Type: ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 253, 128, 35));

        txtVaccineType.setEnabled(false);
        add(txtVaccineType, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 123, 35));

        jLabel6.setText("Detail: ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 321, 128, 35));

        txtDetail.setColumns(20);
        txtDetail.setRows(5);
        txtDetail.setEnabled(false);
        jScrollPane1.setViewportView(txtDetail);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, 123));

        jLabel8.setText("Phase: ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 145, 128, 35));

        boxPhase.setBackground(new java.awt.Color(255, 255, 255));
        add(boxPhase, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 143, 136, 39));

        btnView.setBackground(new java.awt.Color(255, 255, 255));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 143, -1, 39));

        jLabel9.setText("Start Time: ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 200, 128, 35));

        txtStartTime.setEnabled(false);
        add(txtStartTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 200, 136, 35));

        jLabel10.setText("End Time:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 253, 128, 35));

        txtEndTime.setEnabled(false);
        add(txtEndTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 253, 136, 35));

        jLabel11.setText("Status: ");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 306, 128, 35));

        txtStatus.setEnabled(false);
        add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 306, 138, 35));

        jLabel12.setText("Effective Rate: ");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 359, 128, 35));

        txtEffectiveRate.setEnabled(false);
        add(txtEffectiveRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 359, 130, 35));

        jLabel14.setText("Description: ");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 412, 128, 35));

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        txtDescription.setEnabled(false);
        jScrollPane2.setViewportView(txtDescription);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 412, -1, 123));

        jPanel5.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setText("Volunteer");

        jLabel2.setText("Welcome: ");

        labelUserName.setText("Volunteer Username");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162)
                .addComponent(labelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Vaccine2.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 370, 270));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        String phaseName = boxPhase.getSelectedItem().toString();
        populatePhase(phaseName);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxPhase;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelUserName;
    private javax.swing.JTextField txtCreateTime;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextArea txtDetail;
    private javax.swing.JTextField txtEffectiveRate;
    private javax.swing.JTextField txtEndTime;
    private javax.swing.JTextField txtStartTime;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtVaccineName;
    private javax.swing.JTextField txtVaccineType;
    // End of variables declaration//GEN-END:variables
}
