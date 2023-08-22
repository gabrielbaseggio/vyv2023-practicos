package date;


public class Date {
	
	
    //@ spec_public
	private int day;
	
    //@ spec_public

	private int month;

    //@ spec_public
	private int year;
	

	
	/*@ public invariant 1<=month && month<=12 && day >= 1 && day<=31 &&
	((month==4 || month==6 || month==9 || month==11) ==> day<=30) &&
	((month==2 && leap(year)) ==> day <= 29) &&
	((month==2 && leap(year)) ==> day<= 28) && 1900 <= year;
	@*/
	
	
	public /*@ pure @*/	 int getDay() {
		return day;
	}


	public /*@ pure @*/ int getMonth() {
		return month;
	}


	public /*@ pure @*/ int getYear() {
		return year;
	}

	

	/*@ requires 1<=m && m<=12 && d >= 1 && d<=31 &&
	((m==4 || m==6 || m==9 || m==11) ==> d<=30) &&
	((m==2 && leap(y)) ==> d <= 29) &&
	((m==2 && !leap(y)) ==> d<= 28) && 1900 <= y;
	@*/
	public Date(int d, int m,  int y) throws IllegalArgumentException{
		if(d > 31) { throw new IllegalArgumentException("Invalid day."); }
		if(d <  1) { throw new IllegalArgumentException("Invalid day."); }
		if(m > 12) { throw new IllegalArgumentException("Invalid month."); }
		if(m <  1) { throw new IllegalArgumentException("Invalid month."); }
		if(y < 1900) { throw new IllegalArgumentException("Invalid year."); }
		this.day   = d;
		this.month = m;
		this.year  = y;
		assert repOk();
	}
	
	

	public /*@ pure @*/ boolean repOk() {
		//TODO
		return true;
	}
	
	
	
	/**
	 * Tests if this date is after the specified date.
	 * @param when - a date.
	 * @return true if and only if the date represented by this Date object 
	 * is strictly later than the date represented by when; false otherwise.
	 */
	
	/*@ requires when!=null;
	ensures ((this.getYear() > when.getYear()) && \result ==true)
	|| (getYear() == when.getYear() && getMonth() > when.getMonth() && \result ==true)
	|| (getYear() == when.getYear() && getMonth() == when.getMonth() && getDay() > when.getDay() && \result ==true)
	|| ((this.getYear() < when.getYear()) && \result ==false)
	|| (getYear() == when.getYear() && getMonth() < when.getMonth() && \result ==false)
	|| (getYear() == when.getYear() && getMonth() == when.getMonth() && getDay() <= when.getDay() && \result ==false);
	@*/
	public boolean after(Date when) {
		if(this.getYear() > when.getYear())
			return false;
	    if(getYear() == when.getYear() && getMonth() > when.getMonth()) 
	    	return true;
	    if(getYear() == when.getYear() && getMonth() == when.getMonth() && getDay() > when.getDay())
	    	return true;
		return false;
	}
		

	/***Helper methods***/
	
	public /*@ pure @*/ static boolean leap(int a) {
		boolean b = false;
		if ((a % 4 == 0) && (a % 100 != 0))
				b = true; 
		if(a % 400 == 0)
				b = true;
		return b;
	}
	
	
}





