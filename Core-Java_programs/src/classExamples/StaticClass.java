package classExamples;

public class StaticClass {
	
	static
	{
		System.out.println("static block -1");
	}
	static
	{
		System.out.println("static block -2");
	}
	
	{
		System.out.println("instance block -1");
	}
	{
		System.out.println("instance block -2");
	}
	
	StaticClass()
	{
		System.out.println("0-arg-constructor");
	}
	 int a;
	StaticClass(int a)
	{
		this.a=a;
		System.out.println("1-arg-constructor");
		System.out.println(a);
	}

	public static void main(String args[]){
		
		//System.out.println("hem");
		//m();
		//m1();
		
		StaticClass obj = new StaticClass();
		StaticClass obj1 = new StaticClass(10);
		
		
		
	}
	
	

}
