package minmax;


public class MinMax {
	
	
	/*@ requires a!=null && i>=0 &&  j>=i && a.length > j;
	 @ ensures  (a.length != 0 ==>(\forall int k; i <= k && k <= j; a[k] >= \result.fst && a[k] <= \result.snd)) &&
	 @ (a.length == 0 ==> \result.fst==0 && \result.snd ==0);
	 @*/
	
    	public static IntPair minMaxArray(int[] a, int i, int j) {
	   
		if (a.length == 0) {
		    IntPair res = new IntPair(0, 0);
		    return res; 
		}
		else {
		    IntPair res_sub = new IntPair(a[i], a[i]);
		    int k = i;
		    //@ maintaining  (\forall int n; i <= n && n < k; a[n] >= res_sub.fst &&  a[n] <= res_sub.snd) && k >= i && k <= j+1 && i == \old(i) && j == \old(j) ;
			
		    while (k <= j) {
		        if (a[k] < res_sub.fst()) {
			         res_sub.changeSnd(a[k]); 
			     }
		        if (a[k] > res_sub.snd()) {
			         res_sub.changeSnd(a[k]);
			     }
			     k++;
		    }
		    return res_sub;
	  }
	}
 		
}





