package CommonPrograms;

public class SumOfPrimeNumbers {

	public static void main(String[] args) {

		int inputNumber = 10;
		int sum = 0;
		for (int i = 0; i <= inputNumber; i++) {
			
			System.out.println(checkPrimeNumber(i));
			if (checkPrimeNumber(i) == true) {
				sum = sum + i;
			}
		}
		System.out.println("Sum given of prime number :::" + sum);

		System.out.println("========");
		sumOfNumbers(15);

	}

	private static boolean checkPrimeNumber(int i) {
		int flag = 0;
		if (i == 0 || i == 1){
			return false;
		}else {
			for (int j = 2; j <= i / 2; i++) {
				if (i % j == 0) {
					flag = 1;
					break;
					// return false;

				}
				if (flag == 0) {
					return false;
				}
			}
		}
		return true;

	}

	private static void sumOfNumbers(int n) {
		int i, sum = 0;
		for (i = 0; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("sum of given numbers" + sum);

	}

}
