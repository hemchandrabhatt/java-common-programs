package CommonPrograms;

public class CalculatePurmutation {

	public static void main(String[] args) {

		String inputStr = "ABC";
		int strLength = inputStr.length();
		permutation(inputStr, 0, strLength - 1);

	}

	private static void permutation(String inputStr, int i, int j) {
		if (i == j) {
			System.out.println(inputStr);
		} else {
			for (int k = i; k <= j; k++) {
				inputStr = swap(inputStr, i, k);
				permutation(inputStr, i + 1, j);
				inputStr = swap(inputStr, i, k);
			}
		}

	}

	private static String swap(String inputStr, int i, int k) {
		char[] charArray = inputStr.toCharArray();
		char temp = charArray[i];
		charArray[i] = charArray[k];
		charArray[k] = temp;
		return String.valueOf(charArray);
	}

}
