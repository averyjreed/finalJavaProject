/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.Enumeration;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.Color;
import javax.swing.AbstractButton;
import javax.swing.JTable;
import java.util.Date;

public class AssignmentPage extends javax.swing.JFrame {

    /**
     * Creates new form AssignmentPage
     */
    public AssignmentPage() {
        initComponents();
        getDepText();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        atable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BeginDate = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        EndDate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        asnaddbutton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        empcb = new javax.swing.JComboBox<>();
        depcb = new javax.swing.JComboBox<>();
        rankcb = new javax.swing.JComboBox<>();
        errormsg = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        homemenu = new javax.swing.JMenu();
        employeemenu = new javax.swing.JMenu();
        departmentmenu = new javax.swing.JMenu();
        assignmentmenu = new javax.swing.JMenu();
        payrollmenu = new javax.swing.JMenu();
        close = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Phosphate", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reed-Bentley Construction Assignments");
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 600));

        atable.setBackground(new java.awt.Color(204, 204, 204));
        atable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Department", "EmployeeID", "Last Name", "First Name", "Rank", "Begin Date", "End Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        atable.setGridColor(new java.awt.Color(153, 153, 0));
        jScrollPane1.setViewportView(atable);

        jLabel3.setText("EmployeeID:");

        jLabel6.setText("Begin Date:");

        jLabel7.setText("End Date:");

        jLabel4.setText("Department:");

        jLabel5.setText("Rank:");

        jButton1.setText("Current");

        jButton2.setText("Update");

        asnaddbutton.setText("Add");
        asnaddbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asnaddbuttonActionPerformed(evt);
            }
        });

        jButton4.setText("Past");

        empcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "44440000" }));

        depcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One" }));

        rankcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Level 1", "Level 2", "Level 3", "Level 4", "Level 5", "Manager" }));

        errormsg.setForeground(new java.awt.Color(255, 0, 0));

        homemenu.setText("Home");
        homemenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homemenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(homemenu);

        employeemenu.setText("Employees");
        employeemenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeemenuMouseClicked(evt);
            }
        });
        employeemenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeemenuActionPerformed(evt);
            }
        });
        jMenuBar1.add(employeemenu);

        departmentmenu.setText("Departments");
        departmentmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                departmentmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(departmentmenu);

        assignmentmenu.setText("Assignments");
        assignmentmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assignmentmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(assignmentmenu);

        payrollmenu.setText("Payroll");
        payrollmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payrollmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(payrollmenu);

        close.setText("Close");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jMenuBar1.add(close);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(empcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(depcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(asnaddbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(BeginDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                            .addComponent(rankcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(EndDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(errormsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(empcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(depcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rankcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BeginDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EndDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(asnaddbutton)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(16, 16, 16)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errormsg, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homemenuMouseClicked

        HomePage hp = new HomePage();
        hp.setVisible(true);
        dispose();
    }//GEN-LAST:event_homemenuMouseClicked

      /* String hireDateString = eptr.getHiredate();
    DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
    Date hireDate; 
    
    try{ 
        hireDate = (Date)df.parse(hireDateString);} 
    
    catch(Exception e) {
        e.printStackTrace(); 
        return; } */ // converting date back to object
    
    private void employeemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeemenuMouseClicked
        EmployeePage ep = new EmployeePage();
        ep.setVisible(true);
        dispose();
    }//GEN-LAST:event_employeemenuMouseClicked

    private void employeemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeemenuActionPerformed

    }//GEN-LAST:event_employeemenuActionPerformed

    private void departmentmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentmenuMouseClicked
        DepartmentPage dp = new DepartmentPage();
        dp.setVisible(true);
        dispose();
    }//GEN-LAST:event_departmentmenuMouseClicked

    private void assignmentmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignmentmenuMouseClicked
       
    }//GEN-LAST:event_assignmentmenuMouseClicked

    private void payrollmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payrollmenuMouseClicked
        PayrollPage pp = new PayrollPage();
        pp.setVisible(true);
        dispose();
    }//GEN-LAST:event_payrollmenuMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        FinalProject.writeEmployeeFile();
        //FinalProject.writeDepartmentFile();
        //FinalProject.writeAssignmentFile();
        //FinalProject.writeDepartmentFile();
        //FinalProject.writePayrollFile();
        dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed

    }//GEN-LAST:event_closeActionPerformed

    private void asnaddbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asnaddbuttonActionPerformed
        
        errormsg.setText("");
        DefaultTableModel model = (DefaultTableModel)atable.getModel();
        
        Date chosenBeginDate = BeginDate.getDate(); 
        String begin = String.format("%1$tm/%1$td/%1$tY", chosenBeginDate);
        
        Date chosenEndDate = EndDate.getDate(); 
        String aend = String.format("%1$tm/%1$td/%1$tY", chosenEndDate);
        if(aend.equals("null/null/null"))
            aend = "NA";
        
        String afname = empIdTofName(empcb.getSelectedItem().toString());
        String alname = empIdTolName(empcb.getSelectedItem().toString());
        
        if(begin.equals("null/null/null")){
            errormsg.setText("No Begin Date was selected.");
        }
        // verify end date is after begin date
        else{
            FinalProject.asnlist.add(depcb.getSelectedItem().toString(), empcb.getSelectedItem().toString(), alname, afname, rankcb.getSelectedItem().toString(), begin, aend);
        
            model.addRow(new Object[] {depcb.getSelectedItem().toString(), empcb.getSelectedItem().toString(), alname, afname, rankcb.getSelectedItem().toString(), begin, aend} );
            depcb.setSelectedIndex(0);
            empcb.setSelectedIndex(0);
            rankcb.setSelectedIndex(0);
        }
    }//GEN-LAST:event_asnaddbuttonActionPerformed

    private void getDepText(){
        DepartmentNode dptr = FinalProject.deplist.getHead();
        
        depcb.removeAllItems();
        depcb.addItem("Select One");
        
        for(int i = 0; i < FinalProject.deplist.size(); i++){
            depcb.addItem(dptr.getDname());
            dptr = dptr.getNext();
        }
    }
    
    public String empIdTofName(String empid){
     
    EmployeeNode eptr = FinalProject.emplist.getHead();
        for(int i = 0; i < FinalProject.emplist.size(); i++){
    
            if(empid.compareTo(eptr.getEmployeeID()) == 0)
                return eptr.getFname();
            eptr = eptr.getNext();
        }
        return null;
    }
    
    public String empIdTolName(String empid){
     
    EmployeeNode eptr = FinalProject.emplist.getHead();
        for(int i = 0; i < FinalProject.emplist.size(); i++){
    
            if(empid.compareTo(eptr.getEmployeeID()) == 0)
                return eptr.getLname();
            eptr = eptr.getNext();
        }
        return null;
    }
    
    private boolean verifyDates(Date hr, Date lv) {
        if(hr.compareTo(lv) < 0) 
            return true;
        return false;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AssignmentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignmentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignmentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignmentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignmentPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser BeginDate;
    private com.toedter.calendar.JDateChooser EndDate;
    private javax.swing.JButton asnaddbutton;
    private javax.swing.JMenu assignmentmenu;
    private javax.swing.JTable atable;
    private javax.swing.JMenu close;
    private javax.swing.JMenu departmentmenu;
    private javax.swing.JComboBox<String> depcb;
    private javax.swing.JComboBox<String> empcb;
    private javax.swing.JMenu employeemenu;
    private javax.swing.JLabel errormsg;
    private javax.swing.JMenu homemenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu payrollmenu;
    private javax.swing.JComboBox<String> rankcb;
    // End of variables declaration//GEN-END:variables
}
