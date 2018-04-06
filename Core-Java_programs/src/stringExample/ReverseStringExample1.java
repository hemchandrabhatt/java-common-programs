package stringExample;

public class ReverseStringExample1 {

	public static boolean reverseString(String str) {
		//String temp=str;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		String str = "abcba";
		// String str1 =null;
		String temp = str.toLowerCase().replaceAll("[^a-z]", "");
		//System.out.println(str.length());
		boolean result = reverseString(temp);
		if(result ==true)
			System.out.println("String is pallendrom");
		else 
				System.out.println("String is not pallendrom");
	}

}
