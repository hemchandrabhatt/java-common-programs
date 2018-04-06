package arraryExamples;

public class ReverseArrayExample {
	
	private static void reverseArray(int[] orgArray) {
		for (int i = 0; i < orgArray.length; i++) {
			System.out.println(orgArray[i]);
		}

		int temp;
		for (int i = 0; i < orgArray.length; i++) {
			temp = orgArray[orgArray.length -1-i];
			
			orgArray[orgArray.length - 1 - i] = orgArray[i];
			orgArray[i] = temp;
		}

		System.out.println("Reverse");

		for (int i = 0; i < orgArray.length; i++) {
			System.out.println(orgArray[i]);
		}

	}

	public static void main(String[] args) {
		
		int i, j, temp;

		int[] arr = { 3, 6, 9, 7, 4 };
		reverseArray(arr);
		
		System.out.println("before=============");
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		i = 0;
		j = arr.length - 1;

		System.out.println("Reverse");

		while (i < j) {
			temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			i++;
			j--;
		}

		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
