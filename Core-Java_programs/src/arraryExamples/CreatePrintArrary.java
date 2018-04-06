package arraryExamples;

public class CreatePrintArrary {
	
	static int[] removeDuplicateElements(int[] arr3){
		
		int[] tempArray= new int[6];
		int size = arr3.length;
		for(int i=0;i<= size-1; i++){
			System.out.println(arr3[i]);
		}
		
		System.out.println("Remove Duplicates");
		for(int i=0;i<= size-1; i++){
			for(int j=i+1;i<= size-1; j++){
				
				if(arr3[i]==arr3[j]){
					
					tempArray[0]=arr3[i];
					
				}
			}
			
		}
		
		
		
		return  arr3 ;
		
	}

	public static void main(String[] args) {

		int[] arr = {7,8,6,7,6,7};
		int size = arr.length;
		int arr1[] =new int[11];
		arr1[0]=10;
		arr1[1]=10;
		arr1[2]=10;
		arr1[3]=10;
		arr1[4]=10;
		arr1[5]=10;
		arr1[6]=10;
		arr1[7]=10;
		arr1[8]=10;
		arr1[9]=10;
		
		
		for(int i=0;i<= size-1; i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("---------------------");
		for(int i=0;i<= 10; i++){
			System.out.println(arr1[i]);
		}
		
		System.out.println("=========================");
		
		int []arr3 = removeDuplicateElements(arr);
	
		for(int i=0;i<= arr3.length-1; i++){
			System.out.println(arr1[i]);
		}
	}

}
