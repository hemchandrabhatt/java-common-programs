package threadExamples;

public class RunnableInterfaceExample1 implements Runnable{
	
	public void run(){
		System.out.println("Thread is running thro runnable imterface...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableInterfaceExample1 m1 = new RunnableInterfaceExample1();
		//m1.run();
		Thread t1 = new Thread(m1);
		t1.start();

	}

}
