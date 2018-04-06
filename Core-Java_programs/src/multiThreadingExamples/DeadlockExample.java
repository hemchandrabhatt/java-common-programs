package multiThreadingExamples;

public class DeadlockExample extends Thread {
	DeadlockExamplemain obj=new DeadlockExamplemain();
	Thread t2 =Thread.currentThread();
	public void run() {
		synchronized(DeadlockExample.class)
		{
		for (int i = 1; i < 10; i++) {
			/*try {
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			System.out.println("child thread");
		}
		}

	}

}
