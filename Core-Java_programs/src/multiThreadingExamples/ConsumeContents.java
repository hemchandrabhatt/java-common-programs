package multiThreadingExamples;


public class ConsumeContents implements Runnable {
	

	public void run() {

		while (true) {
			synchronized (ProduceAndConsumeTest.object) {
				if (ProduceAndConsumeTest.holder == null) {
					System.out.println("waiting for producer TO produce");

					try {
						ProduceAndConsumeTest.object.wait();
					} catch (InterruptedException e) {

					}

				} else {
					System.out.println("Consuming " + ""
							+ ProduceAndConsumeTest.holder);
					try{
						Thread.sleep(1000);
					}catch(InterruptedException ie){
						
					}
					ProduceAndConsumeTest.holder = null;
					ProduceAndConsumeTest.object.notify();
				}

			}

		}
	}
}
