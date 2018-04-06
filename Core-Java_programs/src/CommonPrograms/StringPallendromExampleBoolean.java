package CommonPrograms;

public class StringPallendromExampleBoolean {
	
	public static boolean checkStringPallendrom(String temp){
		String str =temp.toLowerCase().replaceAll("[^A-Z]", "");
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i) != str.charAt(str.length()-1-i))
				return true;
		}
		
		return false;
		
	}
	
	public static void checkPallendromNumber(int number){
		int inputNumber=number;
		int rem; int sum=0;
		while(number>0){
			rem=number%10;
			sum=sum*10 + rem;
			number=number/10;
		}
		if(inputNumber==sum){
			System.out.println("Number is pallendrom");
		}else{
			System.out.println("Number is not pallendrom");
		}
	}

	public static void main(String[] args) {
	
		boolean result=checkStringPallendrom("aABCBAA");
		if(result==true){
			System.out.println("String is NOT pallendrom");
		}else{
			System.out.println("String is pallendrom");
		}
		
		System.out.println("=========number check============");
		checkPallendromNumber(343);
		

	}

}
