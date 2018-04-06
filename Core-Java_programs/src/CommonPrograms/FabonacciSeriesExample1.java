package CommonPrograms;

public class FabonacciSeriesExample1 {

	public static void printFabonacciServices(int number) {
		int n0 = 0;
		int n1 = 1;
		int sum = 0;

		System.out.print(n0 + " " + n1);
		for (int i = 2; i < number; i++) {
			sum = n0 + n1;
			System.out.print(" " + sum);
			n0 = n1;
			n1 = sum;
		}

		System.out.println("");
	}

	public static void amstrongNumber(int number) {

		int temp = number;
		int rem;
		int sum = 0;
		while (number > 0) {
			rem = number % 10;
			sum = (int) (sum + Math.pow(rem, 3));
			System.out.println(sum);
			number = number / 10;

		}
		if (temp == sum) {
			// return true;
			System.out.println(temp + " " + "is amstrong number");

		} else
			System.out.println(temp + " " + "is not amstrong number");

	}

	public static void pallendromNumberCheck(int number) {
		int rem;
		int sum = 0;
		int temp = number;
		while (number > 0) {
			rem = number % 10;
			sum = sum * 10 + rem;
			number = number / 10;
		}

		if (temp == sum) {
			System.out.println(temp + " " + "is pallendrom");
		} else
			System.out.println(temp + " " + "is not pallendrom");
	}

	public static boolean pallendromStringExample(String str) {
		boolean result = false;
		String tempStr = str.toLowerCase().replaceAll("[^a-z]", "");
		for (int i = 0; i < tempStr.length(); i++) {
			if (tempStr.charAt(i) != tempStr.charAt(tempStr.length() - 1 - i)) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		printFabonacciServices(10);
		amstrongNumber(153);
		pallendromNumberCheck(777777777);
		boolean result = pallendromStringExample("aadfdgdgfdgfd");
		if (result == true) {
			System.out.println("String is pallendrom");
		} else
			System.out.println("String is not pallendrom");
	}

}
