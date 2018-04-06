package finalkeyword;

public class FinalKeyword {

	int speedlimit=90;//final variable  
             // x = 20;
	public void method() {
		speedlimit=400;  
		System.out.println(speedlimit);
	}

	public static void main(String[] args) {

		FinalKeyword obj = new FinalKeyword();
		obj.method();

	}
}
