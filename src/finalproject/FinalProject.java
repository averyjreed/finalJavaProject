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

    private static Formatter outputer;
    public static EmployeeLinkedList empplist;
    
    public static void main(String[] args) {
         
        openEmployeeFile();
        
        new HomePage().setVisible(true); 
        
        closeEmployeeFile();
    }
    
    public static void openEmployeeFile(){
        
        try{
            outputer = new Formatter("Employees.txt");
        }
        catch(SecurityException securityException){
            System.err.print("Write permission denied. Terminating");
            System.exit(1);
        }
        catch(FileNotFoundException fileNotFoundException){
            System.err.print("Error opening file. Terminating");
            System.exit(1);
        }
    }
    
    public static void closeEmployeeFile(){
        if(outputer != null)
            outputer.close();
    }
    
    public static boolean verifyAlpha1(String fName){
        return fName.matches("[A-Z][a-zA-Z]*");
    }
    
    public static boolean verifyempID(String employeeID){
        return employeeID.matches("\\d{8}");
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
    
    private boolean verifyDates(Date hr, Date lv) {
        if (hr.compareTo(lv) < 0) 
            return true;
        return false;}
}
