package exceptionExamples;

import java.io.IOException;

public class ExeptionExample {
	static int no;
	final int panCardNo;
	ExeptionExample(int panCardNo){
		this.panCardNo=panCardNo;
	}
	
	public void dispayPancardNo(){
		System.out.println("Your pan card no is:" +panCardNo);
	}

	public static void main(String[] args) {
		ExeptionExample obj= new ExeptionExample(1001);
		obj.dispayPancardNo();
		System.out.println(ExeptionExample.no);
		
		try{
			System.out.println("Exception is haldedled");
			throw new IOException();
		}catch(IOException ie){
			System.out.println("this sub class expetion");
		}catch(Exception e){
			System.out.println("Supper Class Exception");
		}
		
		

	}

}
