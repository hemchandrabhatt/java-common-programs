package CommonPrograms;

public class FabonacciSeriesUsingRecurssion {

	public static void main(String[] args) {

		int fact = factorial(6);
		System.out.println(fact);
		
	}

	private static int  factorial(int number) {
		if(number==0)
			return 1;
		else
			return (number*factorial(number-1));
		
		
	}

}
