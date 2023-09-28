package concurrency.prodConsModel;

import java.util.concurrent.CyclicBarrier;

public class Main {

	public static void main(String[] args) {
		int N = 5;

		final BoundedBuffer queue = new BoundedBuffer(10);
		CyclicBarrier barrier = new CyclicBarrier(N*2 +1);
		
	    try {
	    	for (int i = 0; i < N; i++) { 
	    		new Producer(queue, barrier).start(); 
	    		new Consumer(queue, barrier).start(); 
		    	
	    	}	    	
	    	barrier.await();	    		    		    	
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 

	}

}
