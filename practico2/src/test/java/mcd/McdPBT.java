package mcd;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import net.jqwik.api.*;
import net.jqwik.api.constraints.Positive;

public class McdPBT {
	@Property
	void 
	commutativity(@ForAll @Positive int n, @ForAll @Positive int m) 
	{
		assertEquals(Mcd.mcd(n, m), Mcd.mcd(m, n));	
	}
	
	@Property
	void
	associativity(@ForAll @Positive int a, @ForAll @Positive int b, @ForAll @Positive int c) 
	{
		assertEquals(Mcd.mcd(a, Mcd.mcd(b, c)), Mcd.mcd(Mcd.mcd(a, b), c));
	}
	
	@Property
	void
	idempotence(@ForAll @Positive int n) 
	{
		assertEquals(n, Mcd.mcd(n,n));
	}
	
	@Property
	void 
	property(@ForAll @Positive int n, @ForAll @Positive int m) 
	{
		assertEquals(Mcd.mcd(n, m), Mcd.mcd(Math.abs(n - m), m));
	}
}
