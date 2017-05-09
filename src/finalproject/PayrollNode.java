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


public class PayrollNode {
    private PayrollNode next;
    private String derp;
    
    
    public PayrollNode(String derp){
        this.next = next;
    }
    
        // get method for the next node
	public String getDerp() 
	{
            return derp;
    }
	
	// set method for the next node
    public void setDerp(String derp) 
	{
            this.derp = derp;
    
    } 
    
    // get method for the next node
	public PayrollNode getNext() 
	{
            return next;
    }
	
	// set method for the next node
    public void setNext(PayrollNode next) 
	{
            this.next = next;
    
    } 
}
