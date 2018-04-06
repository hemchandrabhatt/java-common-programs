package threadExamples;

public class ThreadExample107 {

	public static void main(String[] args) {

		ThreadUsingRunnableInterface obj = new ThreadUsingRunnableInterface();
		Thread t1 = new Thread(obj);
		

		System.out.println(t1.getPriority());
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		t1.setPriority(1);
		System.out.println(t1.getPriority());
		t1.start();
		
		System.out.println("parent thread");

	}

}
