package SingletonClass;

public class SingletonExample5 {
	private static SingletonExample5 obj = null;

	private SingletonExample5() {

	}

	private static SingletonExample5 createNewObject() {
		if (obj == null)
			obj = new SingletonExample5();
		return obj;

	}
	
	public void display(){
		System.out.println("THis is fifth example of singleton class");
	}

	public static void main(String[] args) {

		SingletonExample5 obj=SingletonExample5.createNewObject();
		obj.display();

	}

}
