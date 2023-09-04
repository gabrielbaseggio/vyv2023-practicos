package shop;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class OrderNegTest {
	@Test
	void
	testThrowIllegalArgumentException() 
	{
		assertThrows(IllegalArgumentException.class, () -> new Order(0, null));
	}
}
