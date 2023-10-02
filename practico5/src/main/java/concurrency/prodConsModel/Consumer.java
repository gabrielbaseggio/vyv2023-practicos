package concurrency.prodConsModel;

import java.util.concurrent.CyclicBarrier;

public class Consumer extends Thread{
	
	BoundedBuffer queue;
	CyclicBarrier barrier;
	
	public Consumer(BoundedBuffer q, CyclicBarrier b) {
		this.queue = q;		
		barrier =  b;
	}
	
	public void run() {
		try {
			
			barrier.await();
		    for (int i = 3; i > 0; --i) {
		         
		        Object g =queue.get();
		        
		       // System.out.println("get:" + g);

		    }
		    
		} catch (Exception e) {
			throw new RuntimeException(e); 
		}
	}
}
