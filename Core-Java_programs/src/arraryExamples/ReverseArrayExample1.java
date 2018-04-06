package arraryExamples;

public class ReverseArrayExample1 {

	public static void main(String[] args) {

		int[] orgArray = new int[] { 5, 6, 7, 7, 9, 7 };
		reverseArray(orgArray);
		//System.out.println("-------------------");
		//reverseArrayWhile(orgArray);

	}

	/*private static void reverseArrayWhile(int[] orgArray) {
		int i, j, temp;
		i=0;
		j=orgArray.length-1;
		while(i>j){
			temp = orgArray[j];
			orgArray[j] = orgArray[i];
			orgArray[i] = temp;
			i++;
			j--;
		}
		for (i = 0; i < orgArray.length; i++) {
			System.out.println(orgArray[i]);
		}
	}
*/
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
