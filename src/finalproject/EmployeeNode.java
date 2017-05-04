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
	private String lastName;
        private String ssn;
	private String gender;
        private String employeeID;
        private String phoneNumber;
        private String email;
        private String hireDate;
        private String endDate;        
        private EmployeeNode next;
    
    // constructor method
	public EmployeeNode(String fName, String lastName, String ssn, String gender,
                            String employeeID, String phoneNumber, String email, String hireDate, String endDate)
        {
        this.fName = fName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.gender = gender;
        this.employeeID = employeeID;
        this.phoneNumber= phoneNumber;
        this.email = email;
        this.hireDate = hireDate;
        this.endDate = endDate;        
        this.next = null;
    }

	
	// get method for fName
    public String getFname() 
	{
            return fName;
        // *** PROVIDE CODE HERE ***
    }

	// set method for fName
    public void setFname(String fName) {
        this.fName = fName;
    }
	
    public String getLname(){
        return lastName;
    }

    public void setLname(String lastName){
        this.lastName = lastName;
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
            this.gender= gender;
	}
        
        public String getEmployeeID (String employeeID)
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

	// set method for gender
	public void setPhoneNumber(String phoneNumber)
	{
            this.phoneNumber= phoneNumber;
	}
        
        public String getEmail()
	{
            return email;
	}

	// set method for gender
	public void setEmail(String email)
	{
            this.email= email;
	}
        
        public String getHireDate()
	{
            return hireDate;
	}

	// set method for gender
	public void setHireDate(String hireDate)
	{
            this.hireDate= hireDate;
	}
        
        public String getEndDate()
	{
            return endDate;
	}

	// set method for gender
	public void setEndDate(String endDate)
	{
            this.endDate= endDate;
	}

    // get method for the next node
	public EmployeeNode getNext() 
	{
            return next;
        // *** PROVIDE CODE HERE ***
    }
	
	// set method for the next node
    public void setNext(EmployeeNode next) 
	{
            this.next = next;
        // *** PROVIDE CODE HERE ***
        
    } 
	
}	// end EmployeeNode class