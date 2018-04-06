package CommonPrograms;

public class PrintPrumutationPattern {

	public static void main(String[] args) {
		
		String inputStr="MAN";
		int strLength = inputStr.length();
		
		printPrumutationPattern(inputStr, 0, strLength-1);
	}

	private static void printPrumutationPattern(String inputStr, int i,
			int strLength) {
		if(i==strLength){
			System.out.println(inputStr);
		}else{
			for(int j=i;j<=strLength;j++){
				inputStr=swap(inputStr,i,j);
				printPrumutationPattern(inputStr,i+1,strLength);
				inputStr=swap(inputStr,i,j);
			}
		}
		
	}

	private static String  swap(String inputStr, int i, int j) {
		char[] charArray=inputStr.toCharArray();
		char temp;
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
		
		
	}

}
