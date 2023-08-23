package mineField;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class mineFieldTest {
	
	Minefield minefield = null;
	
	@BeforeEach
	public void setUp() 
	{
		minefield = new Minefield();
		minefield.putMine(1, 1);
		minefield.putMine(4, 0);
		minefield.putMine(3, 3);
		minefield.putMine(6, 4);
		minefield.putMine(4, 6);
		minefield.putMine(0, 3);
	}
	
	@Test
	public void minedNeighbours1() 
	{
		assertThrows(IllegalArgumentException.class, () -> minefield.minedNeighbours(-1, 0));
	}
	
	@Test
	public void minedNeighbours2() 
	{
		assertThrows(IllegalArgumentException.class, () -> minefield.minedNeighbours(0, -1));
	}
	
	@Test
	public void minedNeighbours3() 
	{
		assertThrows(IllegalArgumentException.class, () -> minefield.minedNeighbours(8, 0));
	}
	
	@Test
	public void minedNeighbours4() 
	{
		assertThrows(IllegalArgumentException.class, () -> minefield.minedNeighbours(0, 8));
	}
	
	@Test
	public void minedNeighbours5() 
	{
		assertEquals(2, minefield.minedNeighbours(5, 5));
	}
}
