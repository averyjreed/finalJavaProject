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
public class DepartmentLinkedList {
    private DepartmentNode head;
    
	// empty constructor method
    public DepartmentLinkedList() 
	{  
    }

	// get method to linked list "head" node
    public DepartmentNode getHead() 
	{
            return head;
    }

	// set method to linked list "head" node
    public void setHead(DepartmentNode head) 
	{
            this.head = head;
    }
    
	// method to check if the linked list is empty
    public boolean isEmpty() 
    {
            if(head == null){
                return true;}
            else{
                return false;}

    }
   
    public void add(String dname){ 
            if(isEmpty()){
                head = new DepartmentNode(dname);
            }
            else{
              DepartmentNode current = head;
              while(current.getNext() !=null){
                  current = current.getNext();
              }
              current.setNext(new DepartmentNode(dname) );
            }
        }
        
        public Integer size(){
            
          Integer size = 0;
          DepartmentNode current = head;
            
            while(current != null){
                size++;
                
                current = current.getNext();
            }
            
          return size;
        }
    
}
