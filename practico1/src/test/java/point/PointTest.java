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
	
}
