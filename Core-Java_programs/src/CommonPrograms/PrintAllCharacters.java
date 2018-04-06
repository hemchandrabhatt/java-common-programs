package CommonPrograms;

import java.util.Arrays;

public class PrintAllCharacters {
	
	public static void factorialNumber(int number){
		int sum=0;
		for(int i=1;i<=number;i++){
			sum=sum+(number+1-i);
		}
		System.out.println("The Factorial is : "+" "+sum);
	}	

	public static void main(String[] args) {
		factorialNumber(5);
		char[] charArr=new char[90];
		for(int i=65;i<90;i++){
			//System.out.print(((char)i));
			charArr[i]=(char)i;
		}
		System.out.println("");
		System.out.println("=========");
		for(int i=65;i<90;i++){
			System.out.println(charArr[i]);
		}
		System.out.println("=========");
		String str = new String(charArr);
		System.out.println(str);
		
		String strb = new StringBuilder(str).reverse().toString();
		System.out.println(strb);
	}

}
