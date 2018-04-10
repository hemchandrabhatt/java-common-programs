package CommonPrograms;


public class TestingPurpose {
	
	public static void main(String[] args) {
		String s1=new String("Hem");
		String s2=new String("Hem");
		if(s1==s2){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Integer i = new Integer(10);
		Integer i1=20;
		System.out.println(i1=i);
		
		StringBuffer sb1= new StringBuffer("Hem");
		StringBuffer sb2= new StringBuffer("Hem");
		
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		String s3= new String("Hem");
		String s5="Hem chandra";
		String s4= new String(s1);
		System.out.println(s4);
		
		StringBuffer sb3= new StringBuffer("Hema");
		//sb3="Hemmchandra";
		//Math.pow(a, b)

		
		
	}
	

}
