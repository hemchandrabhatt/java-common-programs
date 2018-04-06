package CommonPrograms;

import java.util.Arrays;

public class SortQuick {

	public static void main(String[] args) {

		int[] array = new int[] { 8, 6, 9, 3, 2, 87, 76, 10, 10, 5 };
		System.out.println(Arrays.toString(array));
		int length = array.length;
		int low = 0;
		int high = length - 1;
		quicksort(array, low, high);
		System.out.println(Arrays.toString(array));
	}

	private static void quicksort(int[] array, int low, int high) {
		if (low == high)
			return;
		if (array == null || high == 0)
			return;

		int middle = low + (high - low) / 2;
		int pivot = array[middle];

		int i = low;
		int j = high;

		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				swap(array, i, j);
				i++;
				j--;
			}

		}

		if (low < i) {
			quicksort(array, low, j);
		}
		if (high > j) {
			quicksort(array, i, high);
		}
	}

	private static void swap(int[] array, int i, int j) {

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

}
