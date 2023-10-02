package concurrency.prodConsModel;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Producer extends Thread{
	
	BoundedBuffer queue;
	CyclicBarrier barrier;

	 
	
	public Producer(BoundedBuffer q, CyclicBarrier b) {
		this.queue = q;
		this.barrier = b;
		
	}
	
	public void run() {
		try {
			barrier.await();
			Random random =new Random();
			int seed = random.nextInt(100) +1;
			Integer sum = 0;
			for (int i = 3; i > 0; --i) {
				queue.put(seed);
				//System.out.println("put:" + seed);
		        
		    }		    
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 
	}
		
}
