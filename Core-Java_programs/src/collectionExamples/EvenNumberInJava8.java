package collectionExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberInJava8 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		System.out.println(list);
		
		List<Integer> list1 = new ArrayList<Integer>();
		for(Integer i:list){
			if(i%10==0){
				list1.add(i);
			}
		}
		System.out.println(list1);
		System.out.println("-----------");
		
		List<Integer> l1=list.stream().filter(I->I%2==0).collect(Collectors.toList());
		System.out.println(l1);

	}
}
