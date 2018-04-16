package stringExample;

public class ReverseWordsFromString {

	public static void main(String[] args) {

		String str = "Welcome To SeleniumWebdriver.org";
		String[] strArray = str.split(" ");
		for (int i = strArray.length - 1; i >= 0; i--) {
			System.out.print(strArray[i] + " ");
		}

	}

}
