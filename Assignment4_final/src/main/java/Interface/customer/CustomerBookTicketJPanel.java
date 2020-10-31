/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.customer;

import Entities.Airliner;
import Entities.AirlinerDirectory;
import Entities.Customer;
import Entities.Flight;
import Entities.Seat;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jaysu
 */
public class CustomerBookTicketJPanel extends javax.swing.JPanel {

    /**
     * Creates new form customeViewTicketDetailJPanel
     */
    private JPanel UserProcessContainer;
    private Customer customer;
    private AirlinerDirectory airlinerDirectory;
    private Flight slectedFlight = null;
    public CustomerBookTicketJPanel() {
        
    }

    CustomerBookTicketJPanel(JPanel UserProcessContainer, Customer customer, AirlinerDirectory airlinerDirectory) {
        initComponents();
        this.UserProcessContainer = UserProcessContainer;
        this.customer = customer;
        this.airlinerDirectory = airlinerDirectory;
        populateAirliner();
    }
    
    public void populateAirliner() {
        comboAirliner.addItem("Any Airliners");
        List<Airliner> airlinerList = airlinerDirectory.getAirlinerList();       
        for (Airliner airliner : airlinerList) {
            comboAirliner.addItem(airliner.getUserName());
        }
        labelName.setText(customer.getUserName());
        
    }
    
    public void pupulateFlightsTable(List<Flight> searchFlights) {
        DefaultTableModel dtm =(DefaultTableModel) tableFlights.getModel();        
        dtm.setRowCount(0);
        //Bug: price may have some problems
        for (Flight flight : searchFlights) {
            Object[] row = new Object[6];
            row[0] = flight.getFlightNumber();
            row[1] = flight.getFrom();
            row[2] = flight.getTo();
            row[3] = flight.getDepartureTime();
            row[4] = flight.getArriveTime();
            row[5] = flight.getPrice();
            dtm.addRow(row);
        }       
    }
    
    private void populateSeatTable(Flight flight) {
        DefaultTableModel dtm =(DefaultTableModel) tableSeats.getModel();
        dtm.setRowCount(0);
        
        for (Seat seat : flight.getSeats()) {
            Object[] row = new Object[4];
            row[0] = seat.getRow();
            row[1] = seat.getColumn();
            row[2] = seat.getLocation();
            row[3] = seat.isIsAvailable();
            dtm.addRow(row);
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFrom = new javax.swing.JTextField();
        txtTo = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFlights = new javax.swing.JTable();
        btnSelectSeats = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSeats = new javax.swing.JTable();
        btnBookTicket = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDepartureTime = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboAirliner = new javax.swing.JComboBox<>();

        jLabel1.setText("From:");

        jLabel2.setText("To:");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tableFlights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Number", "Departure", "Arrive", "Departure Time", "Arrive Time", "Price"
            }
        ));
        jScrollPane1.setViewportView(tableFlights);

        btnSelectSeats.setText("Select Seats");
        btnSelectSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectSeatsActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Search Flights");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Available Flights");

        tableSeats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Row", "Cloumn", "Location", "Available"
            }
        ));
        jScrollPane2.setViewportView(tableSeats);

        btnBookTicket.setText("Book the Ticket");
        btnBookTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookTicketActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Seats");

        jLabel6.setText("Departure Time: ");

        jLabel7.setText("Airliner:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSelectSeats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBookTicket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtDepartureTime, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTo)
                            .addComponent(comboAirliner, 0, 157, Short.MAX_VALUE))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepartureTime, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSelectSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBookTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String from = txtFrom.getText();
        String to = txtTo.getText();
        String departureTime = txtDepartureTime.getText();
        String airlinerName = comboAirliner.getSelectedItem().toString();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd"); 
        try {
            if (departureTime.equals("")) {
                if (from.equals("") || to.equals("")) {
                JOptionPane.showMessageDialog(null, "please fill in the from and to information", "warning",JOptionPane.WARNING_MESSAGE); 
                } else {
                    if (airlinerName.equals("Any Airliners")) {
                        List<Flight> allFlights = airlinerDirectory.getAllFligthsByCondition(from, to, departureTime);
                        if (allFlights == null) {
                            JOptionPane.showMessageDialog(null, "No matching flight found"); 
                        } else {
                            pupulateFlightsTable(allFlights);
                        }
                    } else {
                        Airliner searchAirliner = airlinerDirectory.searchAirlinerByName(airlinerName);
                        List<Flight> searchFlights = searchAirliner.searchFlightByConditions(from, to, departureTime);
                        if (searchFlights == null) {
                            JOptionPane.showMessageDialog(null, "No matching flight found"); 
                        } else {
                            pupulateFlightsTable(searchFlights);
                        }
                    }
                }
            } else {
                ft.parse(departureTime);
                if (from.equals("") || to.equals("")) {
                JOptionPane.showMessageDialog(null, "please fill in the from and to information", "warning",JOptionPane.WARNING_MESSAGE); 
                } else {
                    if (airlinerName.equals("Any Airliners")) {
                        List<Flight> allFlights = airlinerDirectory.getAllFligthsByCondition(from, to, departureTime);
                        if (allFlights == null) {
                            JOptionPane.showMessageDialog(null, "No matching flight found"); 
                        } else {
                            pupulateFlightsTable(allFlights);
                        }
                    } else {
                        Airliner searchAirliner = airlinerDirectory.searchAirlinerByName(airlinerName);
                        List<Flight> searchFlights = searchAirliner.searchFlightByConditions(from, to, departureTime);
                        if (searchFlights == null) {
                            JOptionPane.showMessageDialog(null, "No matching flight found"); 
                        } else {
                            pupulateFlightsTable(searchFlights);
                        }
                    }
                }
            }

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "departure time format is not correct", "warning",JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSelectSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectSeatsActionPerformed
        // TODO add your handling code here:
        int selectFlightRow = tableFlights.getSelectedRow();
        if (selectFlightRow >= 0) {
            String flightNumber = (String)tableFlights.getValueAt(selectFlightRow, 0);
            slectedFlight = airlinerDirectory.searchFlightByFlightNumber(flightNumber);
            if (slectedFlight == null) return;
            populateSeatTable(slectedFlight);
        } else {
            JOptionPane.showMessageDialog(null, "please select a row", "warning",JOptionPane.WARNING_MESSAGE); 
        }
        
    }//GEN-LAST:event_btnSelectSeatsActionPerformed

    private void btnBookTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookTicketActionPerformed
        // TODO add your handling code here:
        int selectSeatRow = tableSeats.getSelectedRow();
        if (selectSeatRow >= 0) {
            int row = (int)tableSeats.getValueAt(selectSeatRow, 0);
            int col = (int)tableSeats.getValueAt(selectSeatRow, 1);
            String location = (String)tableSeats.getValueAt(selectSeatRow, 2);
            Seat seat = slectedFlight.findSeat(row, col, location);
            
            if (!seat.isIsAvailable()) {
                JOptionPane.showMessageDialog(null, "this seat is not available", "warning",JOptionPane.WARNING_MESSAGE);
            } else {
                customer.addSeat(seat);
                populateSeatTable(slectedFlight);
                JOptionPane.showMessageDialog(null, "Book a seat successfully!");
            }         
        }
    }//GEN-LAST:event_btnBookTicketActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        UserProcessContainer.remove(this);
        Component[] componentArray = UserProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomersJPanel panel = (CustomersJPanel) component;
        panel.populateTickets();
        CardLayout layout = (CardLayout)UserProcessContainer.getLayout();
        layout.previous(UserProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookTicket;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSelectSeats;
    private javax.swing.JComboBox<String> comboAirliner;
    private javax.swing.JDesktopPane jDesktopPane1;
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
    private javax.swing.JLabel labelName;
    private javax.swing.JTable tableFlights;
    private javax.swing.JTable tableSeats;
    private javax.swing.JTextField txtDepartureTime;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextField txtTo;
    // End of variables declaration//GEN-END:variables

    
}
