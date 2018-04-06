package CommonPrograms;

public class Example101 {
	
	final void m1(){
		final int a = 0;
		System.out.println("jjj");
		System.out.println(a);
	}
	
	public void m2(int a){
		a=a;
		System.out.println(a);
	}

	public static void main(String[] args) {
		Example101 obj =new Example101();
		obj.m1();
		obj.m2(10);
		

	}

}
