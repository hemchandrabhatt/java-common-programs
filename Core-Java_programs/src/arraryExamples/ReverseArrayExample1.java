package arraryExamples;

public class ReverseArrayExample1 {

	public static void main(String[] args) {

		int[] orgArray = new int[] { 5, 6, 7, 7, 9, 7 };
		reverseArray(orgArray);
		//System.out.println("-------------------");
		//reverseArrayWhile(orgArray);

	}
	
	private static void reverseArray(int[] orgArray) {
		for (int i = 0; i < orgArray.length; i++) {
			System.out.println(orgArray[i]);
		}

		int temp;
		for (int i = 0; i < orgArray.length/2; i++) {
			temp = orgArray[orgArray.length -1-i];
			orgArray[orgArray.length - 1 - i] = orgArray[i];
			orgArray[i] = temp;
		}

		System.out.println("Reverse");

		for (int j = 0; j <orgArray.length; j++) {
			System.out.println(orgArray[j]);
		}

	}

}
