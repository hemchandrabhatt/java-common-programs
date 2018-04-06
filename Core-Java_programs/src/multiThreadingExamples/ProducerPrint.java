package multiThreadingExamples;

class ProducerPrint implements Runnable{
	
int startPoint;
	
ProducerPrint (int startPoint){
		this.startPoint=startPoint;
	}


	public void run(){
	
		
				while(true){
				synchronized(Test4.class){
					if(Test4.turn==true){
						    System.out.println(Thread.currentThread().getName()+ " " + "Produces Contents in Thread" + " "+ Thread.currentThread().getId() + " " + startPoint );
						    try{
							Thread.sleep(1000);
						    }
						    catch(Exception  e){
							System.out.println(e);
							}
					}
					
					Test4.turn=false;
				}
			}
		
	
		
	}	
}

