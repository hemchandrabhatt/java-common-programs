package arraryExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseStringArrays {

	public static void main(String[] args) {

		String[] words = {"hem", "suresh", "bhuwan","mahesh"};
		String temp;
		
		for(int i=0; i<words.length;i++){
			System.out.println(words[i]);
		}
		
		System.out.println("===========");
		
		//reverse the string array without using collection interface
		
		for(int i=0; i<words.length;i++){
			
			temp=words[i];
			words[i] =words[words.length-i-1];
			words[words.length-i-1]=temp;
			
			System.out.println(words[i]);
			//temp=words[i++];
			
		}
		
//		System.out.println("===========reverse string array=======");
//		for(int i=0; i<words.length;i++){
//			System.out.println(words[i]);
//		}
		
		
//		
		
		System.out.println("======using by collection=====");
		
		List list = Arrays.asList(words);
		
		Collections.reverse(list);
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
		

	}

}
