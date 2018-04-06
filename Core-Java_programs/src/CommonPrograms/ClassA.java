package CommonPrograms;

public class ClassA {

	static{
		System.out.println("Class A");
	}
	public static void main(String[] args) throws ClassNotFoundException {
		
		
			Class.forName("ClassB");
			Class.forName("ClassC");
		

	}

}
 class ClassB{
	 static{
		 System.out.println("Class B");
	 }
 }
 class ClassC{
	 static{
		 System.out.println("Class C");
	 }
 }