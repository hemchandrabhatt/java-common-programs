package stringExample;

public class ReverseWordsFromStringExample {

	public static void main(String[] args) {
		
		String str= "ABC DAB VCM OKKNHB OKC";
		String[] stringArray = str.split(" ");
		for(int i=stringArray.length-1; i<=stringArray.length-1; i--){
			System.out.print(stringArray[i]+" ");
		}
		//System.out.println("TEST");
	}

}
