package arraryExamples;

public class ReverseArrayWithTempVariable {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 2, 3, 5, 6, 15, 0 };
		
		reverseArray(arr);
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] +" ");
			
		}

	}

	private static int[] reverseArray(int[] arr) {
		
		int temp, i;
		for(i=0; i<arr.length/2; i++){
			temp=arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] =temp;
		}
		return arr;
		
	}

	

}
