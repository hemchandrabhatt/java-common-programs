package exceptionExamples;

import java.io.EOFException;

import javax.imageio.IIOException;

public class CommonExceptionExample1 {

	public static void main(String[] args) throws Exception {

		try {
			int data = 50 / 0;
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch(Exception e){System.out.println(e);}finally {
			System.out.println("ret of code is excuted");
		}
		testMethod();
	}
	
	public static  void testMethod() throws Exception{
		try{
			throw new Exception();
		}finally{
			System.out.println("rest of code after throw keywords");
		}
		
	}
	
	public static void m1(){
		
		System.out.println("hhhhh");
		int data=10/0;
		
	}
	public static void m2(){
		m1();
	}
	public static void m3(){
		try{
			m2();
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	

}

