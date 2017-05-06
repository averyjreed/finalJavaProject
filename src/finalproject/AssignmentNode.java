/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author mattbentley
 */
public class AssignmentNode {
    
        private String dname;
	private String employeeID;
        private String lName;
	private String fName;
        private String rank;
        private String bdate;
        private String edate;       
        private AssignmentNode next;
    
    // constructor method
	public AssignmentNode(String dname, String employeeID, String lName, String fName, String rank, String bdate, String edate)
        {
        this.dname = dname;
        this.employeeID = employeeID;
        this.lName = lName;
        this.fName = fName;
        this.rank = rank;
        this.bdate = bdate;
        this.edate = edate;        
        this.next = next;
    }

    public String getDname() 
	{
            return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
	
    public String getEmployeeID(){
        return employeeID;
    }

    public void setEmployeeID(String employeeID){
        this.employeeID = employeeID;
    }

    public String getLname() 
	{
            return lName;
    }

        public void setlName(String lName) 
	{
            this.lName = lName;
    }
	
	public String getfName()
	{
            return fName;
	}

	public void setGender(String fName)
	{
            this.fName = fName;
	}
        
        public String getRank()
        {
            return rank;
        }
        
        public void setRank(String rank)
        {
            this.rank = rank;
        }
        
        public String getBdate()
	{
            return bdate;
	}

	public void setBdate(String bdate)
	{
            this.bdate= bdate;
	}
        
        public String getEdate()
	{
            return edate;
	}

	public void setEdate(String edate)
	{
            this.edate= edate;
	}
        
    // get method for the next node
	public AssignmentNode getNext() 
	{
            return next;
    }
	
	// set method for the next node
    public void setNext(AssignmentNode next) 
	{
            this.next = next;
    
    } 
	
}
