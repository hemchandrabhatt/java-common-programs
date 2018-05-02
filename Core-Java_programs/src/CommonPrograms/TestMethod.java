package CommonPrograms;

public class TestMethod {
	
	final int a;
	TestMethod(int a){
		this.a=a;
	}
	

	public static void main(String[] args) {
		/*BCA obj = new BCA();
		ABC obj1 = (ABC)obj;
		obj1.m1();*/
		TestMethod obj = new TestMethod(100);
		//TestMethod obj = new TestMethod(100);
		System.out.println(obj.a);
		
		
		

	}

}

class ABC{
	public void m1(){
		System.out.println("this is supper class method");
		
	}
	public void m2(){
		System.out.println("this is supper class method");
		
	}
	
	
}
class BCA extends ABC{
	public void m1(){
		System.out.println("this is supper class method");
		
	}
	
	public void m3(){
		System.out.println("this is supper class method");
		
	}
	
}