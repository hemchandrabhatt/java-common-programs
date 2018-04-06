package threadExamples;

public class ThreadExample105{
	
	public void m1(Thread t1, Thread t2, Thread t3){
		 
		 try{
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			t3.start();
			t3.join();
		    System.out.println("Application is ready");
		 }
		
		catch(InterruptedException ie){}
		
	}
	
	
	public static void main(String[] args) {
		
		ThreadExample105 obj = new ThreadExample105();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {

					System.out.println("Network Thread");
					try {
						Thread.sleep(1000);

					} catch (InterruptedException ie) {
					
				}
				System.out.println("Network thread done");
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				
					System.out.println("DB Thread");
					try {
						Thread.sleep(1000);

					} catch (InterruptedException ie) {
					}
					System.out.println("DB thread done");
				
			}
		});
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				
					System.out.println("Printer Thread");
					try {
						Thread.sleep(1000);

					} catch (InterruptedException ie) {
					}

				System.out.println("Printer thread done");
			}
		});
		
		obj.m1(t1, t2, t3);
	
	}
	
}
