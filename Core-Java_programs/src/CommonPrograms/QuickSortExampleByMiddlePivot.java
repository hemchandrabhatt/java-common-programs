package CommonPrograms;

import java.util.Arrays;

public class QuickSortExampleByMiddlePivot {

	public static void main(String[] args) {

		int[] inputArray = new int[] { 31, 23, 4, 6, 90, 78, 6, 8, 5 };
		System.out.println(Arrays.toString(inputArray));
		int low = 0;
		int high = inputArray.length - 1;
		quickSort(inputArray, low, high);
		System.out.println(Arrays.toString(inputArray));

	}
	private static void quickSort(int[] inputArray, int low, int high) {
		// check the array is not null
		if (low == high)
			return;
		if (inputArray == null || high == 0)
			return;

		// find pivot
		int middle = low+(high-low)/2;
		int pivot = inputArray[middle];
		
		int i=low;
		int j=high;
		while(i<=j){
			while(inputArray[i] < pivot){
				i++;
			}
			while(inputArray[j]>pivot){
				j--;
			}
			if(i<=j){
				swap(inputArray, i,j);
				i++;
				j--;
			}
			
		}
		
		if (low < i){
            quickSort(inputArray, low, j);
        }
        if (high > j){
            quickSort(inputArray, i, high);
        }

	}

	private static void swap(int[] inputArray, int i, int j) {
		
		int temp = inputArray[i];
		inputArray[i] = inputArray[j];
		inputArray[j] = temp;
		
	}

}
