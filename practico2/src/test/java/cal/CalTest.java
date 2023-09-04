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
				,Arguments.of(01, 01, 02, 03, 1999, 60)
				,Arguments.of(01, 01, 01, 03, 2000, 60)
				,Arguments.of(02, 01, 01, 03, 2000, 59)
				,Arguments.of(01, 02, 29, 02, 2000, 28)
				,Arguments.of(01, 02, 29, 02, 316, 28)
				,Arguments.of(01, 02, 29, 02, 1280, 28)
				,Arguments.of(01, 02, 29, 02, 2504, 28)
				,Arguments.of(01, 02, 29, 02, 3192, 28)
				,Arguments.of(01, 02, 29, 02, 4976, 28)
				,Arguments.of(01, 02, 29, 02, 5956, 28)
				,Arguments.of(01, 02, 29, 02, 6988, 28)
				,Arguments.of(01, 02, 29, 02, 7788, 28)
				,Arguments.of(01, 02, 29, 02, 8972, 28)
				,Arguments.of(01, 02, 29, 02, 9776, 28)
				);
	}
	
	@ParameterizedTest
	@MethodSource("provider")
	void
	testCal(int d1, int m1, int d2, int m2, int y, int expected) 
	{
		assertEquals(expected, Cal.cal(m1, d1, m2, d2, y));
	}
}
