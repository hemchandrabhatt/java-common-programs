package javaCodeExamples;

public class bubbleSort {
	
	public static void bubblsourt(int[] arr){
		
		int length = arr.length;
		
		int temp=0;
		for(int i=0; i<=length;i++)
		{
			for(int j=1; j<=length-1;j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}
	

	public static void main(String[] args) {
		
		int arr[] ={8,2,4,89,45,23,87,16,3,6};
		int n =arr.length;
		for (int i=0; i<=n-1; i++){
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		bubblsourt(arr);
		for (int i=0; i<=n-1; i++){
			System.out.print(arr[i]+" ");
		}
		
	}

}
