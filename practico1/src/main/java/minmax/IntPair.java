package minmax;

public class IntPair {
	
	private int fst;
	private  int snd;

	public IntPair(int i, int j) {

		fst = i;
		snd = j;
	}

	public /*@ pure @*/ int fst() {
		return fst;
	}
	

	public /*@ pure @*/ int snd() {

		return snd;
	}

	public void changeSnd(int i) {
		snd = i;
	}

	public void changeFst(int i) {
		fst = i;
	}
	
}
