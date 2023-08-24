package simpleRoutines;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	void test() {
		char [] a = {'n','e','u','q','u','e','n'};
		assertTrue(SimpleRoutines.palindrome(a));
		
	}

}
