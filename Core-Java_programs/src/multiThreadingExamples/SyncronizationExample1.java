package multiThreadingExamples;

class PrintTable {
	public static synchronized void printTable(int number) {
		for (int i = 0; i <= 5; i++) {
			System.out.println(+number);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class ThreadClass1 extends Thread {
	PrintTable example;

	public void run() {
		example.printTable(10);
	}
}

class ThreadClass2 extends Thread {
	PrintTable example;

	public void run() {
		example.printTable(100);
	}
}

public class SyncronizationExample1 {
	public static void main(String[] args) {

		ThreadClass1 t1 = new ThreadClass1();
		ThreadClass2 t2 = new ThreadClass2();

		t1.start();
		t2.start();

	}
}