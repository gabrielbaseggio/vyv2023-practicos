package simpleRoutines;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PalindromeTest {
	
	private static Stream<Arguments>
	palindromeProvider() 
	{
		return Stream.of(
				 Arguments.of(new char[] {'n','e','u','q','u','e','n'}, true)
				,Arguments.of(new char[] {'n','e','u','q','w','e','n'}, false)
				);
	}
	
	@ParameterizedTest
	@MethodSource("palindromeProvider")
	void 
	testPalindrome(char [] a, boolean expected) {
		assertEquals(expected, SimpleRoutines.palindrome(a));
		
	}

}
