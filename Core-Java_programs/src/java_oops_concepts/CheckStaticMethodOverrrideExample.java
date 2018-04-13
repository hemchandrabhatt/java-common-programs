package java_oops_concepts;

public class CheckStaticMethodOverrrideExample{
	
public static void main(String[] args) {
		B obj = new B();
		obj.method();
		A obj1 = new B();
		obj1.method();
	}

}

class A{
	public static void method(){
		System.out.println("This is parant class method.");
	}
}

class B extends A{
	public static void method(){
		System.out.println("This is child class method.");
	}
}
