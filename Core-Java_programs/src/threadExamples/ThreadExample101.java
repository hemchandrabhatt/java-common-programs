package threadExamples;

public class ThreadExample101 {
	

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				while (true) {
					System.out.println("hem");
					try {
						Thread.sleep(1000);

					} catch (InterruptedException ie) {
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				while (true) {
					System.out.println("Bhatt");
					try {
						Thread.sleep(1000);

					} catch (InterruptedException ie) {
					}

				}
			}
		});
		t1.start();
		t2.start();

	}

}
