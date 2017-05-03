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
import java.text.DateFormat;
import java.text.SimpleDateFormat;



public class EmployeePage extends javax.swing.JFrame {

    /**
     * Creates new form EmployeePage
     */
    public EmployeePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGender = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        etable = new javax.swing.JTable();
        bmale = new javax.swing.JRadioButton();
        bfemale = new javax.swing.JRadioButton();
        HireDate = new com.toedter.calendar.JDateChooser();
        EndDate = new com.toedter.calendar.JDateChooser();
        addbutton = new javax.swing.JButton();
        errorMsg = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        lName = new javax.swing.JTextField();
        ssn = new javax.swing.JTextField();
        employeeID = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
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
        jLabel1.setText("Reed-Bentley Construction Employees");
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel23.setText("First Name:");
        jLabel23.setToolTipText("");

        jLabel22.setText("Last Name:");

        jLabel2.setText("Social Security #:");

        jLabel3.setText("Employee ID:");

        jLabel4.setText("Phone:");

        jLabel5.setText("Email:");

        jLabel6.setText("Hire Date:");

        jLabel7.setText("End Date:");

        jLabel8.setText("Gender:");

        etable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmployeeID", "First Name", "Last Name", "Gender", "Phone", "Email", "Hire Date", "End Date"
            }
        ));
        jScrollPane1.setViewportView(etable);

        bgGender.add(bmale);
        bmale.setText("Male");
        bmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmaleActionPerformed(evt);
            }
        });

        bgGender.add(bfemale);
        bfemale.setText("Female");
        bfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfemaleActionPerformed(evt);
            }
        });

        addbutton.setText("Add");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        errorMsg.setForeground(new java.awt.Color(255, 0, 51));
        errorMsg.setSize(new java.awt.Dimension(100, 100));

        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });

        lName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameActionPerformed(evt);
            }
        });

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
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(14, 14, 14)
                                .addComponent(lName))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fName))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ssn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(employeeID))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email)
                                    .addComponent(phoneNumber)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(EndDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bmale))
                                        .addGap(18, 18, 18)
                                        .addComponent(bfemale))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HireDate, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(employeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(HireDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EndDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(bfemale)
                            .addComponent(bmale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addbutton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homemenuMouseClicked

        HomePage hp = new HomePage();
        hp.setVisible(true);
        dispose();
    }//GEN-LAST:event_homemenuMouseClicked

    private boolean verifyDates(Date hr, Date lv) {
        if (hr.compareTo(lv) < 0) 
            return true; 
        return false;}
    
    /* String hireDateString = eptr.getHiredate();
    DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
    Date hireDate; 
    
    try{ 
        hireDate = (Date)df.parse(hireDateString);} 
    
    catch(Exception e) {
        e.printStackTrace(); 
        return; } */ // converting date back to object
    
    private String getGender(ButtonGroup buttonGroup) {
        for (Enumeration < AbstractButton > buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
                
            }
        }
        return ""; //returns an empty string, if no radio button is selected
    }
    
    private void employeemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeemenuMouseClicked
        
    }//GEN-LAST:event_employeemenuMouseClicked

    private void employeemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeemenuActionPerformed

    }//GEN-LAST:event_employeemenuActionPerformed

    private void departmentmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentmenuMouseClicked
        DepartmentPage dp = new DepartmentPage();
        dp.setVisible(true);
        dispose();
    }//GEN-LAST:event_departmentmenuMouseClicked

    private void assignmentmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignmentmenuMouseClicked
        AssignmentPage ap = new AssignmentPage();
        ap.setVisible(true);
        dispose();
    }//GEN-LAST:event_assignmentmenuMouseClicked

    private void payrollmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payrollmenuMouseClicked
        PayrollPage pp = new PayrollPage();
        pp.setVisible(true);
        dispose();
    }//GEN-LAST:event_payrollmenuMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed

    }//GEN-LAST:event_closeActionPerformed

    private void bmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bmaleActionPerformed

    private void bfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bfemaleActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        
        errorMsg.setText("");
        
        DefaultTableModel model = (DefaultTableModel)etable.getModel();
        Date chosenHireDate = HireDate.getDate(); 
        String hire = String.format("%1$tm/%1$td/%1$tY", chosenHireDate);
       
        Date chosenEndDate = EndDate.getDate(); 
        String end = String.format("%1$tm/%1$td/%1$tY", chosenEndDate);
        
        if(!FinalProject.verifyAlpha1(fName.getText())){
            errorMsg.setText("Employee must have a valid First name");
        }
        else if(!FinalProject.verifyAlpha2(lName.getText())){
            errorMsg.setText("Employee must hava a valid Last name");
        }
        else if (!FinalProject.verifySSN(ssn.getText())){
            errorMsg.setText("Employee must have a valid Social Security Number");
        }
        else if(!FinalProject.verifyempID(employeeID.getText())) {
            errorMsg.setText("Employee must have a valid employee number");}
        else if(!FinalProject.validatePhoneNumber(phoneNumber.getText())) {
            errorMsg.setText("Employee must have a valid phone number");
        }
         else if(!FinalProject.validateEmail(email.getText())){
            errorMsg.setText("Employee must have a valid email address");
        }
        else if(hire.equals("null/null/null")){
            errorMsg.setText("No Hire Date was selected.");
        }
        else if(!bmale.isSelected() && !bfemale.isSelected()){
            errorMsg.setText("Please select either Male or Female");
        }
         else{
           model.addRow(new Object[] {employeeID.getText(), fName.getText(), lName.getText(), getGender(bgGender), phoneNumber.getText(), email.getText(), hire, end} );
           fName.setText("");
           lName.setText("");
           employeeID.setText("");
           phoneNumber.setText("");
           email.setText("");
           ssn.setText("");
           HireDate.setDate(null);
           EndDate.setDate(null);
         }
                                          
    }//GEN-LAST:event_addbuttonActionPerformed

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameActionPerformed

    private void lNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser EndDate;
    private com.toedter.calendar.JDateChooser HireDate;
    private javax.swing.JButton addbutton;
    private javax.swing.JMenu assignmentmenu;
    private javax.swing.JRadioButton bfemale;
    private javax.swing.ButtonGroup bgGender;
    private javax.swing.JRadioButton bmale;
    private javax.swing.JMenu close;
    private javax.swing.JMenu departmentmenu;
    private javax.swing.JTextField email;
    private javax.swing.JTextField employeeID;
    private javax.swing.JMenu employeemenu;
    private javax.swing.JLabel errorMsg;
    private javax.swing.JTable etable;
    private javax.swing.JTextField fName;
    private javax.swing.JMenu homemenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lName;
    private javax.swing.JMenu payrollmenu;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JTextField ssn;
    // End of variables declaration//GEN-END:variables
}
