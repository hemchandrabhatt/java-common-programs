package multiThreadingExamples;

public class Test4 {

	public static boolean turn = true;
	public static int threadnumber = 100;
	
	public static void  main(String[] args){
		
		
		//System.out.println("hhhhhh");
		
		ProducerPrint producePringObj = new ProducerPrint(0);
		ConsumerPrint consumerPringObj = new ConsumerPrint(1);
		
		
		
		final Thread produceThread = new Thread(producePringObj);
		final Thread consumerThread = new Thread(consumerPringObj);
		
		
			produceThread.start();
			
			//produceThread.join();
			
			consumerThread.start();
		
		
		
		
	}

}