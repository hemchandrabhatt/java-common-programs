package inheritanceExamples;

public class InheritanceExample1 {

	public static void main(String[] args) {
		C obj = new C();
		obj.methodC();
		obj.methodB();
		// needs to ask how to call the method A from obj
	}

}

class A extends B {
	public void methodA() {
		System.out.println("This is menthod A");
	}
}

class B {
	public void methodB() {
		System.out.println("This is menthod B");
	}
}

class C extends B {
	public void methodC() {
		System.out.println("This is menthod C");
	}
	
}

