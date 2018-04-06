package arraryExamples;

import java.util.Arrays;

public class BuubleSort {

	public static void amstrongNumber(int number) {
		int rem;
		int sum = 0;
		int temp=number;
		while (number > 0) {
			rem = number % 10;
			sum = (int) (sum + Math.pow(rem, 3));
			number=number/10;
		}
		System.out.println(sum);
		if(temp==sum)
			System.out.println("Given number is amstrong");
		else
			System.out.println("Given number is NOT amstrong");
	}

	public static void main(String[] args) {

		int[] arr = { 34, 54, 2, 8, 78, 98, 6 };
		int[] arr1 = { 32, 87, 90, 65, 20, 76 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------------");
		System.out.println(arr[0]);
		System.out.println(arr[arr.length - 1]);

		System.out.println("------------");

		Arrays.sort(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("------------print amstrong number-------------");
		amstrongNumber(153);

	}

}
