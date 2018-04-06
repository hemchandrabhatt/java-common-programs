package sychronizedExamples;

public class Display{
	
	public  void wish(String name){
	
	synchronized(SynchronizedDemo.class){
	for(int i=0;i<10;i++){
		System.out.print("Good Morning: ");
		try{
			Thread.sleep(200);
		}catch(InterruptedException e){
			
		}
		System.out.println(name);
	}
	}
		
	}

}