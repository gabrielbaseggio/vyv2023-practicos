package cal;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CalNegTest {
	
	private static Stream<Arguments>
	provider() 
	{
		return Stream.of(
				//Arguments.of(d1, m1, d2, m2, y)
				 Arguments.of(30, 02, 31, 03, 2000)
				,Arguments.of(01, 01, 30, 02, 2000)
				,Arguments.of(01, 02, 02, 01, 2000)
				,Arguments.of(00, 01, 01, 02, 2000)
				,Arguments.of(32, 01, 01, 02, 2000)
				,Arguments.of(01, 00, 01, 01, 2000)
				,Arguments.of(01, 13, 01, 01, 2000)
				,Arguments.of(01, 01, 00, 01, 2000)
				,Arguments.of(01, 01, 32, 01, 2000)
				,Arguments.of(01, 01, 01, 00, 2000)
				,Arguments.of(01, 01, 01, 13, 2000)
				,Arguments.of(01, 01, 31, 01, 0000)
				,Arguments.of(01, 01, 31, 01, 10001)
				);
	}
	
	@ParameterizedTest
	@MethodSource("provider")
	void
	testCal(int d1, int m1, int d2, int m2, int y) 
	{
		assertThrows(IllegalArgumentException.class, () -> Cal.cal(m1, d1, m2, d2, y));
	}
}
