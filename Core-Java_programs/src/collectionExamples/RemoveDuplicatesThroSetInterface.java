package collectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class RemoveDuplicatesThroSetInterface {

	public static void main(String[] args) {
		

		// using treeset class
		TreeSet<Integer> hashSet = new TreeSet<Integer>();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(10);
		hashSet.add(40);
		hashSet.add(30);
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(50);
		hashSet.add(90);

		Iterator<Integer> itr = hashSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// using hashset

		System.out.println("-----------------------------");
		HashSet<Integer> hashSet1 = new HashSet<Integer>();
		hashSet1.add(600);
		hashSet1.add(900);
		hashSet1.add(400);
		hashSet1.add(90);
		hashSet1.add(200);
		hashSet1.add(250);
		hashSet1.add(200);
		hashSet1.add(500);
		hashSet1.add(90);

		Iterator<Integer> itr1 = hashSet1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("Sorted elements");
		List<Integer> inputList = new ArrayList<Integer>(hashSet1);
		Collections.sort(inputList);
		Iterator<Integer> sortItr = inputList.iterator();
		while (sortItr.hasNext()) {
			System.out.println(sortItr.next());
		}
	}

}
