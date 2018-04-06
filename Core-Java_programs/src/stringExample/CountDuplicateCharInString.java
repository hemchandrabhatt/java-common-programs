package stringExample;

public class CountDuplicateCharInString {

	public static void main(String[] args) {

		String strOrg="Hem Chandra Bhatt";
		String str=strOrg.toLowerCase().replaceAll("[^a-z]", "");
		char[] charArr =str.toCharArray();
		System.out.println(str);
		int i, j; 
		int count=1;
		for(i=0; i<charArr.length; i++){
			for(j=i+1; j<charArr.length;j++){
				if(charArr[i]==charArr[j]){
					count=count+1;
					charArr[j]=0;
				}
			}
			if(charArr[i]!=0){
				System.out.println(charArr[i] +"----"+ count);
			}
			count=1;
		}
		
	}

}
