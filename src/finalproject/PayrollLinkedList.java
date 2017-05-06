package finalproject;

public class PayrollLinkedList {
    private DepartmentNode head;
    
	// empty constructor method
    public PayrollLinkedList() 
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
    /* USE INFO form Department Instead
	// method to add data to the linked list
         public void add(String fName, String lName, String employeeID, String gender, String ssn,
                        String phoneNumber, String email, String HireDate, String EndDate){ 
            if(isEmpty()){
                head = new EmployeeNode(fName, lName, employeeID, gender, ssn, phoneNumber, email, HireDate, EndDate);
            }
            else{
              EmployeeNode current = head;
              while(current.getNext() !=null){
                  current = current.getNext();
              }
              current.setNext(new EmployeeNode(fName, lName, employeeID, gender, ssn, phoneNumber, email, HireDate, EndDate) );
            }
        }
         */
        public Integer size(){
            
          Integer size = 0;
          PayrollNode current = head;
            
            while(current != null){
                size++;
                
                current = current.getNext();
            }
            
          return size;
        }
    
}
