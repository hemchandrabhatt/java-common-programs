package arraryExamples;

public class FindMissingNumber {

	public static void findMissingNumber(int[] arr){
		int sum=0, sumArr=0; int missingNumber;
		for(int i=0;i<=arr.length+1;i++){
			sum=sum+i;
		}
		//System.out.println(sum);
		for(int i=0;i<arr.length;i++){
			sumArr=sumArr+arr[i];
		}
		//System.out.println(sumArr);
		missingNumber=sum-sumArr;
		System.out.println(sum-sumArr);
		
	}
	public static void main(String[] args) {
		int[] arr={1,2,3,5,6,4,8};
		findMissingNumber(arr);

	}

}
