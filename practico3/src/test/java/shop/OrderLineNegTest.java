package shop;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class OrderLineNegTest {
	@Test
	void
	testThrowIllegalArgumentException() 
	{
		assertThrows(IllegalArgumentException.class, () -> new OrderLine(null, 0, 0));
	}
}
