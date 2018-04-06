package jvmExamples;

public class findJVMMemory {

	public static void main(String[] args) {


		Runtime rt =Runtime.getRuntime();
		long i=rt.maxMemory();
		long z =i/(1024*1024);
		long j=rt.freeMemory();
		int k= rt.availableProcessors();
		long m = rt.totalMemory();
		System.out.println(z);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
		
		 
		
		
		

	}

}
