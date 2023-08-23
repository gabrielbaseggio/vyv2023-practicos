package point;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


class PointSetTest {

	private PointSet set;
   	
		@BeforeEach
		public void setUp() {
	    	
	    	set = new PointSet();
	    	
	    	Point p1 = new Point(2,3);
	    	Point p2 = new Point(1,6);
	    	Point p3 = new Point(4,5);
	    	Point p5 = new Point(1,4);
	    	Point p6 = new Point(-1,4);

	    	set.addPoint(p1);
	       	set.addPoint(p2);
	       	set.addPoint(p3);	       	
	       	set.addPoint(p5);
	       	set.addPoint(p6);
	       	
	    }
		
		
		@Test
	  	public void test01() {
			Pair<Point, Point> p = set.closest();
			assertThat(p.getFst().distanceTo(p.getSnd()),greaterThan(0.0));
	  	}
	    
		@Test
	  	public void test02() {
	    	Point p4 = new Point(1,6);
	    	int sizeBefore = set.size();
			set.addPoint(p4);
			int sizeAfter  = set.size();
			System.out.println(sizeBefore);
			System.out.println(sizeAfter);
			assertThat(sizeBefore, equalTo(sizeAfter));
	  	}
		
		@Test
		public void test03() 
		{
			System.out.println(set.toString());
			Point point = new Point(1, 6);
			System.out.println(point.toString());
			assertTrue(set.contains(point));
		}
}
