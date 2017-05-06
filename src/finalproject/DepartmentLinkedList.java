/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import static finalproject.FinalProject.deplist;

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
    
    public void sortDepName(){
        DepartmentNode n0, n1, n2;
        
        for(int i = 1; i < deplist.size(); i++){
            
            n0 = head;
            n1 = head;
            n2 = n1.getNext();
            
            for(int j = 1; j < deplist.size(); j++){
                if(n1.getDname().compareTo(n2.getDname()) > 0)
                    swap(n0, n1, n2);
                
                if(j == 1)
                    n0 = head;
                else
                    n0 = n0.getNext();
                    n1 = n0.getNext();
                    n2 = n1.getNext();
                
                    
            } // end of inner for loop
        } // end of outer for loop
        }
    
    public void swap(DepartmentNode n0, DepartmentNode n1, DepartmentNode n2){
        DepartmentNode n3;
        
        n3 = n2.getNext();
        if(head == n1){
            head = n2;
            n2.setNext(n1);
            n1.setNext(n3);
            return;
        }
        
        n0.setNext(n2);
        n2.setNext(n1);
        n1.setNext(n3);
    }        
}
