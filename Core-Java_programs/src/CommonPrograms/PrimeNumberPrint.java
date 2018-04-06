package CommonPrograms;

import java.util.Scanner;

public class PrimeNumberPrint {
	
	static void PrintPrimeNumber(int count){
		int temp = 0;
		for(int i=2; i<count;i++){
			for(int j=2;j<count;j++){
				temp=i%j;
			}
			
		}
		if(temp==0){
			System.out.println(count +" is Prime number");
		}
		else{
			
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int count=sc.nextInt();
		PrintPrimeNumber(count);
	}

}
