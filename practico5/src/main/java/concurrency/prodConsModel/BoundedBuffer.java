package concurrency.prodConsModel;

import concurrency.Semaphore;

public class BoundedBuffer {
	
    protected Object[] buf;
    protected int in = 0;
    protected int out= 0;
	protected int count= 0;
	protected int size;

	Semaphore full; //counts number of items
	Semaphore empty;//counts number of spaces

	public BoundedBuffer(int size) {
		this.size = size; 
		buf = (Object[])new Object[size];
		full = new Semaphore(0);
		empty= new Semaphore(size);
	}

	public synchronized void put(Object o) throws InterruptedException {
        System.out.print("put:");

		empty.down();
		buf[in] = o;
		++count;
		in=(in+1) % size;
        System.out.println(o);

		full.up();
	}

	public synchronized  Object get() throws InterruptedException{
        System.out.print("get:");

		full.down();

		Object o =buf[out];
		buf[out]=null;
		--count;
		out=(out+1) % size;
        System.out.println(o);

		empty.up();
		return (o);
	}
	
	
	
}
