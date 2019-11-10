
/**
 * This method controls the list
 * @author Andrew Holligan
 *
 */
public class List {
	
	 private ListNode head; // used to hold a reference to an instance of a ListNode object
	    // which will be the first item in the list, i.e. at the 'head'
	    // of the list

	    /**
	     * Default constructor. Initialise fields to default values.
	     */
	    public List()
	    {
	        // set the list to be empty, i.e. not referring to anything valid yet
	        head = null;
	    }

	    /**
	     * Get the list node which is at the 'head' of the list
	     * 
	     * @return A reference to a ListNode object which represents the node at the
	     *         head of the list (or null if the list is empty, i.e. no 'head' has
	     *         been set yet).    
	     */
	    public ListNode getHead()
	    {
	        return head;
	    }

	    /**
	     * Set the 'head' of the list to the given node
	     * 
	     * @param  newHead A reference to a ListNode object which will be
	     *                 the head of the list. 
	     *                 
	     * NOTE: if a list already exists, the existing listing will be 
	     * lost since the head is being assigned to something new.
	     */
	    public void setHead(ListNode newHead)
	    {
	        head = newHead;
	    }

	    /**
	     * Add a new node to the start of the list 
	     * 
	     * @param num the number to be added to the list 
	     */
	    public void addToList(float num)
	    {
	        
	    	ListNode newNode = new ListNode(num);
	    	newNode.setNextPoint(getHead());
	    	setHead(newNode);
	    	
	    	
	    	
	    }
	    
//	    public ListNode search(float input)
//	    { 
//	    	
//	    	if (head != null)
//			{ 
//				
//				ListNode pointer = null;
//				pointer = head;
//				
//				while(pointer.getNextPoint() != null)
//				{	
//					
//					if  (pointer.getNum()== input)
//					{ 
//						return pointer;
//					}
//					
//					pointer = pointer.getNextPoint();	
//					
//					if(pointer.getNum() == input)
//					{ 
//						return pointer;
//					}
//					
//				}
//			}
//			
//		 
//			return null;
//	    }
	    
//	    public void interpretSearch(float input)
//	    { 
//	    	
//	    	if (search(input) == null)
//	    	{ 
//	    		System.out.println("This ID was not found in the list");
//	    	}
//	    	
//	    	else
//	    		System.out.println(search(input).getSummaryData());
//	    		
//	    	
//	    	
//	    }
	    
//	    public void printTest()
//		{ 
//	    
//			if (head != null)
//			{ 
//				System.out.println(head.getSummaryData());
//				
//				ListNode pointer = null;
//				pointer = head;
//				
//				while(pointer.getNextPoint() != null)
//				{	
//				pointer = pointer.getNextPoint();
//				System.out.println(pointer.getSummaryData());
//				}
//			}
//			
//			else 
//			{ 
//				System.out.println("This list is empty");
//			}
//			 
//				
//			
//		}
//	    
	  

	   /**
	    * removes list nodes
	 * @return returns the pointer of the node being removed
	 */
	public ListNode removeFromList()
	   { 
		   if(head == null)
		   { 
			   return null;
		   }
		   
		   ListNode pointer = head;
		   head = pointer.getNextPoint();
		   return pointer;
		   
	   }
	   
//	   public ListNode previousNode(ListNode nextNode)
//	   { 
//		   
//		   ListNode pointer = getHead();
//		   ListNode lastNode = null;
//		   
//		   do {	
//			   if  (pointer == nextNode)
//				{ 
//				   
//					return lastNode;
//				}
//				
//				
//			   lastNode = pointer;
//				pointer = pointer.getNextPoint();
//			   
//				
//			}
//		   	while(pointer != null);
//		   
//		   return null;
//	   }
//	
}
