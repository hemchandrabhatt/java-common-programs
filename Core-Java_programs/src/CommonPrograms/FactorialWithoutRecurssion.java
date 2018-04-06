package CommonPrograms;

public class FactorialWithoutRecurssion {
	

	public static void main(String[] args) {
		
		int fact =1;
		int number=6;
		
		for(int i=1; i<=number; i++){
			fact=fact*i;
		}
		System.out.println(fact);
		
		fabonacciSerices(number);

	}

	private static void fabonacciSerices(int number) {
		
		int n1=0, n2=1, n3;
		
	System.out.print(n1 +" "+ n2);
	for(int i=2; i<number;i++){
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
	}
		
	}

}
