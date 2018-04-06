package collectionExamples;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class CurrentHashMapExample {

	public static void main(String[] args) {

		Map<Integer, String> currentHashMap = new ConcurrentHashMap<Integer, String>();
		currentHashMap.put(1, "Hem");
		currentHashMap.put(2, "Chandra");
		currentHashMap.put(3, "Bhatt");
		currentHashMap.put(4, "Princy");

		System.out.println(currentHashMap);

		Iterator<Integer> itr = currentHashMap.keySet().iterator();
		while (itr.hasNext()) {
			Integer key = itr.next();
			if (key.equals(4))
				currentHashMap.put(4, "Suresh");
			    currentHashMap.put(5, "Bhauwan");
		}

		System.out.println("Current HashMap after modification ");
		System.out.println(currentHashMap);

		System.out.println("CurretnHashMap after delete one element");
		currentHashMap.remove(5);
		System.out.println(currentHashMap);

		System.out.println("Print particular calue of the element");
		System.out.println(currentHashMap.get(3));
		// System.out.println(currentHashMap);

	}

}
