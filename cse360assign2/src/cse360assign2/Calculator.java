//Name: Ryan Dunn
//Class ID: 368
//Assignment: 2
//Description: This class has an integer which can have simple integer
//	arithmetic operations performed on it. It can return the value of that
//	integer and a string with the history of all actions performed. 

package cse360assign2;

public class Calculator {

	private int total;
	private String history;
	
	/**
	 * Class constructor. Initializes object variable total to 0. 
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0 ";
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
	 * Adds addition symbol and input to the history string.
	 * 
	 * @param value amount to add to the total
	 */
	public void add (int value) 
	{
		total = value + total;
		history = history + "+ " + value + " ";
	}
	
	/**
	 * Subtracts the parameter from the total variable. 
	 * Adds subtraction symbol and input to the history string.
	 * 
	 * @param value amount to subtract from the total
	 */
	public void subtract (int value) 
	{
		total = total - value;
		history = history + "- " + value + " ";
	}
	
	/**
	 * Multiplies the parameter by the total variable.
	 * Adds multiplication symbol and input to the history string.
	 * 
	 * @param value amount to multiply the total by
	 */
	public void multiply (int value) 
	{
		total = total * value;
		history = history + "* " + value + " ";
	}
	
	/**
	 * Divides the total by the parameter. Uses integer division.
	 * If the parameter is 0, the total variable is set to 0 in order to
	 * avoid an exception. Add's to history string if parameter not 0.
	 * 
	 * @param value amount to divide the total by
	 */
	public void divide (int value) 
	{
		if(value == 0)
			total = 0;
		else
		{
			total = total/value;
			history = history + "/ " + value + " ";

		}
	}
	
	/**
	 * Returns the history of all actions made.
	 * 
	 * @return
	 */
	public String getHistory () 
	{
		return history;
	}
}
