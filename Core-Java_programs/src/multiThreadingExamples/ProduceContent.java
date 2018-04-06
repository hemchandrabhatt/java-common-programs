package multiThreadingExamples;

public class ProduceContent implements Runnable {

	int startPoint;

	ProduceContent(int startPoint) {
		this.startPoint = startPoint;
	}
	
	ProduceContent(){
		this.startPoint=0;
	}

	public void run() {

		while (true) {
			synchronized (ProduceAndConsumeTest.object) {
				if (ProduceAndConsumeTest.holder != null) {
					System.out.println("Waiting for cosumer to consume");
					try {
						ProduceAndConsumeTest.object.wait();
					} catch (InterruptedException e) {

					}

				}
				else{
					System.out.println("Produced content : " + startPoint);
					ProduceAndConsumeTest.holder = startPoint++;
					
					try{
						Thread.sleep(1000);
					}catch(InterruptedException ie){
						
					}
					ProduceAndConsumeTest.object.notify();
				}

				
			}
		}

	}
}
