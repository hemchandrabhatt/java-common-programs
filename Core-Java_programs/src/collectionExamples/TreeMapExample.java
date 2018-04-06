package collectionExamples;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String , String> map= new TreeMap<String , String>();
		map.put("1", "Hem");
		map.put("2", "Bhatt");
		map.put("3", "Chandra");
		map.put("4", "Vinnet");
		
		Set itr=map.entrySet();
		
		Iterator it =itr.iterator();
		
		while(it.hasNext()){
			Map.Entry<String, String> ma =(Entry<String, String>) it.next();
			
			System.out.println(ma.getKey() +" "+ ma.getValue());
			
		}
		
		
		

	}

}
