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
    	//TODO
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
