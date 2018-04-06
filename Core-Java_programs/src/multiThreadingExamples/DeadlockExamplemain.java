package multiThreadingExamples;

public class DeadlockExamplemain {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("hhhh");
		DeadlockExample obj = new DeadlockExample();
		Thread t1 = new Thread(obj);
		t1.start();
		//t1.join();
		synchronized(obj)
		{
			for (int i = 1; i < 10; i++) {
		}
			System.out.println("Main Thread");
		}
	}
		
	//Thread t2=Thread.currentThread();
		
		
		

	}

