package multiThreadingExamples;

class ConsumerPrint implements Runnable{
	
	int startPoint;
	
	ConsumerPrint (int startPoint){
		this.startPoint=startPoint;
	}
	
	public void run(){
		
		
			while(true){
				synchronized(Test4.class){	
					if(Test4.turn==false){
						System.out.println(Thread.currentThread().getName()+ " " + "Consumed Contents in Thread" + " "+ Thread.currentThread().getId() + " " + startPoint);
							try{
							Thread.sleep(1000);
						    }
						    catch(Exception  e){
							System.out.println(e);
							}
					}
					Test4.turn=true;
				}
			}
		
		
		
		
		
	}

}