package point;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.BooleanSupplier;

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
			assertThat(sizeBefore, equalTo(sizeAfter));
	  	}
		
		@Test
		public void test03() 
		{
			Point point = new Point(1,6);
			assertTrue(set.contains(point));
		}
		
		@Test
		public void sortTest() 
		{
			Point[] array = set.sort();
			assertTrue(isSorted(array));
		}
		
		@Test
		public void sortTest2() 
		{
			PointSet set = new PointSet();
			Point[] array = set.sort();
			assertTrue(isSorted(array));
		}
		
		@Test
		public void sortTest3() 
		{
			PointSet set = new PointSet();
			set.addPoint(new Point(5, 1));
			set.addPoint(new Point(4, 1));
			set.addPoint(new Point(3, 1));
			set.addPoint(new Point(2, 1));
			set.addPoint(new Point(1, 1));
			Point[] array = set.sort();
			assertTrue(isSorted(array));
		}
		
		@Test
		public void sortTest4() 
		{
			PointSet set = new PointSet();
			set.addPoint(new Point(5, 1));
			set.addPoint(new Point(5, 2));
			set.addPoint(new Point(4, 1));
			Point[] array = set.sort();
			assertTrue(isSorted(array));
		}
		
		@Test
		public void closestTest1() 
		{
			Point expFst = new Point(2, 3);
			Point expSnd = new Point(1, 4);
			Pair<Point, Point> res = set.closest();
			assertEquals(res.getFst(), expFst);
			assertEquals(res.getSnd(), expSnd);
		}
		
		@Test
		public void closestTest2() 
		{
			PointSet set = new PointSet();
			set.addPoint(new Point(1, 0.5f));
			set.addPoint(new Point(1, -1));
			set.addPoint(new Point(1, 0));
			Point expFst = new Point(1, 0.5f);
			Point expSnd = new Point(1, 0);
			Pair<Point, Point> res = set.closest();
			assertEquals(res.getFst(), expFst);
			assertEquals(res.getSnd(), expSnd);
		}
		
		@Test
		public void closestTest3() 
		{
			PointSet set = new PointSet();
			set.addPoint(new Point(1, 0));
			set.addPoint(new Point(1, -1));
			set.addPoint(new Point(0, 1));
			Point expFst = new Point(1, 0);
			Point expSnd = new Point(1, -1);
			Pair<Point, Point> res = set.closest();
			assertEquals(res.getFst(), expFst);
			assertEquals(res.getSnd(), expSnd);
		}


		private boolean isSorted(Point[] array) 
		{
			boolean isSorted = true;
			for(int i = 0; i < array.length - 1 && isSorted; i++) 
			{
				isSorted = isSorted && array[i].getX() <= array[i + 1].getX();
			}
			return isSorted;
		}
}
