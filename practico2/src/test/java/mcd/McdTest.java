package mcd;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import net.jqwik.api.*;

public class McdTest {
	@Property(tries = 100)
	void testSymmetry(@ForAll int n, @ForAll int m) 
	{
		Assume.that(n > 0 && m > 0);
		assertEquals(Mcd.mcd(n, m), Mcd.mcd(m, n));	
	}
	
	@Property(tries = 100)
	void testProperty(@ForAll int n, @ForAll int m) 
	{
		Assume.that(n > 0 && m > 0);
		assertEquals(Mcd.mcd(n, m), Mcd.mcd(Math.abs(n - m), m));
	}
}
