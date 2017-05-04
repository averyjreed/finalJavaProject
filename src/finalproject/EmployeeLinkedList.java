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
    }

	// set method to linked list "head" node
    public void setHead(EmployeeNode head) 
	{
            this.head= head;
    }
    
	// method to check if the linked list is empty
    public boolean isEmpty() 
    {
            if(head == null){
                return true;}
            else{
                return false;}
    }
    
	// method to add data to the linked list
         public void add(String employeeID, String ssn, String fName, String lName, String gender,
                        String phoneNumber, String email, String HireDate, String EndDate){ 
            if(isEmpty()){
                head = new EmployeeNode(employeeID, ssn, fName, lName, gender, phoneNumber, email, HireDate, EndDate);
            }
            else{
              EmployeeNode current = head;
              while(current.getNext() !=null){
                  current = current.getNext();
              }
              current.setNext(new EmployeeNode(employeeID, ssn, fName, lName, gender, phoneNumber, email, HireDate, EndDate) );
            }
        }
         
        public Integer size(){
            
          Integer size = 0;
          EmployeeNode current = head;
            
            while(current != null){
                size++;
                
                current = current.getNext();
            }
            
          return size;
        }
    
}
