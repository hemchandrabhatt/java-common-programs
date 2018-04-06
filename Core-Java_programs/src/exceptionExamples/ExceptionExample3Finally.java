package exceptionExamples;

import java.io.IOException;

public class ExceptionExample3Finally {
	

	 public static void m() throws Exception
		{
		 	throw new IOException("ecception 1");	
		 	
			//System.out.println("hhh");
		}

	 
	public static void main(String[] args) throws Exception {
		m();
		
		try{  
			   int data=25/0;  
			   System.out.println(data);  
			  }  
			  catch(ArithmeticException e){System.out.println(e);}  
			  finally{System.out.println("finally block is always executed");} 
		
			  System.out.println("rest of the code...");  
			  
			  try{  
				   int data=25/0;  
				   System.out.println(data);  
				  }  
				  catch(ArithmeticException e){System.out.println(e);}  
				  finally{System.out.println("finally block is always executed");} 
			
				  System.out.println("rest of the code...");  
				  
				  

	}

}
