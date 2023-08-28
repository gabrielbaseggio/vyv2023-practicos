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
        if (array.length <= 1) {
            return;
        }

        int middle = array.length / 2;
        int[] left = new int[middle];
        int[] right = new int[array.length - middle];

        System.arraycopy(array, 0, left, 0, middle);
        System.arraycopy(array, middle, right, 0, array.length - middle);

        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    private static void merge(int[] result, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }
    }

	

}

