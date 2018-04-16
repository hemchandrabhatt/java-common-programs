package stringExample;

public class FindLongestSubStringFromString {

	public static void main(String[] args) {

		String str = "I m an Indian";
		String[] strArray = str.split(" ");
		int[] count = new int[strArray.length];
		int j = 0;
		// count[i]=0;
		for (int i = 0; i < strArray.length; i++) {
			count[j++] = strArray[i].length();
		}
		int pos = 0;
		int max = count[0];
		for (int i = 0; i < count.length; i++) {
			if (max < count[i]) {
				pos = i;
				max = count[i];

			}
		}
		System.out.println(pos);

		System.out.println(strArray[pos]);
		System.out.println(strArray[pos].length());
	}

}
