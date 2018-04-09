package exceptionExamples;

import java.io.IOException;

public class CallingChainCheckedExceptionExample {
	void m(){  
	    try {
			throw new java.io.IOException("device error");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//checked exception  
	  }  
	  void n(){  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handeled");}  
	  }  
	  public static void main(String args[]){  
		  CallingChainCheckedExceptionExample obj=new CallingChainCheckedExceptionExample();  
	   obj.p();  
	   System.out.println("normal flow");  
	  }  

}
