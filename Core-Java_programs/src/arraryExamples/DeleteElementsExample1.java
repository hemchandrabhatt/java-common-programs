package arraryExamples;

import java.util.Arrays;
import org.apache.commons.lang.ArrayUtils;

public class DeleteElementsExample1 {

	public static void main(String[] args) {

		int[] arr1 = { 2, 6, 5, 9, 7 };

		int[] arr2 = new int[4] ;

		for (int i = 0; i < arr1.length; i++) {

			System.out.println(arr1[i]);
		}
		System.out.println("==========================");
		
		for (int i = 0; i < arr1.length; i++) {

			arr2[0] = arr1[0];
			arr2[1] = arr1[2];
			arr2[2] = arr1[3];
			arr2[3] = arr1[4];
		}
		

		for (int i = 0; i < arr2.length; i++) {

			System.out.println(arr1[i]);
		}
		
		System.out.println();



	}

}
