package simpleRoutines;

public class SimpleRoutines {
	
	
	/**
	 * 
	 * @param a number representing a year
	 * @return return true if the given year is a leap year, 
	 * false otherwise.
	 */
	public static boolean isLeapYear(int a) {
		boolean b = false;
		if (((a%4==0) && (a%100!= 0)) || a%400==0)
				b = true;
		return b;
	}
	
	/**
	 * Return whether an array is palindromic
	 * @param An array of char
	 * @return return true if the given array is palindromic.
	 */
	public static boolean palindrome(char[] list) {
		int index = 0;
		int l = list.length;
		boolean res = true;
		while(index < (l-1) && res){
			if(list[index] != list[(l-index)-1]){
				res = false;
			}
			index++;
		}
		return res;
	}
	
	
	/**
	* Returns the largest element in an array.
	* @param list is the array of integers to calculate the largest number from.
	* @return The largest number in the given array
	*/
	public static Integer largest(Integer[] list) { 
		int index = 1;
		int max = Integer.MIN_VALUE;
		while (index <= list.length-1) {
			if (list[index] > max) {
				max = list[index];
			}
			index++;
		}
		return max;
	}
	
	
	/**
	 * 
	 * @param someString string over which we count occurrences
	 * @param someChar character that occurs in someString 
	 * @return number of occurrences of someChar in someString
	 */
	public static int ocurrencesCount(String someString, char someChar) {
		int count = 0;
		 
		for (int i = 0; i < someString.length(); i++) {
		    if (someString.charAt(i) == someChar) {
		        count++;
		    }
		}
		return count;
		
	}
	
	
}

