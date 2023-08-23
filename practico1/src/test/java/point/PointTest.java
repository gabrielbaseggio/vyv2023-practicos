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
	
	@Test
	public void swap2() 
	{
		Point p = new Point(1, 1);
		p.swap();
		assertEquals(p.getX(), 1);
		assertEquals(p.getY(), 1);
	}
	
	@Test
	public void swap3() 
	{
		Point p = new Point(-1, -1);
		p.swap();
		assertEquals(p.getX(), -1);
		assertEquals(p.getY(), -1);
	}
	
	@Test
	public void swap4() 
	{
		Point p = new Point(-1, 2);
		p.swap();
		assertEquals(p.getX(), 2);
		assertEquals(p.getY(), -1);
	}
	
	@Test
	public void distance1() 
	{
		Point p = new Point(-1, 2);
		Point q = new Point(2, -1);
		assertEquals(4.24, p.distanceTo(q), 0.01);
	}
	
	@Test
	public void distance2() 
	{
		Point p = new Point(-1, 2);
		Point q = new Point(5, -1);
		assertEquals(6.70, p.distanceTo(q), 0.01);
	}
	
	@Test
	public void distance3() 
	{
		Point p = new Point(1, 1);
		Point q = new Point(1, 1);
		assertEquals(0, p.distanceTo(q), 0.01);
	}
}
