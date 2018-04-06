package CommonPrograms;

public class FactorialWithRecurssion {

	public static int factorialRecurssion(int number) {

		if (number == 0) {
			return 1;
		} else {
			return (number * factorialRecurssion(number - 1));
		}

	}

	public static void main(String[] args) {

		int fact = factorialRecurssion(5);
		System.out.println(fact);

	}

}
