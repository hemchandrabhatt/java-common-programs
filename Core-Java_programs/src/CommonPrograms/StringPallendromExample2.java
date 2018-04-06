package CommonPrograms;

public class StringPallendromExample2 {

	public static boolean StringPallendromExample(String str) {

		for (int i = 0; i <= str.length()/2 ; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		//Boolean result = StringPallendromExample("abcbaqq");
		if (StringPallendromExample("abcbaqq")) {
			System.out.println("Panllendrom");
		} else
			System.out.println("NOT panellendrom");

	}

}
