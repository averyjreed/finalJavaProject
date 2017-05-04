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
public class EmployeeLinkedList {
    
  // initialize class variable
    private EmployeeNode head;
    
	// empty constructor method
    public EmployeeLinkedList() 
	{  
    }

	// get method to linked list "head" node
    public EmployeeNode getHead() 
	{
            return head;
        // *** PROVIDE CODE HERE ***
    }

	// set method to linked list "head" node
    public void setHead(EmployeeNode head) 
	{
            this.head= head;
        // *** PROVIDE CODE HERE ***
    }
    
	// method to check if the linked list is empty
    public boolean isEmpty() 
    {
            if(head == null){
                return true;}
            else{
                return false;}
		 // *** PROVIDE CODE HERE ***
        }
	// method to add data to the linked list
         public void add(String fName, String lName, String employeeID, String gender, String ssn,
                        String phoneNumber, String email, String HireDate, String EndDate){ 
            if(isEmpty()){
                head = new EmployeeNode(fName, lName, employeeID, gender, ssn, phoneNumber, email, HireDate, EndDate);
            } else{
              EmployeeNode current = head;
              while(current.getNext() !=null){
                  current = current.getNext();
              }
              current.setNext(new EmployeeNode(fName, lName, employeeID, gender, ssn, phoneNumber, email, HireDate, EndDate) );
            }
        }
    
    
    
    
    
    
    
    
}
