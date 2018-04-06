package CommonPrograms;

public class SupperKeyword{

	public static void main(String[] args) {
		try{
			throw new Exception();
		}catch(Exception e){
			System.out.println(e);
			}
		finally{
			System.out.println("this is fianlly block");
		}
		
		System.out.println("after finally block");

	}

}
