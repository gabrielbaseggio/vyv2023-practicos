package sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class sortingTest {
	
	private static Stream<Arguments> provider() 
	{
		return Stream.of(
				 Arguments.of(new int [] {0, 1}, new int [] {0, 1})
				,Arguments.of(new int [] {1, 0}, new int [] {0, 1})
				,Arguments.of(new int [] {1, 2, 3}, new int [] {1, 2, 3})
				,Arguments.of(new int [] {1, 3, 2}, new int [] {1, 2, 3})
				,Arguments.of(new int [] {2, 1, 3}, new int [] {1, 2, 3})
				,Arguments.of(new int [] {2, 3, 1}, new int [] {1, 2, 3})
				,Arguments.of(new int [] {3, 1, 2}, new int [] {1, 2, 3})
				,Arguments.of(new int [] {3, 2, 1}, new int [] {1, 2, 3})
				);
	}
	
	@ParameterizedTest
	@MethodSource("provider")
	void testBubbleSort(int [] array, int [] expected) 
	{
		Sorting.bubbleSort(array);
		assertArrayEquals(expected, array);
	}
}
