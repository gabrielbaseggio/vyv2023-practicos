package simpleRoutines;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LargestTest {
	static
	Stream<Arguments> provider() 
	{
		return Stream.of(
				 Arguments.of(new Integer[] {10, 5, 1}, 10)
				,Arguments.of(new Integer[] {1, 5, 10}, 10)
				,Arguments.of(new Integer[] {-10, -5, -1}, -1)
				);
	}
	
	@ParameterizedTest
	@MethodSource("provider")
	void
	testLargest(Integer[] a, Integer expected) 
	{
		Integer res = SimpleRoutines.largest(a);
		assertEquals(expected, res);
	}
}
