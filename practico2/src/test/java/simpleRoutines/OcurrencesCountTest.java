package simpleRoutines;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class OcurrencesCountTest {
	static 
	Stream<Arguments> provider() 
	{
		return Stream.of(
				Arguments.of("avada kedavra", 'a', 5)
				);
	}
	
	@ParameterizedTest
	@MethodSource("provider")
	void
	testOcurrencesCount(String string, char c, int expected) 
	{
		int res = SimpleRoutines.ocurrencesCount(string, c);
		assertEquals(expected, res);
	}
}
