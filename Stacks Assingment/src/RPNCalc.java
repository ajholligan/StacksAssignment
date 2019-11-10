
/**
 * @author Andrew Holligan
 * this class controls calculation
 */
public class RPNCalc 
{

	Stack stack;
	
	/**
	 * Constructor
	 */
	public RPNCalc()
	{ 
		stack = new Stack();
	}
	
	/**
	 * Does the calculation
	 * @param calculation takes in the calculation in string form
	 */
	public void calculation(String calculation)
	{ 
		
		String[] splitString = calculation.split(" ");
		try{
			for(int i = 0; i<splitString.length; i++)
			{
		
				
				if(splitString[i].equals("+"))
				{ 
					float num1 = stack.pop();
					float num2 = stack.pop();
					stack.push(num1+num2);
				}
				else if(splitString[i].equals("-"))
				{ 
					float num1 = stack.pop();
					float num2 = stack.pop();
					stack.push(num2-num1);
				}
				else if(splitString[i].equals("*"))
				{ 
					float num1 = stack.pop();
					float num2 = stack.pop();
					stack.push(num1*num2);
				}
				else if(splitString[i].equals("/"))
				{ 
					float num1 = stack.pop();
					float num2 = stack.pop();
					if (num1 == 0)
					{
						throw new DivisionByZeroException();
					}
					stack.push(num2/num1);
				}
				else
				{
					stack.push(Float.parseFloat(splitString[i]));
				}
			
		
			}	
			float temp = stack.pop();
				
			if (stack.stackEmpty() == false)
			{ 
				throw new NonEmptyStackException();
			}
			else 
			{
				System.out.println(temp);				
			}
		
		
		}
		catch(EmptyStackException e)
		{ 
			
			
		}
		catch (DivisionByZeroException e)
		{ 
			
		}
		catch (NumberFormatException e)
		{ 
			System.out.println("ERROR: There was an invalid character entered please only input + - / * or a number");
		}
		catch(NonEmptyStackException e)
		{ 
			
		}
	
	}
}
