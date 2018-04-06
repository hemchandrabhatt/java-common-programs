package CommonPrograms;

public class ReverseStringThroArray {
	
	//static char[] reservechar=null;
	
	public static void reverseStringArray(String str){
		
		String temp=str.toLowerCase().replaceAll("[^a-z]", "");
		char[] charArray = temp.toCharArray();
		
		char tempChar;
		int i=0;
		int j=charArray.length-1;
		
		while(i<j){
			tempChar=charArray[j];
			charArray[j]=charArray[i];
			
			charArray[i]=tempChar;
			i++;
			j--;
		}
		//System.out.println(charArray);
		
		String reverseString=new String(charArray);
		
		//System.out.println("result string after reverse");
		//System.out.println(reverseString);
		
		if(temp.equals(reverseString))
			System.out.println("String is palledrom");
		else
			System.out.println("String is NOT palledrom");
		
	}

	public static void main(String[] args) {
		reverseStringArray("Aabcba A");

	}

}
