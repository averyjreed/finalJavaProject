package finalproject;

import static finalproject.FinalProject.emplist;
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
            if(head == null)
                return true;
            else
                return false;
    }
    
	// method to add data to the linked list
         public void add(String employeeID, String ssn, String fName, String lName, String gender,
                        String phoneNumber, String email, String HireDate, String EndDate){ 
            if(isEmpty()){
                head = new EmployeeNode(employeeID, ssn, fName, lName, gender, phoneNumber, email, HireDate, EndDate);
            }
            else{
              EmployeeNode current = head;
              while(current.getNext() != null){
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
    
    public void sortEmpLname(){
        EmployeeNode n0, n1, n2;
        
        for(int i = 1; i < emplist.size(); i++){
            
            n0 = head;
            n1 = head;
            n2 = n1.getNext();
            
            for(int j = 1; j < emplist.size(); j++){
                if(n1.getLname().compareTo(n2.getLname()) > 0)
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
    
    public void swap(EmployeeNode n0, EmployeeNode n1, EmployeeNode n2){
        EmployeeNode n3;
        
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
