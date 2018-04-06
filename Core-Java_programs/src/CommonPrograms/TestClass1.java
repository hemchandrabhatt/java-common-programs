package CommonPrograms;

 abstract class A implements Runnable{
 
	
}

public class TestClass1 extends A{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //int i = --9;
		// i=  ! i;
		//fianl int i =1; 
		TestClass1 obj =new TestClass1();
		Thread t1 =new Thread(obj);
		Thread t2 =new Thread(obj);
		//Thread.yield();
		t1.start();
		
		t2.start();
		
		//obj.method();
		
		 
		 

	}

	@Override
	public void run() {
		synchronized(this){
		for( int i=0;i<5; i++){
			  System.out.println(i);
			  try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		  }
		
		
	}

}
