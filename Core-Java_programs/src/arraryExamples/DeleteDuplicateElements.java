package arraryExamples;

public class DeleteDuplicateElements {
	//int[] arr;
	
	public static void removeDuplicateNumber(int[] arr){
		int count =-1;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length-1;j++){
				if(arr[i]==arr[j]){
					arr[j]=0;
					count=count+1;
				}
			}
			System.out.println(arr[i]);
			
		}
		System.out.println("-------");
		System.out.println(count);
		
//		int[] temp=new int[arr.length-count];
//		for(int i=0;i<temp.length-1;i++){
//			if()
}
		
	
	public static void main(String[] args) {
		
		
		
		int[] arr={5,4,6,4,8,5,9,11};
		for(int i=0;i<arr.length-1;i++){
			System.out.println(arr[i]);
		}

		System.out.println("----------Remove duplicate int in arr-----------");
		removeDuplicateNumber(arr);
	}

}
