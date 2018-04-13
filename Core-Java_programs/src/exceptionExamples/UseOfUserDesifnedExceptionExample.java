package exceptionExamples;

public class UseOfUserDesifnedExceptionExample {
	public static void validateage(int age) throws UserDefinedExceptionClass{
		if(age>25){
			throw new UserDefinedExceptionClass("Invalid age");
		}else if(age<25){
			throw new UserDefinedExceptionClass("Valid age");
		}
		
		
	}
	public static void main(String[] args) {
		
		try {
			validateage(13);
			
		} catch (UserDefinedExceptionClass e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try{
			invalidNamformat("Hem Chandra Bhatt");
		}catch (UserDeifnedUncheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void invalidNamformat(String str) throws UserDeifnedUncheckedException{
		if(str.equals("Hem Chandra Bhatt")){
			throw new UserDeifnedUncheckedException("Valid name");
		}else{
			throw new UserDeifnedUncheckedException("INValid name");
		}
	}

}



class UserDeifnedUncheckedException extends RuntimeException{
	
	UserDeifnedUncheckedException(String s){
		super(s);
	}
}
