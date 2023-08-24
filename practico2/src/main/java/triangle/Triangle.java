package triangle;

public class Triangle {

	
	/**
	 * 
	 * @param side1 length of a side of a triangle
	 * @param side2 length of a side of a triangle
	 * @param side3 length of a side of a triangle
	 * @return Implements Triangle Inequality Theorem: 
	 * This theorem states that the sum of the lengths of any 2
	 * sides of a triangle must be greather tan the third side
	 */
	public static boolean triangleInequality(int side1, int side2, int side3){
		if (side1 < side2 + side3 && side2 < side1 + side3 && side3 < side1 + side2)
			return true;
		else
			return false;
	}
}
