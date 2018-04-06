package collectionExamples;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortArrayusingCollection {
	
	public static void arraySort(int[] arr){
		int temp;
		for(int i=0; i < arr.length; i++){  
            for(int j=1; j < arr.length-1; j++){  
                     if(arr[j-1] > arr[j]){  
                            //swap elements  
                            temp = arr[j-1];  
                            arr[j-1] = arr[j];  
                            arr[j] = temp;  
                    }  
                     
            }
		}
	}

	public static void main(String[] args) {

		int[] arr={3,87,90,78,54,76,1,6,4,87};
//		ArrayList list = new ArrayList(arr.length);
//		for (int i:arr){
//			list.add(Integer.valueOf(i));
//		}
//		System.out.println(list);
//		
//		Collections.sort(list);
//		
//		System.out.println(list);
		System.out.println("------------by normal program-------------");
		arraySort(arr);
		for(int i=0;i<arr.length-1;i++){
			System.out.println(arr[i]);
		}
	}

}
