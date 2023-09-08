package stack;


/**
 *Interface that specifies the basic  API of 
 * TAD Stack. This interface corresponds to generic stack implementations
 * @param <T> type of the objects contained in the stack
 * @author Vale
 * @version 2021
 */
public interface Stack<T> {

	
		/** 
		 * It inserts item to the top of the item stack.
		 * @param item is the object to be inserted.
		 * @precondition. true  
		 * @postcondition. If the stack is not full, the item is inserted at the top of the stack. 
		 * If the insertion fails for any reason, it throws an exception of type Exception.
		 * @throws java.lang.Exception
		 */
	    public void push(T item) throws Exception;
	    
	    
	    /** 
		 * It returns the object on the top of the stack. 
		 * @return the object on the top of the stack.
		 * @precondition. stack  non	empty
		 * @postcondition. if the stack is nonempty, the top item is returned.
		 * If the stack is empty, an exception of type Exception is thrown. 
		 * @return the object on the top of the stack
		 * @throws java.lang.Exception
		 */
	    public T top() throws Exception;
	    
	    
	    /** It pops the element on the top of the stack and return it
		 * @precondition. stack  non	empty
		 * @postcondition. f the stack is not empty, it removes the element from the top.
		 * If the stack is empty, it throws an exception of type Exception. 
		 * @return the item on top of the stack
		 * @throws java.lang.Exception
		 */
	    public T pop() throws Exception;
	    
	
	    /**
		 * It indicates whether the stack is empty or not.
		 * @return true whether the stack is empty, false otherwise.
		 * @precondition. true.
		 */
	    public boolean isEmpty();
	    
	    /** 
		 * It removes all items from the stack.
		 * @precondition. true.
		 * @postcondition. It removes all items from the stack.
		 */
	    public void clear();
	    
	    
	    /**
	     * Indicates whether the representation of the stack is internally consistent.  
	     * @return true if and only if the representation of the stack is internally consistent.
	     * @precondition. true
	     */
	    public boolean repOk();
	
}
