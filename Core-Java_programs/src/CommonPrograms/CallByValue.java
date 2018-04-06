package CommonPrograms;

public class CallByValue {
	int data =50;
	
	public int   fuc(int data){
		data = data +100;
		return data;
	}

	public static void main(String[] args) {

		CallByValue obj = new CallByValue();
		int k = obj.data;
		System.out.println(k);
		obj.fuc(500);
		System.out.println(obj.data);
		
		

	}

}
