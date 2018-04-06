package multiThreadingExamples;

public class TestNumberPrinter {

	public static boolean turn = true;

	public static void main(String[] args) {

		//boolean evenFlag = true;

		EvenNumberPrinter even = new EvenNumberPrinter(0);
		OddNumberPrinter odd = new OddNumberPrinter(1);

		Thread evenThread = new Thread(even);
		Thread oddThread = new Thread(odd);

		evenThread.start();
		oddThread.start();

	}

}
