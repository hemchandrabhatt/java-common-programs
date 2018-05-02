package garbageCollectionExamples;

public class FinallizeExample {
	static{
		System.out.println("hhh");
	}

	public static void main(String[] args) {
		
		FinallizeExample obj = new FinallizeExample();
		System.out.println(obj.hashCode());
		try {
			obj=null;
			obj.finalize();
			System.out.println(obj.hashCode());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
