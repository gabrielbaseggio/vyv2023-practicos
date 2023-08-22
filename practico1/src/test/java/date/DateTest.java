package date;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


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
	
	@Test
	public void invalidDay1() 
	{
		assertThrows(IllegalArgumentException.class, () -> new Date(32, 2, 1900));
	}
	
	@Test
	public void invalidDay2() 
	{
		assertThrows(IllegalArgumentException.class, () -> new Date(0, 1, 1900));
	}
	
	@Test
	public void invalidMonth1() 
	{
		assertThrows(IllegalArgumentException.class, () -> new Date(1, 13, 1900));
	}
}
