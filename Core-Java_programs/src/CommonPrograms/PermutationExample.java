package CommonPrograms;

public class PermutationExample {
	
	public static void permutationExample(String str, int l, int r){
		
		if(l==r){
			System.out.println(str);
		}else{
			for(int i=l; i<=r;i++){
				str= awap(str, l,i);
				permutationExample(str, l+1, r);
				str= awap(str, l,i);
			}
		}
	}

	private static String awap(String str, int l, int i) {
		char temp;
		char[] charArray = str.toCharArray();
		temp= charArray[l];
		charArray[l] = charArray[i];
		charArray[i] = temp;
		
		
		return String.valueOf(charArray);
	}

	public static void main(String[] args) {

		String str = "ABC";
		int n = str.length();
		permutationExample(str, 0, n-1);
		

	}

}
