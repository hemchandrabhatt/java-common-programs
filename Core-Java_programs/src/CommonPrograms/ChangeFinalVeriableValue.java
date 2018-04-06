package CommonPrograms;

public class ChangeFinalVeriableValue {

	public static void main(String[] args) 
	{

		ChangeFinalVeriableValue obj = new ChangeFinalVeriableValue();
		int k=obj.chnageValue(20098);
		
		System.out.println(k);
		
		
		

	}

	private int chnageValue(final int i) {
		// TODO Auto-generated method stub
		
	
		final int x =i;
		int j=200;
		int k = x+j;

		return k;
	}
	

}

class ba {
	
	

	
}
