package SingletonClass;

public class SingletonClassExample3 {
	
	private static SingletonClassExample3 obj=null;
	
	private SingletonClassExample3(){
		
	}
	
	private static SingletonClassExample3 createNewSingletonCreationMethod(){
		if(obj==null)
			obj = new SingletonClassExample3();
	 return obj;
	}
	
	public void display(){
		System.out.println(obj);
		System.out.println("This is Trird Example of Singleton class");
	}

	public static void main(String[] args) {
		
		SingletonClassExample3 obj= SingletonClassExample3.createNewSingletonCreationMethod();
		//SingletonClassExample3 obj = new SingletonClassExample3();
		obj.display();

	}

}
