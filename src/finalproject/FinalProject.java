package finalproject;

import java.util.Date;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import finalproject.EmployeeNode;
import finalproject.EmployeeLinkedList;

public class FinalProject {

    private static Formatter output;
    public static EmployeeLinkedList emplist;
    public static DepartmentLinkedList deplist;
    public static AssignmentLinkedList asnlist;
    public static PayrollLinkedList paylist;
    private static Scanner input;
    
    public static void main(String[] args) {
         
        openEmployeeFile();
        readEmployeeFile();
        openAssignmentFile();
        readAssignmentFile();
        openDepartmentFile();
        readDepartmentFile();
        //openPayrollFile();
        //readPayrollFile();

        new HomePage().setVisible(true); 
        
    }
    
    public static void openEmployeeFile(){
        
        try{
            input = new Scanner(Paths.get("Employees.txt"));
        }
        catch(IOException ioexception){
            System.err.print("Error opening file. Terminating");
            System.exit(1);
        }
    }
    
    public static void openAssignmentFile(){
        
        try{
            input = new Scanner(Paths.get("Assignments.txt"));
        }
        catch(IOException ioexception){
            System.err.print("Error opening file. Terminating");
            System.exit(1);
        }
    }
    
    public static void openDepartmentFile(){
        
        try{
            input = new Scanner(Paths.get("Departments.txt"));
        }
        catch(IOException ioexception){
            System.err.print("Error opening file. Terminating");
            System.exit(1);
        }
    }
    
    public static void openPayrollFile(){
        
        try{
            input = new Scanner(Paths.get("Paygrade.txt"));
        }
        catch(IOException ioexception){
            System.err.print("Error opening file. Terminating");
            System.exit(1);
        }
    }
    
    private static void readEmployeeFile(){
        emplist = new EmployeeLinkedList();
        
        try{
            while(input.hasNext()){
                emplist.add(input.next(), input.next(), input.next(), input.next(), input.next(), input.next(), input.next(), input.next(), input.next());
            }
        }
        catch(NoSuchElementException elementException){
            System.err.println("File improperly formed. Terminating.");
            System.exit(1);
        }
        catch(IllegalStateException stateException){
            System.err.println("Error reading from file. Terminating.");
            System.exit(1);
        }
        
        input.close();
    } // end of read employee
    
    private static void readAssignmentFile(){
        asnlist = new AssignmentLinkedList();
        
        try{
            while(input.hasNext()){
                asnlist.add(input.next(), input.next(), input.next(), input.next(), input.next(), input.next(), input.next());
            }
        }
        catch(NoSuchElementException elementException){
            System.err.println("File improperly formed. Terminating.");
            System.exit(1);
        }
        catch(IllegalStateException stateException){
            System.err.println("Error reading from file. Terminating.");
            System.exit(1);
        }
        
        input.close();
    } // end of read assignment
    
    private static void readDepartmentFile(){
        deplist = new DepartmentLinkedList();
        
        try{
            while(input.hasNext()){
                deplist.add(input.next());
            }
        }
        catch(NoSuchElementException elementException){
            System.err.println("File improperly formed. Terminating.");
            System.exit(1);
        }
        catch(IllegalStateException stateException){
            System.err.println("Error reading from file. Terminating.");
            System.exit(1);
        }
        
        input.close();
    } // end of read department
    
    private static void readPayrollFile(){
        paylist = new PayrollLinkedList();
        
        try{
            while(input.hasNext()){
                paylist.add(input.next(), input.next());
            }
        }
        catch(NoSuchElementException elementException){
            System.err.println("File improperly formed. Terminating.");
            System.exit(1);
        }
        catch(IllegalStateException stateException){
            System.err.println("Error reading from file. Terminating.");
            System.exit(1);
        }
        
        input.close();
    } // end of read payroll
    
    public static void writeEmployeeFile(){
        
        try{
            output = new Formatter("Employee.txt");
        }
        catch(SecurityException securityException){
            System.err.print("Write permission denied. Terminating");
            System.exit(1);
        }
        catch(FileNotFoundException fileException){
            System.err.print("Error opening file. Terminating");
            System.exit(1);
        }
        
        EmployeeNode eptr = FinalProject.emplist.getHead();
        for(int i = 0; i < emplist.size(); i++){
            try{
                output.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s%n", eptr.getEmployeeID(), eptr.getSsn(), eptr.getFname(), eptr.getLname(),
                        eptr.getGender(), eptr.getPhoneNumber(), eptr.getEmail(), eptr.getHireDate(), eptr.getEndDate());
                
                eptr = eptr.getNext();
            }
            catch(FormatterClosedException formatterClosedException){
                System.err.println("Error writing to Employees file. Terminating.");
                break;
            }
            
        }
        
        closeEmployeeFile();
    } // end of write employee
    
    public static void closeEmployeeFile(){
        if(output != null)
            output.close();
    }
    
    public static void closeAssignmentFile(){
        if(output != null)
            output.close();
    }
    
    public static void closeDepartmentFile(){
        if(output != null)
            output.close();
    }
    
    public static boolean verifyAlpha1(String fName){
        return fName.matches("[A-Z][a-zA-Z]*");
    }
    
    public static boolean verifyempID(String employeeID){
        return employeeID.matches("\\d{8}");
    }
    
    public static boolean verifydepcap(String department){
        return department.matches("[A-Z]*");
    }
    
    public static boolean verifyAlpha2(String lName){
        return lName.matches("[A-Z][a-zA-Z]*");
    }
 
    public static boolean verifySSN (String ssn){
    if (ssn.matches("\\d{3}-\\d{2}-\\d{4}"))
        return ssn.matches("\\d{3}-\\d{2}-\\d{4}");
    else if (ssn.matches("\\d{3} \\d{2} \\d{4}"))
        return ssn.matches("\\d{3} \\d{2} \\d{4}");
    else
        return ssn.matches("\\d{9}");
     }
    
    public static boolean validatePhoneNumber (String phoneNumber){
    if (phoneNumber.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}"))
        return phoneNumber.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    else if (phoneNumber.matches("[1-9]\\d{2}[1-9]\\d{6}"))
        return phoneNumber.matches("[1-9]\\d{2}[1-9]\\d{6}");
    else if (phoneNumber.matches("[1-9]\\d{2}.[1-9]\\d{2}.\\d{4}"))
        return phoneNumber.matches("[1-9]\\d{2}.[1-9]\\d{2}.\\d{4}");
    else
        return phoneNumber.matches("\\([1-9]\\d{2}\\)-[1-9]\\d{2}-\\d{4}");
    }
    
    public static boolean validateEmail(String email){
           return email.matches("\\S*[@]\\S*[.][a-zA-Z][a-zA-Z][a-zA-Z]");
    }
    
}
