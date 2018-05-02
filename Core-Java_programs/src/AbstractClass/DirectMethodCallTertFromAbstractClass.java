package AbstractClass;

public class DirectMethodCallTertFromAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AbstractClass obj = new AbstractClass();
		
		NormalClass obj = new NormalClass();
		obj.abstrctMethod();
	

	}

}

abstract class AbstractClass{
	
	public void concreatMethod(){
		System.out.println("this is concreate method");
	}
	abstract void abstrctMethod(); 
	
}

class NormalClass extends AbstractClass{
	
	@Override
	void abstrctMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is abstract method implimentation");
		
	}
	
	
	
}

interface myInterface{
	
	 void methodInterface1(int a, int b);
	 void methodInterface2();
	 void methodInterface3();
	 
}

class InterfaceImplementation implements  myInterface {
	

	@Override
	public void methodInterface2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodInterface3() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void methodInterface1(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}