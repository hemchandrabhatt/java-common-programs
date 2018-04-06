package multiThreadingExamples;


public class ProduceAndConsumeTest {
	
	public static Integer holder;
	public static Object object = new Object();

	//public static boolean turn = true;
	//public static int threadnumber = 100;
	
	public static void  main(String[] args){
		
		
		//System.out.println("hhhhhh");
		
		ProduceContent producePringObj = new ProduceContent();
		//ProduceContent producePringObj = new ProduceContent(1);
		ConsumeContents consumerPringObj = new ConsumeContents();
		
		
		
		final Thread produceThread = new Thread(producePringObj);
		final Thread consumerThread = new Thread(consumerPringObj);
		
		
			produceThread.start();
			
			//produceThread.join();
			
			consumerThread.start();
		
		
		
		
	}

}