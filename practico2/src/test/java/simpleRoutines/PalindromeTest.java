package simpleRoutines;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PalindromeTest {
	
	private static Stream<Arguments>
	leapYearProvider() 
	{
		return Stream.of(
				 Arguments.of(1904, true)
				,Arguments.of(1905, false)
				,Arguments.of(1900, false)
				,Arguments.of(2000, true)
				);
	}
	
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
	
	@ParameterizedTest
	@MethodSource("leapYearProvider")
	void
	testLeapYear(int y, boolean expected) 
	{
		assertEquals(expected, SimpleRoutines.isLeapYear(y));
	}

}
