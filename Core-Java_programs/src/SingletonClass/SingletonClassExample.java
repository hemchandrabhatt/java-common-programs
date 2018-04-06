package SingletonClass;

public class SingletonClassExample {

	private static SingletonClassExample obj = null;

	private SingletonClassExample() {

	}

	public static SingletonClassExample objectCreationMethod() {
		if (obj == null) {
			obj = new SingletonClassExample();
		}

		return obj;

	}

	public void display() {
		System.out.println("Singleton Class Example");
	}

	public static void main(String arg[]) {

		SingletonClassExample object = SingletonClassExample
				.objectCreationMethod();
		object.display();
	}

}
