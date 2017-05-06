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
public class AssignmentLinkedList {
    
    private AssignmentNode head;
    
	// empty constructor method
    public AssignmentLinkedList() 
	{  
    }

	// get method to linked list "head" node
    public AssignmentNode getHead() 
	{
            return head;
    }

	// set method to linked list "head" node
    public void setHead(AssignmentNode head) 
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
    
    public void add(String dname, String employeeID, String lName, String fName, String rank, String bdate, String edate){ 
            if(isEmpty()){
                head = new AssignmentNode(dname, employeeID, lName, fName, rank, bdate, edate);
            }
            else{
              AssignmentNode current = head;
              while(current.getNext() !=null){
                  current = current.getNext();
              }
              current.setNext(new AssignmentNode(dname, employeeID, lName, fName, rank, bdate, edate) );
            }
        }
        
        public Integer size(){
            
          Integer size = 0;
          AssignmentNode current = head;
            
            while(current != null){
                size++;
                
                current = current.getNext();
            }
            
          return size;
        }
    
}
