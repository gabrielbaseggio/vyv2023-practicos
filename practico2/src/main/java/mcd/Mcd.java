package mcd;

public class Mcd {
	
	public static int mcd(int n, int m) 
	{
		while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
	}
}
