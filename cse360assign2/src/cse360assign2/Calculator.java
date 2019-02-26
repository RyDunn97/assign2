//Name: Ryan Dunn
//Class ID: 368
//Assignment: 2
//Description: 

package cse360assign2;

public class Calculator {

	private int total;
	
	/**
	 * Class constructor. Initializes object variable total to 0. 
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the current value of the total variable.
	 * 
	 * @return the current value of the total variable of the object
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * Adds the parameter to the total variable.
	 * 
	 * @param value amount to add to the total
	 */
	public void add (int value) 
	{
		total = value + total;
	}
	
	/**
	 * Subtracts the parameter from the total variable. 
	 * 
	 * @param value amount to subtract from the total
	 */
	public void subtract (int value) 
	{
		total = total - value;
	}
	
	/**
	 * Multiplies the parameter by the total variable.
	 * 
	 * @param value amount to multiply the total by
	 */
	public void multiply (int value) 
	{
		total = total * value;
	}
	
	/**
	 * Divides the total by the parameter. Uses integer division.
	 * If the parameter is 0, the total variable is set to 0 in order to
	 * avoid an exception.
	 * 
	 * @param value amount to divide the total by
	 */
	public void divide (int value) 
	{
		if(value == 0)
			total = 0;
		else
			total = total/value;
	}
	
	/**
	 * Returns the history of all actions made.
	 * 
	 * @return
	 */
	public String getHistory () 
	{
		return "";
	}
}
