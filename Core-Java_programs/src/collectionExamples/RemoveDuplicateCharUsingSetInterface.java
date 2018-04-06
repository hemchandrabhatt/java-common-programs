package collectionExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharUsingSetInterface {

	public static void main(String[] args) {
		String result="";

		String strOrg="Hem Chandra Bhatt";
		String str=strOrg.toLowerCase().replaceAll("[^a-z]", "");
		char[] charArr =str.toCharArray();
		System.out.println(str);
		System.out.println("-----------------");
		for(int i=0;i<charArr.length;i++){
			System.out.println(charArr[i]);
		}
		System.out.println("========removed char in insersion order=======");
		
		Set<String> set = new LinkedHashSet<String>(); //new hashset
		
		//set.add(charArr);
		for(int i=0;i<charArr.length;i++){
			set.add(String.valueOf(charArr[i]));
		}
		
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	      
	  }
		

}
