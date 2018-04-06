package CommonPrograms;

public class PallendromStringExample {

	public static void main(String[] args) {

		String str = "abcbAaa".toLowerCase();
		StringBuilder pannelndromStr = new StringBuilder(str);
		String temp = pannelndromStr.reverse().toString();
		System.out.println(temp);
		if (str.equals(temp)) {
			System.out.println("String is pallendrom");

		} else {
			System.out.println("System is not pallendrom");
		}

	}

}

