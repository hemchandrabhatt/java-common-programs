package collectionExamples;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {
	MONDAY, TUESDAY, WENNESDAY, THRUSDAY, FRIDAY, SATURDAY;
}

public class EnumSetExample {

	public static void main(String[] args) {

		Set<days> set = EnumSet.of(days.MONDAY, days.THRUSDAY, days.FRIDAY,
				days.SATURDAY);

		Iterator<days> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out
				.println("======EnumSet.allOf(days.class) method to all all elements of enum class");

		Set<days> setAll = EnumSet.allOf(days.class);

		Iterator<days> itrAll = setAll.iterator();
		while (itrAll.hasNext()) {
			System.out.println(itrAll.next());
		}

	}

}
