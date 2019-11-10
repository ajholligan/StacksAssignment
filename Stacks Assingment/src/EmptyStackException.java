/**
 * 
 */

/**
 * @author aholl
 * empty stack exception
 */
public class EmptyStackException extends Exception 
{

	public EmptyStackException()
	{ 
		System.out.println("ERROR: Stack empty please ensure the RPN format correct");
	}
	
}
