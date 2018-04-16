package sortingExamples;

public class bubbleSort {

	public static void main(String[] args) {
		int i, j, temp;
		int[] arr = { 10, 30, 1, 15, 25 };
		for(i=0; i<arr.length; i++){
			for(j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(i=0; i<arr.length; i++){
			System.out.print(arr[i] +" ");
		}
		
	}

}
