package SingletonClass;

public class SingletonClassExample4 {

	private static SingletonClassExample4 obj = null;

	private SingletonClassExample4() {

	}

	private static SingletonClassExample4 createMethod() {
		if (obj == null)
			obj = new SingletonClassExample4();
		return obj;
	}

	public void display() {
		System.out.println("This is forth example for singleton.");
	}

	public static void main(String[] args) {
		
		SingletonClassExample4 obj1 =SingletonClassExample4.createMethod();
		obj1.display();
		
		

	}

}
