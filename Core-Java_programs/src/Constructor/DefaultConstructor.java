package Constructor;

public class DefaultConstructor {

	int id;
	String name;

	public void display() {

		id = 10;
		name = "Hem Chandra Bhatt";

		System.out.println("ID = " + id + " " + "name = " + name);

	}

	public static void main(String[] args) {
		DefaultConstructor obj = new DefaultConstructor();
		obj.display();
		System.out.println("----------------");
		
		DefaultConstructor obj1 = new DefaultConstructor();
		obj1.display();

	}

}
