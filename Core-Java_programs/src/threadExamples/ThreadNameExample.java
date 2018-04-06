package threadExamples;

 class MyClass extends Thread{
	//@SuppressWarnings("unused")
	public void run() {
		System.out.println("Current Thread");

	}
}

public class ThreadNameExample {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		//Thread.currentThread().setName("Hem Chandra");
//		System.out.println(Thread.currentThread().getName());
//		MyClass obj = new MyClass();
//		obj.start();
//		obj.currentThread().setName("suresh");
//		System.out.println(MyClass.currentThread().getName());
		

	}

}
