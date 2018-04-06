package SingletonClass;

public class SingletonClassExample1 {
	
	private static SingletonClassExample1 obj=null;
	
	private SingletonClassExample1(){
		
	}
	
	private static SingletonClassExample1 createNewobjectCreationMethod()
	{
		if(obj==null)
			obj=new SingletonClassExample1();
		return obj;
	}
	
	public void display()
	{
		System.out.println("This is second example of Singleton Class.");
	}

	public static void main(String[] args) {

		SingletonClassExample1 obj = SingletonClassExample1.createNewobjectCreationMethod();
		obj.display();
		

	}

}
