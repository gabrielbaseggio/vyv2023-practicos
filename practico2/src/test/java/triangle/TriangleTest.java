package triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TriangleTest {
	static 
	Stream<Arguments> provider() 
	{
		return Stream.of(
				 Arguments.of(40, 57, 51, true)
				,Arguments.of(2, 1, 1, false)
				,Arguments.of(1, 2, 1, false)
				,Arguments.of(1, 1, 2, false)
				);
	}
	
	@ParameterizedTest
	@MethodSource("provider")
	void
	testTriangleInequality(int side1, int side2, int side3, boolean expected) 
	{
		assertEquals(expected, Triangle.triangleInequality(side1, side2, side3));
	}
}
