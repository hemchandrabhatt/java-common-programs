package exceptionExamples;

public class ThrowsExample {
	
	public static void   m1(){
		try {
			int i =50/0;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("hhhh");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}

}
