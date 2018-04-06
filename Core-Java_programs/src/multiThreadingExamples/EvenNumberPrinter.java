package multiThreadingExamples;

class EvenNumberPrinter implements Runnable {

	int startNumber;

	EvenNumberPrinter(int startNumber) {

		this.startNumber = startNumber;

	}

	public void run() {

		while (true) {
			synchronized (TestNumberPrinter.class) {
				if (TestNumberPrinter.turn == true) {
					System.out.println(Thread.currentThread().getName() + " "
							+ startNumber);
					startNumber = startNumber + 2;
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println(e);
					}
				}
				TestNumberPrinter.turn = false;
			}
		}

	}

}