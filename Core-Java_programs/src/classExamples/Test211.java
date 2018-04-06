package classExamples;

public class Test211 {

	public void m1(Long a){
		
		System.out.println("long : " + a);
		
	}
	/*public void m1(int a){
		System.out.println("int : " + a);
		
	}*/
	public void m1(Integer a){
		System.out.println("Integer : " + a);
		
	}
	
	public static void main(String[] args) {
		int i = 10;
		new Test211().m1(i);
		

	}

}
