package CommonPrograms;

public class CheckStringIsPallendrom {
	
	public static boolean checkStringPanneldrom(String str){
		String temp =str.toLowerCase().replaceAll("[^a-z]", "");
		for(int i=0;i<temp.length()/2;i++){
			if(temp.charAt(i)!=temp.charAt(temp.length()-i-1)){
				return true;
			}
		}
		return false;
		
	}
	static String tempString="";
	public static void checkStringPanneldromCharReverse(String str){
		String temp =str.toLowerCase().replaceAll("[^a-z]", "");
		for(int i=temp.length()-1;i>=0;i--){
			tempString = tempString + temp.charAt(i);
		}
		//System.out.println(tempString);
		if(temp.equals(tempString)){
			System.out.println("Given String is pallendrom");
		}else{
			System.out.println("Given String is  not pallendrom");
		}
		
	}

	public static void main(String[] args) {

		String str="abcbaa".toLowerCase();
		String temp=new StringBuilder(str).reverse().toString();
		if(str.equals(temp)){
			System.out.println("String is pallendrom");
		}else{
			System.out.println("String is not pallendrom");
		}

		System.out.println("---------------thro funtion---------");
		boolean result=checkStringPanneldrom("ssabcbass");
		if(result==false){
			System.out.println("String is pallendrom");
		}else{
			System.out.println("String is not pallendrom");
		}
		
		System.out.println("---------------char reverse funtion---------");
		 checkStringPanneldromCharReverse("ssabcbass");
		
	}

}
