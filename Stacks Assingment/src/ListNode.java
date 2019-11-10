
public class ListNode {

	  // fields to store the data being held in this list node (a student ID and mark)
    private float num;
   
    private ListNode nextPoint;
    
  

    /**
     * Default constructor. Initialise fields to default values
     */
    public ListNode()
    {
        // set num to default / empty values 
        num = 0;
        nextPoint = null;
        
    }

 
       
    
    /**
     * @param number
     */
    public ListNode(float number)
    {
        // set num to values provided
    	num = number;
    }

    /**
     * Get the number contained in this list node
     * @return The number as a float
     */
    public float getNum()
    {
        return num;
    }

   

    /**
     * Get the next node in the list after this one
     * 
     * @return A reference to the next node (or null if
     *         there is no next node)
     */
    public ListNode getNextPoint()
    {
       return nextPoint;
    }

    /**
     * Set the next node in the list after this one
     * 
     * @param next A reference to a ListNode object which 
     *             represents the next node in the list after
     *             this one.
     */
    public void setNextPoint(ListNode next)
    {
    	nextPoint = next;
    	
    }

    /**
     * Return a string containing summary data from this node
     * 
     * @return A String containing a summary of the data contained in this list node
     */
    public float getSummaryData()
    {
        float data;		
        data = num;		
        return data;
    }
	
}
