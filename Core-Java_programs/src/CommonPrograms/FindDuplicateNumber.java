package CommonPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class FindDuplicateNumber {

	public void findDuplicateNumber() {
		ArrayList<Integer> ls = new ArrayList<Integer>();

		ls.add(10);
		ls.add(10);
		ls.add(30);
		ls.add(330);
		ls.add(50);
		ls.add(60);
		ls.add(50);
		ls.add(220);
		ls.add(10);
		ls.add(50);
		ls.add(100);
		ls.add(90);

		Iterator<Integer> Ir = ls.iterator();

		while (Ir.hasNext()) {
			System.out.println(Ir.next());

		}

		System.out.println("-----------------------");

		int size = ls.size();
		// int count;
		HashSet<Integer> hash = new HashSet<Integer>();

		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j <= size - 1; j++) {
				// System.out.println("heloo");
				if (ls.get(i) == ls.get(j)) {

					System.out.println(ls.get(i));
					hash.add(ls.get(i));

					/*
					 * ArrayList<Integer> ls2= new ArrayList<Integer>();
					 * ls2.get(i);
					 * 
					 * for (int k = 0; k < size - 1; k++) { for (int m = k + 1;
					 * m <= size - 1; m++) {
					 * 
					 * 
					 * } }
					 */

					// System.out.println(j-1);

					// count=i;

					// System.out.println(ls.indexOf(ls.get(count)));
				}

				// count++;
				// System.out.println(count);
				// System.out.println(ls.get(i));

			}
		}

		System.out.println("--------------");
		System.out.println(hash);

	}

	public void findDuplicateValueHashSet(){
		
		HashSet<Integer> hash = new HashSet<Integer>();
		hash.add(10);
		hash.add(10);
		hash.add(30);
		hash.add(330);
		hash.add(50);
		hash.add(60);
		hash.add(50);
		hash.add(220);
		hash.add(10);
		hash.add(50);
		hash.add(100);
		hash.add(90);
		
		Iterator<Integer> ir =hash.iterator();
		while(ir.hasNext()){
			int value= ir.next();
			System.out.println(value);
		}
		
		
	}
	public static void main(String[] args) {

		FindDuplicateNumber obj = new FindDuplicateNumber();
		obj.findDuplicateNumber();
		System.out.println("-----------------");
		obj.findDuplicateValueHashSet();
	}

}
