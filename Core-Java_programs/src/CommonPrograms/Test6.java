package CommonPrograms;

public class Test6 {

	public static void main(String[] args) {
		try{
			throw new Exception();
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	finally{
		System.out.println("kkk");
	}

		System.out.println("test of code");
	}

}
