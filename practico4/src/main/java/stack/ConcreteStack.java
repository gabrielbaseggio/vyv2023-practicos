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
    public void push(T item) throws Exception
    {
        if( item == null )
        {
            throw new IllegalArgumentException();
        }
        stack.add(0, item);
    }

    @Override
    public T top() throws Exception
    {
        return stack.get(0);
    }

    @Override
    public T pop() throws Exception
    {
        if(isEmpty()) { throw new IllegalStateException(); }
        T item = top();
        stack.remove(0);
        return item;
    }

    @Override
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    @Override
    public int size()
    {
        return stack.size();
    }

    @Override
    public T get(int index) {
        return stack.get(index);
    }

    @Override
    public void clear()
    {
        while(!isEmpty())
        {
            stack.remove(0);
        }
    }

    @CheckRep
    @Override
    public boolean repOk()
    {
        return checkNulls();
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null) { return false; }
        if(obj == this) { return true;  }
        if(this.getClass() != obj.getClass()) { return false; }
        Stack<T> other = (ConcreteStack<T>) obj;
        if(size() != other.size()) { return false; }

        int index = 0;
        for(T item : stack)
        {
            if(!item.equals(other.get(index))) { return false; }
        }

        return true;
    }

    @Override
    public String toString()
    {
        return stack.toString();
    }

    @Override
    public int hashCode()
    {
        return stack.hashCode();
    }

    private boolean checkNulls()
    {
        for(T item : stack) {
            if (item == null) {
                return false;
            }
        }

        return true;
    }
}
