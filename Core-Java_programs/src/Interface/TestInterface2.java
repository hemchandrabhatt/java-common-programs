package Interface;

public class TestInterface2 {
	
	 static String str ="hem";
	 
	 
	
		public  static void testMethod(){
			
			str="chandra";
			System.out.println(str);
			
		}

	public static void main(String[] args) {
		
		Bank b = new SBI();
		System.out.println("ROI: "+b.rateOfInterest());  
		System.out.println("ROI: "+b.withdrowMoney()); 
		Bank c = new PNB();
		System.out.println("ROI: "+c.rateOfInterest());
		System.out.println("ROI: "+c.withdrowMoney()); 
		
		StringBuilder str= new StringBuilder("habgdbcbaa");
		StringBuilder str1= str.reverse();
		System.out.println(str1);
		//String str1;
		testMethod();
		
		String[] e={"a","b"};
		
		
	}

}
