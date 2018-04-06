package CommonPrograms;

public class CheckPallendromNumber {
	
	
	public static void printPallendromNumber(int number){
		int rem;
		int sum=0;
		int temp=number;
		while(number>0){
			rem=number%10;
			sum=sum*10+rem;
			number=number/10;
		}
		if(temp==sum){
			System.out.println("Given number is pallendrom");
		}else{
			System.out.println("Given number is NOT pallendrom");
		}
	}

	public static void main(String[] args) {
		printPallendromNumber(24542);

	}

}
