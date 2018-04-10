package stringExample;

import java.util.Arrays;

public class FindLengthOfSubStringFromString {

	public static void main(String[] args) {
		int j = 0;int temp = 0, temp1=0;
		String str = "abcadefghijkalkmnnbnbnbnhj";
		String[] charArray = str.split("a");
		// Arrays.sort(charArray);
		// System.out.println(charArray[charArray.length-1]);
		int[] arr = new int[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			arr[j++] = charArray[i].length();
		}
		/*for (int i = 0; i < arr.length; i++) {
			for (int k = i + 1; k < arr.length; k++) {
				if (arr[i] >= arr[k]) {
					temp =arr[i];
					//temp1 =arr[k];
				}
			}

		}*/
		int max = arr[0];
	    int pos = 0;
		for(int i=1; i<arr.length; i++) {
	        if (max < arr[i]) {
	            pos = i;
	            max = arr[i];
	        }
	    }
		System.out.println(pos);
		
		System.out.println(charArray[pos]);
		System.out.println(charArray[pos].length());
		// Arrays.sort(arr);
		//System.out.println(arr[arr.length - 1]);

	}
}
