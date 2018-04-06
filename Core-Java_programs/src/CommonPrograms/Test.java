package CommonPrograms;

public class Test {
	
	String str = "Test";
	int i = 100;
	
	protected void finalize(){
		System.out.println("Hello " + this.hashCode());
	}

	public static void main(String[] args) {
		while(true){
			new Test();
			System.out.println(Runtime.getRuntime().freeMemory());
		}

	}

}
