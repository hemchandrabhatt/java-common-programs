package Constructor;

public class ParameterizedConstructor {

	int id;
	String name;

	ParameterizedConstructor(int i, String n) {

		id = i;
		name = n;

	}
	
	public void display(){
		System.out.println("ID : " +id +" " +"Name : " +name);
	}

	public static void main(String[] args) {
		
		ParameterizedConstructor obj = new ParameterizedConstructor(10, "Hem");
		ParameterizedConstructor obj1 = new ParameterizedConstructor(11, "Chandra");
		ParameterizedConstructor obj2 = new ParameterizedConstructor(12, "Bhatt");
		obj.display();
		obj1.display();
		obj2.display();
		
		
		
		
	}

}
