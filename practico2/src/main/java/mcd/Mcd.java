package mcd;

public class Mcd {
	
	public static int mcd(int n, int m) 
	{
		if(m == 0) 
		{
			return n;
		}
		
		return mcd(m, n % m);
	}
}
