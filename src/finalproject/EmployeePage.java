package finalproject;

import java.util.Enumeration;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;
import static finalproject.FinalProject.emplist;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.AbstractButton;
import javax.swing.JTable;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeePage extends javax.swing.JFrame {

    /**
     * Creates new form EmployeePage
     */
    public EmployeePage() {
        initComponents();
        emplist.sortEmpLname();
        showEmp();
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
        updatebutton = new javax.swing.JButton();
        currentbutton = new javax.swing.JButton();
        pastbutton = new javax.swing.JButton();
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

        etable.setBackground(new java.awt.Color(217, 204, 144));
        etable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmployeeID", "Last Name", "First Name", "Gender", "Phone", "Email", "Hire Date", "End Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        etable.setGridColor(new java.awt.Color(153, 153, 0));
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
        errorMsg.setText("Employees tab defaults to showing current and past employees when opened.");
        errorMsg.setSize(new java.awt.Dimension(100, 100));

        fName.setBackground(new java.awt.Color(191, 175, 107));
        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });

        lName.setBackground(new java.awt.Color(191, 175, 107));
        lName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameActionPerformed(evt);
            }
        });

        ssn.setBackground(new java.awt.Color(191, 175, 107));

        employeeID.setBackground(new java.awt.Color(191, 175, 107));

        phoneNumber.setBackground(new java.awt.Color(191, 175, 107));

        email.setBackground(new java.awt.Color(191, 175, 107));

        updatebutton.setText("Update");
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });

        currentbutton.setText("Current");
        currentbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentbuttonActionPerformed(evt);
            }
        });

        pastbutton.setText("Past");
        pastbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastbuttonActionPerformed(evt);
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
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(addbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(bmale)
                                                    .addComponent(updatebutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addComponent(bfemale))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(pastbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(currentbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HireDate, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(errorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(addbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updatebutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(currentbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pastbutton)))
                .addContainerGap(22, Short.MAX_VALUE))
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
        FinalProject.writeEmployeeFile();
        FinalProject.writeDepartmentFile();
        FinalProject.writeAssignmentFile();
        //FinalProject.writePayrollFile();
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
        Date chosenEndDate = EndDate.getDate();
        String end = String.format("%1$tm/%1$td/%1$tY", chosenEndDate);
        String hire = String.format("%1$tm/%1$td/%1$tY", chosenHireDate);
        if(end.equals("null/null/null"))
                end = "NA"; 
       
        if(!FinalProject.verifyAlpha1(fName.getText()))
            errorMsg.setText("Employee must have a valid First name");
        else if(!FinalProject.verifyAlpha2(lName.getText()))
            errorMsg.setText("Employee must hava a valid Last name");
        else if (!FinalProject.verifySSN(ssn.getText()))
            errorMsg.setText("Employee must have a valid Social Security Number, formatted XXX-XX-XXXX");
        else if(SameSsn(ssn.getText()))
            errorMsg.setText("Must use unique Social Security Number");
        else if(!FinalProject.verifyempID(employeeID.getText())) 
            errorMsg.setText("Employee must have a valid employee number with 8 digits, no spaces");
        else if(SameEmpId(employeeID.getText()))
            errorMsg.setText("Must use unique EmployeeID");
        else if(!FinalProject.validatePhoneNumber(phoneNumber.getText())) 
            errorMsg.setText("Employee must have a valid phone number");
        else if(!FinalProject.validateEmail(email.getText()))
            errorMsg.setText("Employee must have a valid email address"); 
        else if(hire.equals("null/null/null")){
            errorMsg.setText("No Hire Date was selected");
        }
        else if(!verifyDates(chosenHireDate, chosenEndDate))
            errorMsg.setText("End Date cannot be before the Hire Date"); 
        else if(!bmale.isSelected() && !bfemale.isSelected())
            errorMsg.setText("Please select either Male or Female");
        else{
                FinalProject.emplist.add(employeeID.getText(),ssn.getText(), fName.getText(), lName.getText(),
                                getGender(bgGender), phoneNumber.getText(), email.getText(), hire, end);
           
                model.setRowCount(0); // clears table
                emplist.sortEmpLname(); // resorts table to alphabetical
                showEmp(); // shows table based on new linked list
          
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
    
    public void showEmp(){
    DefaultTableModel model = (DefaultTableModel) etable.getModel();
        EmployeeNode eptr = FinalProject.emplist.getHead(); 
            for (int i = 0; i < FinalProject.emplist.size(); i++) {
           
                Object[] originalFiles = {eptr.getEmployeeID(), eptr.getLname(), eptr.getFname(), eptr.getGender(), eptr.getPhoneNumber(), eptr.getEmail(), eptr.getHireDate(), eptr.getEndDate()};
                model.addRow(originalFiles);
                
                eptr = eptr.getNext();
            }
    }
    
    private boolean verifyDates(Date hr, Date lv) {
        if(lv == null)
            return true;
        else if(hr.compareTo(lv) < 0)
            return true;
        
        return false;
    }
    
    public boolean SameEmpId(String empid){
     
    EmployeeNode eptr = FinalProject.emplist.getHead();
        for(int i = 0; i < FinalProject.emplist.size(); i++){
    
            if(empid.compareTo(eptr.getEmployeeID()) == 0)
                return true;
            eptr = eptr.getNext();
        }
        return false;
    }
    
    public boolean SameSsn(String ssn){
     
    EmployeeNode eptr = FinalProject.emplist.getHead();
        for(int i = 0; i < FinalProject.emplist.size(); i++){
    
            if(ssn.compareTo(eptr.getSsn()) == 0)
                return true;
            eptr = eptr.getNext();
        }
        return false;
    }
    
    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameActionPerformed

    private void lNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameActionPerformed

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
        
        errorMsg.setText("");
        DefaultTableModel model = (DefaultTableModel)etable.getModel();
        
        Date chosenEndDate = EndDate.getDate(); 
        String end = String.format("%1$tm/%1$td/%1$tY", chosenEndDate);
        
        if(etable.getSelectedRow() == -1){
            if(etable.getRowCount() == 0)
                errorMsg.setText("Table is empty");
            else
                errorMsg.setText("No Employee was selected");
        }   
        else if(end.equals("null/null/null"))
            errorMsg.setText("No End Date was chosen");
        else{
            
            if(noAsn(model.getValueAt(etable.getSelectedRow(), 0).toString())){
                
                EmployeeNode eptr = FinalProject.emplist.getHead();
                for(int i = 0; i < FinalProject.emplist.size(); i++){

                if(model.getValueAt(etable.getSelectedRow(), 0).toString().equals(eptr.getEmployeeID())){

                    String hireDateString = eptr.getHireDate();
                    DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
                    Date hireDate;
                    try{
                        hireDate = (Date)df.parse(hireDateString);
                    }
                    catch(Exception e){
                        e.printStackTrace();
                        return;
                    }   

                    if(!verifyDates(hireDate, chosenEndDate))
                        errorMsg.setText("Chosen End Date is before Hire Date");
                    else{
                        eptr.setEndDate(end);
                        model.setValueAt(end, etable.getSelectedRow(), 7);
                        EndDate.setDate(null);
                        }
                }

                eptr = eptr.getNext();
                } // end of linked list for loop 
            }
            else
                errorMsg.setText("To update, employee cannot have an assignment. Remove employee from her/his assignment please");
        }          
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void currentbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentbuttonActionPerformed
        CurrentEmployees();
    }//GEN-LAST:event_currentbuttonActionPerformed

    private void pastbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastbuttonActionPerformed
        PastEmployees();
    }//GEN-LAST:event_pastbuttonActionPerformed

    public boolean noAsn(String eid){
        
        AssignmentNode aptr = FinalProject.asnlist.getHead();
        for(int i = 0; i < FinalProject.asnlist.size(); i++){
        
            if(eid.equals(aptr.getEmployeeID())){
                if(aptr.getEdate().equals("NA"))
                    return false;

            }
        aptr = aptr.getNext();
        }
        
        return true;
    }
    
    private void CurrentEmployees(){
    DefaultTableModel model = (DefaultTableModel) etable.getModel();
    
    model.setRowCount(0);
    
    EmployeeNode eptr = FinalProject.emplist.getHead();
    for(int i = 0; i < FinalProject.emplist.size(); i++){
    if(eptr.getEndDate().equals("NA")){
    Object[] newRowData={eptr.getEmployeeID(), eptr.getLname(), eptr.getFname(), eptr.getGender(), eptr.getPhoneNumber(), eptr.getEmail(), eptr.getHireDate(), eptr.getEndDate()};
    model.addRow(newRowData);
    }
    eptr = eptr.getNext();
    
    }
    errorMsg.setText("Current Employees are displayed.");
    }
    
    private void PastEmployees(){
    DefaultTableModel model = (DefaultTableModel) etable.getModel();
    
    model.setRowCount(0);
    
    EmployeeNode eptr = FinalProject.emplist.getHead();
    for(int i = 0; i < FinalProject.emplist.size(); i++){
    if(!eptr.getEndDate().equals("NA")){
    Object[] newRowData={eptr.getEmployeeID(), eptr.getLname(), eptr.getFname(), eptr.getGender(), eptr.getPhoneNumber(), eptr.getEmail(), eptr.getHireDate(), eptr.getEndDate()};
    model.addRow(newRowData);
    }
    eptr = eptr.getNext();
    
    }
    errorMsg.setText("Past Employees are displayed.");
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
    private javax.swing.JButton currentbutton;
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
    private javax.swing.JButton pastbutton;
    private javax.swing.JMenu payrollmenu;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JTextField ssn;
    private javax.swing.JButton updatebutton;
    // End of variables declaration//GEN-END:variables
}
