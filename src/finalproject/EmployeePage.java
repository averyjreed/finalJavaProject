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
        jTable1 = new javax.swing.JTable();
        bmale = new javax.swing.JRadioButton();
        bfemale = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        homemenu = new javax.swing.JMenu();
        employeemenu = new javax.swing.JMenu();
        departmentmenu = new javax.swing.JMenu();
        assignmentmenu = new javax.swing.JMenu();
        payrollmenu = new javax.swing.JMenu();
        close = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bmale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bfemale)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bmale)
                            .addComponent(bfemale))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homemenuMouseClicked

        HomePage hp = new HomePage();
        hp.setVisible(true);
        dispose();
    }//GEN-LAST:event_homemenuMouseClicked

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
    private javax.swing.JMenu assignmentmenu;
    private javax.swing.JRadioButton bfemale;
    private javax.swing.ButtonGroup bgGender;
    private javax.swing.JRadioButton bmale;
    private javax.swing.JMenu close;
    private javax.swing.JMenu departmentmenu;
    private javax.swing.JMenu employeemenu;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu payrollmenu;
    // End of variables declaration//GEN-END:variables
}
