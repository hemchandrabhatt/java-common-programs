package CommonPrograms;

public class SmallestAndLongestNumber {
	

   public static void add(int a, int b){
	   
	   int c=a;
	   int d=b;
	   
	   int e=c+d;
	  
	   System.out.println(e);
	   
		
	}

	public static void main(String[] args) {
		
		add(10,20);
		
		int number[] =new int[]{23, 34,76, 45, 45, 67, 76,12,3, 5};
		int smallest = number[0];
		int largetst = number[0];
		
		for(int i=1; i<number.length; i++){
			if(number[i] > largetst)
                largetst = number[i];
             else if (number[i] < smallest)
            	 smallest = number[i];
				
				
		}
		
		 System.out.println("Largest Number is : " + largetst);
         System.out.println("Smallest Number is : " + smallest);

	}
	
	

}
