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
public class DepartmentNode {
    
     private String dname;        
     private DepartmentNode next;
    
    
    public DepartmentNode(String dname)
        {
        this.dname = dname;     
        this.next = next;
    }

	
	// get method for fName
    public String getDname() 
	{
            return dname;
    }

	// set method for fName
    public void setDname(String dname) {
        this.dname = dname;
    }
    
    public DepartmentNode getNext() 
	{
            return next;
    }
	
	// set method for the next node
    public void setNext(DepartmentNode next) 
	{
            this.next = next;
    
    } 
}
