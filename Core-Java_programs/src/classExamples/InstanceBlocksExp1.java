package classExamples;



public class InstanceBlocksExp1 {
	
	int speed; 
	
	{
		speed=100;
		System.out.println(speed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceBlocksExp1 obj = new InstanceBlocksExp1();
		

	}

}
