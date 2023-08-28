package simpleRoutines;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LeapYearTest {
	
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
	
	@ParameterizedTest
	@MethodSource("leapYearProvider")
	void
	testLeapYear(int y, boolean expected) 
	{
		assertEquals(expected, SimpleRoutines.isLeapYear(y));
	}
}
