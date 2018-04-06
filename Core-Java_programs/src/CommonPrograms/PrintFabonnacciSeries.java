package CommonPrograms;

public class PrintFabonnacciSeries {

	public static void printFabonacciSeriesMethod(int number) {
		int no = 0, n1 = 1;
		int sum, i;
		System.out.print(no + " " + n1);
		for (i = 2; i < number; ++i) {
			sum = no + n1;
			System.out.print(" " + sum);
			no = n1;
			n1 = sum;

		}
	}

	public static void main(String[] args) {
		printFabonacciSeriesMethod(10);
	}

}
