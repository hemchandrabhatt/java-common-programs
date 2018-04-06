package CommonPrograms;

public class GetAndSetMethodsMain {

	public static void main(String[] args) {
		GetAndSetMethodsExample obj = new GetAndSetMethodsExample();
		obj.setI(10);
		obj.setStr("Hem Chandra Bhatt");
		
		System.out.println(obj.getI());
		System.out.println(obj.getStr());
		
		Boolean b=new Boolean(true);
		Boolean b1=new Boolean("true");
		Boolean b2=new Boolean("True");
		Boolean b3=new Boolean(false);
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		

	}

}
