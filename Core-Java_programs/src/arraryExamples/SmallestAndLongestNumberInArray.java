package arraryExamples;

import java.util.Arrays;



public class SmallestAndLongestNumberInArray {

	public static void main(String[] args) {

		int[] arr = { 45, 76, 4, 98, 76, 90, 56, 87 };

		/*List list = new ArrayList<>(arr.length);

		for (int i : arr) {
			list.add(Integer.valueOf(i));
		}
		
		System.out.println(list);
		Collections.sort(list);
		//System.out.println(Collections.sort(list));
*/		
		Arrays.sort(arr);
		System.out.println("Sorted array is : ");
		for(int i:arr){
			System.out.print(" "+i);
		}
		
		System.out.println(" ");
		System.out.println("Smallest and logest number in this array is :");
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
		
	}

}
