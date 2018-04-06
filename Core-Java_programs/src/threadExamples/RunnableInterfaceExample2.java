package threadExamples;

public class RunnableInterfaceExample2 implements Runnable{
	
	public void run(){
		System.out.println("this is second example  ...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		RunnableInterfaceExample2 m1  = new RunnableInterfaceExample2();
		Thread t1 = new Thread(m1);
		t1.start();

	}

}
