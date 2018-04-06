package CommonPrograms;

public class CommanTest extends Thread{
	
	public void run(){
		System.out.println("hemmm");
		System.out.println("bhatt");
	}
	
	public static void main(String[] args) throws InterruptedException {
		CommanTest obj = new CommanTest();
		CommanTest obj1 = new CommanTest();
		obj.start();
		Thread.sleep(1000);
		obj1.start();
		

	}

}
