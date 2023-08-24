package simpleRoutines;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import sorting.Sorting;

public class PalindromeTest {
	private static Stream<char[]> palindromes() 
	{
		return Stream.of(
				  new char [] {'a'}
				 ,new char [] {'a', 'a'}
				 ,new char [] {'a', 'b', 'a'}
				 ,new char [] {'p', 'a', 'a', 'b', 'a', 'a', 'p'}
				);
	}
	
	@ParameterizedTest
	@MethodSource("palindromes")
	void testPalindrome1(char [] array) 
	{
		assertTrue(Palindrome.palindrome(array));
	}
}
