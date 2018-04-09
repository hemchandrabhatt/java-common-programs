package systemClassExample;

import java.util.Scanner;

public class SystemInputExample {

	public static void main(String[] args) {
		int a = 0; String str3 = null;
		System.out.println(a+" "+str3);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = input.nextLine();
		System.out.println("Entered string is :::"+str);
		
		System.out.println("Enter another string: ");
		String str2 = input.nextLine();
		System.out.println("2nd entered string is :::"+str2);

	}

}
