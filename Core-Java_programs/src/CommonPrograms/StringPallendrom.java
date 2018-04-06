package CommonPrograms;

public class StringPallendrom {

	public static boolean checkPallendrom(String str) {

		for (int i = 0; i <= str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}

		return true;

	}
	public static void checkPallendromByStringBuffer(String str) {
		String temp=str.toLowerCase().replaceAll("[^a-z]", "");
		String reverseString=new StringBuffer(temp).reverse().toString();
		if(temp.equals(reverseString)){
			System.out.println("String is pallendrom");
		}else{
			System.out.println("String is not pallendrom");
		}

	}

	public static void main(String[] args) {
		if (checkPallendrom("abcba") == true)
			System.out.println("String is pallendrom");
		else
			System.out.println("String is not pallendrom");
		
		System.out.println("------------");
		checkPallendromByStringBuffer("abcb A");

	}

}
