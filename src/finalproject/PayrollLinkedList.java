package finalproject;

public class PayrollLinkedList {
    private PayrollNode head;
    
	// empty constructor method
    public PayrollLinkedList() 
	{  
    }

	// get method to linked list "head" node
    public PayrollNode getHead() 
	{
            return head;
    }

	// set method to linked list "head" node
    public void setHead(PayrollNode head) 
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
