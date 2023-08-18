package simpleRoutines;

public class Palindrome {

	/**
	 * Return whether an array is palindromic
	 * @param An array of char
	 * @return return true if the given array is palindromic, 
	 * otherwise it returns false
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
	
	
}

