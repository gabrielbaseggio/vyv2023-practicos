package simpleRoutines;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
	
	private static Stream<char[]> notPalindromes() 
	{
		return Stream.of(
				   new char [] {'a', 'b'}
				  ,new char [] {'a', 'b', 'b'}
				  ,new char [] {'a', 'b', 'b', 'b'}
				  ,new char [] {'n', 'o', 't'}
				);
	}
	
	@ParameterizedTest
	@MethodSource("palindromes")
	void testPalindrome1(char [] array) 
	{
		assertTrue(Palindrome.palindrome(array));
	}
	
	@ParameterizedTest
	@MethodSource("notPalindromes")
	void testPalindrome2(char [] array) 
	{
		assertFalse(Palindrome.palindrome(array));
	}
}
