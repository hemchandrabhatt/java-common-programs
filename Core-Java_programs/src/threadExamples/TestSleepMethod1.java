package threadExamples;

public class TestSleepMethod1 extends Thread {
	public void run() {

		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		TestSleepMethod1 t1 = new TestSleepMethod1();
		TestSleepMethod1 t2 = new TestSleepMethod1();
		t1.start();
		//Thread.sleep(20);
		t2.start();

	}

}
