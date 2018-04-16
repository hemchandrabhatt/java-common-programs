package stringExample;

public class FindSumOfIntegersFromStringExample {

	public static void main(String[] args) {
		String str = "TestPassed=40 TestRepeated=10 TestSkipped=4";
		int sum = 0;
		String[] strArray = str.split(" ");
		// String[] strSubArray = new String[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			String[] strSubArray = strArray[i].split("=");
			String strSum = strSubArray[strSubArray.length - 1].toString();
			int resultNumber = Integer.parseInt(strSum);
			sum = sum + resultNumber;
			// System.out.println(strSum);
		}
		System.out.println("The sum of the given numbers are : " + sum);

	}

}
