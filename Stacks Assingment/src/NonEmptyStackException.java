
/**
 * @author Andrew Holligan
 * non empty stack exception
 */
public class NonEmptyStackException extends Exception
{
	
	public NonEmptyStackException()
	{ 
		System.out.println("ERROR: The Stack was not empty after the calculation ensure the RPN notation is correct");
	}
	
}
