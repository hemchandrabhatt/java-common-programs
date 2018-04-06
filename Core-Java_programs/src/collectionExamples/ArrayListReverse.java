package collectionExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListReverse {

	public static void main(String[] args) {
		
		String[] arr = {"hme", "Prateek","prakash", "Mahesh","suresh"};
		for(int i=0; i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println(" ");
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
		
		Collections.reverse(list);
		
		System.out.println("After Array Reverse");
		
		System.out.println(list);
		
		System.out.println("------------------");
		
	
		Object[] objects = list.toArray();
		
		for(int i=0; i<objects.length;i++){
			System.out.println(objects[i]);
		}
		
		System.out.println("=------===");
		

		List<String> arraryList= new ArrayList<String>();
		
		arraryList.add("hem");
		arraryList.add("chandra");
		arraryList.add("Bhatt");
		arraryList.add("Suresh");
		arraryList.add("mahesh");
		arraryList.add("Krupa");
		
		
		System.out.println(arraryList);
		
		Collections.reverse(arraryList);
		
		System.out.println("ArrayList after reverse");
		System.out.println(arraryList);
		
		
		

	}

}
