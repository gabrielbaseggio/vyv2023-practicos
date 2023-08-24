/*
 * Introduction to Software Testing
 * @author Paul Ammann & Jeff Offutt
 */

package cal;

public class Cal {

	public static int cal(int month1, int day1, int month2,
			int day2, int year)
	{
		//***********************************************************
		// Calculate the number of Days between the two given days in
		// the same year.
		//throw IllegalArgumentException when Precondition is not satisfied
		// preconditions : day1 and day2 must be in same year
		//               1 <= month1, month2 <= 12
		//               1 <= day1, day2 <= 31
		//               month1 <= month2
		//				 month1 == month2 implies day1<=day2
		//				 isValidDate(day1, month1, year)
		//				 isValidDate(day2, month2, year)
		//               The range for year: 1 ... 10000
		//
		//***********************************************************
		if(!isValidDate(day1, month1, year) ||!isValidDate(day2, month2, year)) {
			throw new IllegalArgumentException();
		}
		int numDays;

		if (month2 == month1) // in the same month
			numDays  = day2 - day1;
		else
		{
			// Skip month 0.
			int daysIn[] = {0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			// Are we in a leap year?
			int m4 = year % 4;
			int m100 = year % 100;
			int m400 = year % 400;
			if ((m4 != 0) || ((m100 == 0) && (m400 != 0)))
				daysIn[2] = 28;
			else
				daysIn[2] = 29;

			// start with days in the two months
			numDays = day2 + (daysIn[month1] - day1);

			// add the days in the intervening months
			for (int i = month1 + 1; i <= month2-1; i++)
				numDays = daysIn[i] + numDays;
		}
		return (numDays);
	}
	
	
	public static  boolean isValidDate(int day, int month, int year) {
		if  (month<1 || month>12)  
				return false;
		if(day<1 || day>31)
			return false;
		if( shortMonth(month) && day > 30)
			return false;
		if( month==2 && leap(year) && day > 29)
			return false;
		if( month==2 && !leap(year) && day > 28)
			return false;
		if(year<1900)
			return false;
		return true;
	}
	
	/***Helper methods***/
	
	private static boolean shortMonth(int m) {
		if (m ==4 || m == 6 || m ==9 ||m ==11) 
			return true;
		return false;
	}

	public /*@ pure @*/ static boolean leap(int a) {
		boolean b = false;
		if ((a%4==0) && (a%100!= 0))
				b = true;
		if(a%400==0)
				b = true;
		return b;
	}
	
}
