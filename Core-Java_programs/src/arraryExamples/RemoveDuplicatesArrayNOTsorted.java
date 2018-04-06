package arraryExamples;

import java.util.Arrays;

public class RemoveDuplicatesArrayNOTsorted {

	public static void removeDuplicatesArrayNOTsorted(int[] arr) {
		Arrays.sort(arr);
		int[] temp= new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		//System.out.println("remove duplicates");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1; j<arr.length;j++){
				if(arr[i] !=arr[j]){
					temp[i]=arr[i];
					
				}else{
					temp[i]=arr[i];
					arr[j]=0;
				}
			}
		}
		System.out.println("removed duplicates");
		for (int i1 = 0; i1 < temp.length; i1++) {
			System.out.println(arr[i1]);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 30, 20, 10, 10, 20, 50, 80, 30, 40, 10 };

		removeDuplicatesArrayNOTsorted(arr);

	}

}
