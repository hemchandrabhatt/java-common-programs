package CommonPrograms;

public class MainMethodStatic extends B {

	/*
	 * public static final void m(){ System.out.println("m1"); }
	 */
	public void m(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {

		System.out.println("this is main method");
		// B ob=new MainMethodStatic();
		// MainMethodStatic ob=(MainMethodStatic) new B();
		// B ob = new B();
		MainMethodStatic ob = new MainMethodStatic();
		B obj = (B) ob;
		obj.m(5);

		Dog d = new Dog();
		Animal a = (Animal) d;
		d.callme();
		a.callme();
		((Dog) a).callme2();
	}

}

class B {
	public void m(int a) {
		a = 10;
		System.out.println("this is supperclass" + "" + a);
	}
}

class Animal {
	public void callme() {
		System.out.println("In callme of Animal");
	}
}

class Dog extends Animal {
	public void callme() {
		System.out.println("In callme of Dog");
	}

	public void callme2() {
		System.out.println("In callme2 of Dog");
	}
}