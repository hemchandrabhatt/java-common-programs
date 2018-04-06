package multiThreadingExamples;

public class ThreadA {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		System.out.println(b.total);
	}
}

class ThreadB extends Thread{
	int total=0;
	public void run(){
		for(int i=1;i<=100;i++){
			total=total+i;
		}
	}
}
