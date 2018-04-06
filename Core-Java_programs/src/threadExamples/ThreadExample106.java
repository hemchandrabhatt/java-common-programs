package threadExamples;

public class ThreadExample106 extends Thread{
	
	public void run(){
		for(int i=1;i<10; i++){
			System.out.println("Child thread is running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		ThreadExample106 childThread = new ThreadExample106();
		childThread.start();
		for(int i=1;i<10; i++){
			System.out.println("main thread is running");
			
		}

	}

}
