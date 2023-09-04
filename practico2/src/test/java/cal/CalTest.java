package cal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CalTest {
	
	private static Stream<Arguments>
	provider() 
	{
		return Stream.of(
				//Arguments.of(d1, m1, d2, m2, y, expected)
				 Arguments.of(01, 01, 02, 03, 2000, 61)
				,Arguments.of(01, 01, 02, 03, 2001, 60)
				,Arguments.of(01, 02, 29, 02, 2000, 28)
				,Arguments.of(01, 01, 01, 03, 2000, 60)
				,Arguments.of(15, 01, 01, 03, 2000, 46)
				);
	}
	
	private static Stream<Arguments>
	negProvider() 
	{
		return Stream.of(
				//Arguments.of(d1, m1, d2, m2, y)
				 Arguments.of(01, 01, 30, 02, 2000)
				,Arguments.of(01, 02, 01, 01, 2000)
				);
	}
	
	@ParameterizedTest
	@MethodSource("provider")
	void
	testCal(int d1, int m1, int d2, int m2, int y, int expected) 
	{
		assertEquals(expected, Cal.cal(m1, d1, m2, d2, y));
	}
	
	@ParameterizedTest
	@MethodSource("negProvider")
	void
	testCal(int d1, int m1, int d2, int m2, int y) 
	{
		assertThrows(IllegalArgumentException.class, () -> Cal.cal(m1, d1, m2, d2, y));
	}
}
