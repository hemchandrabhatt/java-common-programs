package arraryExamples;

public class ReverseArray extends B {

	public static void main(String[] args) {
		ReverseArray obj = new ReverseArray();
		// obj.m1();
		B.m1();
		obj.m2();
		

		System.out.println("---------------------");
		int[] arr = new int[] { 12, 34, 10, 67, 87 };
		try {
			for (int i = arr.length - 1; i < arr.length; i--) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("rest of line code");
	}

}

abstract class B {
	
	static void m1() {
		System.out.println("abstract class");
		final class C {
			void m4() {
				System.out.println("final class and moethod");
			}
		}
		
		C o = new C();
		o.m4();
	}

	void m2() {
		System.out
				.println("non static method inside the class abstact class B");
	}
}