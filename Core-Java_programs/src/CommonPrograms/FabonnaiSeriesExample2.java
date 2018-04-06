package CommonPrograms;

public class FabonnaiSeriesExample2 {

	public static boolean checkPrimenumber(int imputNumber) {
		for (int i = 2; i < imputNumber / 2; i++) {
			if (imputNumber % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {

		int n1 = 0, n2 = 1;
		int n3;
		int number = 10;
		System.out.print(n1 + " " + n2);
		for (int i = 2; i <= number; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		System.out.println("=============");
		if(checkPrimenumber(21)==true){
			System.out.println("Given number is prime number");
		}else{
			System.out.println("Given number is NOT prime number");
		}

	}

}
