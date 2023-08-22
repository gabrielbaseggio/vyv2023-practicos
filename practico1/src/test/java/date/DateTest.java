package date;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

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
}
