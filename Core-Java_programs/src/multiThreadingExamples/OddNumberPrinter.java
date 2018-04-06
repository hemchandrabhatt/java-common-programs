package multiThreadingExamples;

class OddNumberPrinter implements Runnable {

	int startNumber;

	OddNumberPrinter(int startNumber) {

		this.startNumber = startNumber;

	}

	public void run() {

		while (true) {
			synchronized (TestNumberPrinter.class) {
				if (TestNumberPrinter.turn == false) {
					System.out.println(Thread.currentThread().getName() + " "
							+ startNumber);
					startNumber = startNumber + 2;
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println(e);
					}
				}
				TestNumberPrinter.turn = true;
			}
		}

	}

}
