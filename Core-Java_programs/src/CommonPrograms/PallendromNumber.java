package CommonPrograms;

public class PallendromNumber {

	public static void pallendromNumber(int number){
		int temp =number; int rem; int sum=0;
		while(number>0){
			rem=number%10;
			sum=sum*10 + rem;
			number=number/10;
		}
		if(temp==sum)
			System.out.println("Pallendrom");
		else
			System.out.println("NOT pallendrom");
		
	}
	public static void main(String[] args) {
		pallendromNumber(553455);
		

	}

}
