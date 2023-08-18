package sorting;

public class Sorting {



	/**
	 * Sorts an array in increasing order.
	 * @param array is the array of integers to be sorted\
	 * bubbleSort Algorithm implementation
	 */	
	public static void bubbleSort(int[] array) {
		for (int l = array.length-1; l >= 0; l--) {
			for (int i = 0; i < l; i++) {
				if (array[i] > array[i+1]) {
					int e = array[i];
					array[i] = array[i+1];
					array[i+1] = e;
				}
			}
		}
	}

	
	/**
	 * Sorts an array in increasing order.
	 * @param array is the array of integers to be sorted
	 * mergeSort Algorithm implementation
	 */	
	public static void mergeSort(int[] array) {
		//TODO
	}

	

}

