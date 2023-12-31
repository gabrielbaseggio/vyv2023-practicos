package mineField;

public class Minefield {

	private Mine[][] field;
	
	public Minefield() {
		field = new Mine[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				field[i][j] = new Mine();
			}
		}	
	}
	
	public void open(int x, int y) {
		field[x][y].setOpened(true);
	}

	public void close(int x, int y) {
		field[x][y].setOpened(false);
	}

	public void mark(int x, int y) {
		field[x][y].setMarked(true);
	}

	public void unmark(int x, int y) {
		field[x][y].setMarked(false);
	}

	public void putMine(int x, int y) {
		field[x][y].setMined(true);
	}
	
	public void removeMine(int x, int y) {
		field[x][y].setMined(false);
	}
	
	
	
	/**
	 * @param x  position on mineField
	 * @param y  position on mineField
	 * @return the number of neighbors  position of (x,y) with mines
	 * @throws IllegalArgumentException when  x or y are invalid position on mineField 
	 */
	public int minedNeighbours(int x, int y) throws IllegalArgumentException{
    	if(x < 0 || x > 7) 
    	{
    		throw new IllegalArgumentException("x out of range.");
    	}
    	
    	if(y < 0 || y > 7) 
    	{
    		throw new IllegalArgumentException("y out of range.");
    	}
    	
    	int n = 0;
    	n = topLeftIsMined(x, y)
    			+ topIsMined(x, y) 
    			+ topRightIsMined(x, y) 
    			+ rightIsMined(x, y) 
    			+ leftIsMined(x, y)
    			+ bottomLeftIsMined(x, y)
    			+ bottomIsMined(x, y)
    			+ bottomRightIsMined(x, y);
    	
    	
		return n;
	}

	private int bottomRightIsMined(int x, int y) {
		if(x+1 <= 7 && y+1 <= 7 && field[x+1][y+1].isMined()) 
    	{
    		return 1;
    	}
		return 0;
	}

	private int bottomIsMined(int x, int y) {
		if(x+1 <= 7 && field[x+1][y].isMined()) 
    	{
    		return 1;
    	}
		return 0;
	}

	private int bottomLeftIsMined(int x, int y) {
		if(x+1 <= 7 && y-1 >= 0 && field[x+1][y-1].isMined()) 
    	{
    		return 1;
    	}
		return 0;
	}

	private int rightIsMined(int x, int y) {
		if(y+1 <= 7 && field[x][y+1].isMined()) 
    	{
    		return 1;
    	}
		return 0;
	}

	private int leftIsMined(int x, int y) {
		if(y-1 >= 0 && field[x][y-1].isMined()) 
    	{
    		return 1;
    	}
		return 0;
	}

	private int topRightIsMined(int x, int y) {
		if(x-1 >= 0 && y+1 <= 7 && field[x-1][y+1].isMined()) 
    	{
    		return 1;
    	}
		return 0;
	}
	
	private int topIsMined(int x, int y) {
		if(x-1 >= 0 && field[x-1][y].isMined()) 
    	{
    		return 1;
    	}
		return 0;
	}

	private int topLeftIsMined(int x, int y) {
		if(x-1 >= 0 && y-1 >= 0 && field[x-1][y-1].isMined()) 
    	{
    		return 1;
    	}
		return 0;
	}

	
	/**
	 * @return the minefield string, with the discovered mined positions
	 */
	public String toString(){
		
		String res = ""; 
		for (int i = 0; i < 8; i++) {
			res =  res + "\n";
			for (int j = 0; j < 8; j++) {
				res = res + " " + field[i][j].toString();
			}
		}	
		
		return res;
	}

	
}
