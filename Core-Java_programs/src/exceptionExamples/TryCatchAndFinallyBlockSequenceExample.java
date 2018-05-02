package exceptionExamples;

public class TryCatchAndFinallyBlockSequenceExample {

	public static void main(String[] args) throws NullPointerException {
		try{
			final A instance = new A( 10 );
	      //  B.updateA( instance, 20 );
	       //.out.println( instance.getField() )
		}
		
		finally{
			System.out.println("this is finally block");
		}
		

	}

}
class A
{
    private final int m_field;

    public A( final int field ) {
        m_field = field;
    }

	public char[] getField() {
		// TODO Auto-generated method stub
		return null;
	}
}