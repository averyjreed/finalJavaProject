package finalproject;

import java.util.Date;

/**
 *
 * @author mattbentley
 */
public class FinalProject {

    
    public static void main(String[] args) {
        EmployeeNode eptr;
        EmployeeLinkedList employee = new EmployeeLinkedList();
        
        
        
        
        
        
        
        
        
        new HomePage().setVisible(true); 
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
