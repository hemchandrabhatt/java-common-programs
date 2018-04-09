package CommonPrograms;

public class PrintDuplicateCharatersExample {

	public static void main(String[] args) {

		String str = "abcaanmbvav";
		char[] arr = str.toCharArray();
		
		int i, j, count=1;
		for(i=0;i<arr.length;i++){
			for(j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
					arr[j]=0;
				}
			}
			if(arr[i]!=0)
			System.out.println(arr[i] +"---------"+ count);
			
			count=1;
			
		}
		

	}

}
