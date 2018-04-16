package stringExample;

public class CountDuplicateCharFromString {

	public static void main(String[] args) {
		int count = 1;
		int i, j;
		String str = "I m an Genpact Employee".toLowerCase().replaceAll("\\s",
				"");
		char[] charArr = str.toCharArray();
		for (i = 0; i < charArr.length; i++) {
			for (j = i + 1; j < charArr.length; j++) {
				if (charArr[i] == charArr[j]) {
					count = count + 1;
					charArr[j] = 0;
				}
			}
			if (charArr[i] != 0 && count > 1) {
				System.out.println(charArr[i] + "----" + count);
			}
			count = 1;
		}

	}

}
