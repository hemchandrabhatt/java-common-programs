package threadExamples;

public class ThreadExample{
	
	public void m1(Thread t1, Thread t2, Thread t3) throws InterruptedException{
		 
		t1.start();
		t1.join();
		t2.start();
		t3.start();
		System.out.println("Application is ready");
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadExample obj = new ThreadExample();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
					System.out.println("First Thread");
					try {
						Thread.sleep(1000);

					} catch (InterruptedException ie) {
					
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				
					System.out.println("DB Thread");
					try {
						Thread.sleep(1000);

					} catch (InterruptedException ie) {
					}

				
			}
		});
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				
					System.out.println("DB Thread");
					try {
						Thread.sleep(1000);

					} catch (InterruptedException ie) {
					}

				
			}
		});
		obj.m1(t1, t2, t3);
	
	}
	
}