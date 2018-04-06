package arraryExamples;

import java.util.Arrays;

public class RemoveDuplicateElementsExample {

	public static void main(String[] args) {
		int[] arr = {14,3,14,23,46,2,5,3};
		removeDuplicate(arr);

	}

	private static void removeDuplicate(int[] arr) {
		
		Arrays.sort(arr);
		int[] temp = new int[arr.length-1];
		int j=0; 
		
		for(int i=0; i<arr.length-1; i++){
			if(arr[i] != arr[i+1]){
				temp[j++] =arr[i];
			}
		}
		
		temp[j++] = arr[arr.length - 1];
		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		
		for(int i=0; i<temp.length; i++){
			System.out.println(temp[i]);
		}
		
	}

}
