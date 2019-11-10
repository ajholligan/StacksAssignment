
/**
 * This class controls the stack
 * @author Andrew Holligan
 *
 */
public class Stack {
	
	private List list;
	
	
	/**
	 * Contructor 
	 */
	public Stack()
	{ 
		list = new List();
	}
	
	
	/**
	 * This method pushes a float to the stack
	 * @param num this is a float which holds the value to be pushed to the stack
	 */
	public void push(float num)
	{ 
		list.addToList(num);
	}
	
	/**
	 * Pops value from the stack
	 * @return returns the number in the list node
	 * @throws EmptyStackException if an empty stack is poped it throws this exception
	 */
	public float pop() throws EmptyStackException
	{ 
		ListNode pointer =list.removeFromList();
		if (pointer == null)
		{ 
			throw new EmptyStackException();
		}
		
		return pointer.getNum();
	}
	
	/**
	 * @return boolean true or false if the stack is empty or not
	 */
	public boolean stackEmpty()
	{ 
		if (list.getHead() == null)
		{ 
			return true;
		}
		else 
		{ 
			return false;
		}
	}

}
