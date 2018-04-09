package CommonPrograms;

import java.util.Scanner;

public class PrimeNumberPrint {
	
	static void PrintPrimeNumber(int inputNumber){
		int flag = 0;
		if(inputNumber==0 || inputNumber==1){
			System.out.println("Given Number is not prime number");
			
		}else{
			for(int i=2;i<=inputNumber/2;i++){
				if(inputNumber%i==0){
					System.out.println("Given Number is not prime number");
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("Given number is prime number");
		}
		
	}
 //main starts from here
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int inputNumber=sc.nextInt();
		PrintPrimeNumber(inputNumber);
	}

}
