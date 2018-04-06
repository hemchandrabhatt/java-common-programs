package exceptionExamples;

public class ExceptionExampleTryCatch {

	public static void main(String[] args) {

		try {
			int i = 50 / 0;
			System.out.println(i);

		} catch (Exception e) {

			//System.out.println(e);
			printstacktrace(e);
			System.out.println("after catch block1");

		}

		finally {

			System.out.println("after finally  block1");

		}

		try {
			int i = 50 / 0;
			System.out.println(i);

		} catch (Exception e) {

			//System.out.println(e);
			printstacktrace(e);
			System.out.println("after catch bloc2k");

		}

	}

	private static void printstacktrace(Exception e) {
		// TODO Auto-generated method stub
		
	}
}
