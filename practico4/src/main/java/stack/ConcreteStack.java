package stack;

import randoop.CheckRep;

import java.util.LinkedList;
import java.util.List;

public class ConcreteStack<T> implements Stack<T>{

    List<T> stack;

    public ConcreteStack()
    {
        this.stack = new LinkedList<T>();
    }

    @Override
    public void push(T item) throws Exception {
        if( item == null )
        {
            throw new IllegalArgumentException();
        }
        stack.add(0, item);
    }

    @Override
    public T top() throws Exception {
        return stack.get(0);
    }

    @Override
    public T pop() throws Exception {
        if(isEmpty()) { throw new IllegalStateException(); }
        T item = top();
        stack.remove(0);
        return item;
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public void clear() {
        while(!isEmpty())
        {
            stack.remove(0);
        }
    }

    @CheckRep
    @Override
    public boolean repOk() {
        return checkNulls();
    }

    public boolean checkNulls()
    {
        for(T item : stack) {
            if (item == null) {
                return false;
            }
        }

        return true;
    }
}
