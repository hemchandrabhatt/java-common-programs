package arraryExamples;

public class test {
	int j=1;
	public void m(){
		//System.out.println("Static block");
		 final int i = 0;
		 int k;
		
		System.out.println(i);
	}

	public static final void main(String[] args) {
		// TODO Auto-generated method stub
		test t=new test();
		System.out.println("hem");
		t.m();
		t.j=9;
		System.out.println(t.j);
		
		String s="200";  
		int i=Integer.parseInt(s);  
		System.out.println(s+100);//200100 because + is string concatenation operator  
		System.out.println(i);//300 because + is binary plus operator  
	}

}
