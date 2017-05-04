/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author averyreed
 */
public class EmployeeNode {

    // initialize class variables
	private String fName;
	private String lName;
        private String ssn;
	private String gender;
        private String employeeID;
        private String phoneNumber;
        private String email;
        private String HireDate;
        private String EndDate;        
        private EmployeeNode next;
    
    // constructor method
	public EmployeeNode(String fName, String lName, String ssn, String gender,
                            String employeeID, String phoneNumber, String email, String HireDate, String EndDate)
        {
        this.fName = fName;
        this.lName = lName;
        this.ssn = ssn;
        this.gender = gender;
        this.employeeID = employeeID;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.HireDate = HireDate;
        this.EndDate = EndDate;        
        this.next = next;
    }

	
	// get method for fName
    public String getFname() 
	{
            return fName;
    }

	// set method for fName
    public void setFname(String fName) {
        this.fName = fName;
    }
	
    public String getLname(){
        return lName;
    }

    public void setLname(String lName){
        this.lName = lName;
    }

	// get method for ssn
    public String getSsn() 
	{
            return ssn;
    }

        public void setSsn(String ssn) 
	{
            this.ssn = ssn;
    }
	
	public String getGender()
	{
            return gender;
	}

	// set method for gender
	public void setGender(String gender)
	{
            this.gender = gender;
	}
        
        public String getEmployeeID ()
        {
            return employeeID;
        }
        
        public void setEmployeeID (String employeeID)
        {
            this.employeeID = employeeID;
        }
        
        public String getPhoneNumber()
	{
            return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
            this.phoneNumber= phoneNumber;
	}
        
        public String getEmail()
	{
            return email;
	}

	public void setEmail(String email)
	{
            this.email= email;
	}
        
        public String getHireDate()
	{
            return HireDate;
	}

	public void setHireDate(String HireDate)
	{
            this.HireDate= HireDate;
	}
        
        public String getEndDate()
	{
            return EndDate;
	}

	public void setEndDate(String EndDate)
	{
            this.EndDate= EndDate;
	}

    // get method for the next node
	public EmployeeNode getNext() 
	{
            return next;
    }
	
	// set method for the next node
    public void setNext(EmployeeNode next) 
	{
            this.next = next;
    
    } 
	
}	// end EmployeeNode class