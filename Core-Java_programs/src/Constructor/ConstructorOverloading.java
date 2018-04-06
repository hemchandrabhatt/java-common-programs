package Constructor;

public class ConstructorOverloading {

	int id;
	String name;
	int age;

	ConstructorOverloading(int i, String n) {

		id = 1;
		name = n;

	}

	ConstructorOverloading(int i, String n, int ag) {

		id =i;
		name =n ;
		age = ag;

	}

	public void dispaly() {

		System.out.println("ID : " +id+" "+"name : " +name);
	}

	public void dispaly1() {
		
		System.out.println("ID : " +id+" "+"name : " +name +" " +"Age : " +age);

	}

	public static void main(String[] args) {
		
		ConstructorOverloading obj=new ConstructorOverloading(10, "Hem");
		
		ConstructorOverloading obj1 = new ConstructorOverloading(10, "Chandra", 30);
		obj.dispaly1();
		obj.dispaly();
		
		System.out.println("-------------------------------");
		
		obj1.dispaly();
		obj1.dispaly1();
		
		
		
		

	}

}
