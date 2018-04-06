package sychronizedExamples;

public class SynchronizedDemo {
	
	public static void main(String[] args) {
		Display d= new Display();
		MyThread t1=new MyThread(d, "Doni");
		MyThread t2=new MyThread(d, "Yuvraj");
		t1.start();
		t2.start();
	}

}
