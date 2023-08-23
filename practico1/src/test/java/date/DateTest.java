package date;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class DateTest {
	@Test
	public void createDate1() 
	{
		Date date = new Date(1, 1, 1900);
		int day   = date.getDay();
		int month = date.getMonth();
		int year  = date.getYear();
		assertEquals(1,    day);
		assertEquals(1,    month);
		assertEquals(1900, year);
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "./csvSource.csv", numLinesToSkip = 1)
	public void invalidDate(int d, int m, int y) 
	{
		assertThrows(IllegalArgumentException.class, () -> new Date(d, m, y));
	}

	static Stream<Arguments> provider() 
	{
		return Stream.of(
				 Arguments.of(new Date(2, 1, 1900),  new Date(1, 1, 1900),  true)
				,Arguments.of(new Date(3, 1, 1900),  new Date(1, 1, 1900),  true)
				,Arguments.of(new Date(3, 1, 1900),  new Date(2, 1, 1900),  true)
				,Arguments.of(new Date(31, 1, 1900), new Date(2, 1, 1900),  true)
				,Arguments.of(new Date(31, 1, 1901), new Date(31, 1, 1900), true)
				,Arguments.of(new Date(1, 2, 1900),  new Date(1, 1, 1900),  true)
				,Arguments.of(new Date(1, 9, 1900),  new Date(1, 5, 1900),  true)
				,Arguments.of(new Date(1, 1, 1900),  new Date(1, 1, 1900),  false)
				,Arguments.of(new Date(1, 1, 1900),  new Date(2, 1, 1900),  false)
				,Arguments.of(new Date(1, 1, 1900),  new Date(10, 1, 1900), false)
				,Arguments.of(new Date(8, 1, 1900),  new Date(10, 1, 1900), false)
				,Arguments.of(new Date(1, 1, 1900),  new Date(1, 2, 1900),  false)
				,Arguments.of(new Date(1, 1, 1900),  new Date(1, 1, 1901),  false)
				,Arguments.of(new Date(1, 1, 2000),  new Date(1, 1, 2001),  false)
				);
	}
	
	@ParameterizedTest
	@MethodSource("provider")
	public void after(Date date1, Date date2, boolean expected) 
	{
		assertEquals(expected, date1.after(date2));
	}
}
