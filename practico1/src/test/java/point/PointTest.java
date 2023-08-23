package point;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

class PointTest {

	@Test
	public void test01() {
		Point p = new Point(1,2);
		Point q = new Point(3,4);
		assertFalse(p.equals(q));
	}
	
	@Test
	public void swap1() 
	{
		Point p = new Point(0, 0);
		p.swap();
		assertEquals(p.getX(), 0);
		assertEquals(p.getY(), 0);
	}
	
}
