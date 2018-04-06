package threadExamples;

public class ThreadExample1 extends Thread{
	
	public void run()
	{
		System.out.println("Thread is running....");
	}

	public static void main(String[] args) {

		ThreadExample1 t1= new ThreadExample1();
		t1.run();

	}

}
