package javaCodeExamples;

public class FirstExample {

	public static void m1() {

		String str = "hem chandra bhatt";
		// javax.swing.text.DefaultHighlighter.DefaultHighlightPainter painter =
		// new DefaultHighlighter.DefaultHighlightPainter(Color.pink);
		String[] words = str.split("\\s+");
		for (int i = 0; i < words.length; i++) {
			// You may want to check for a non-word character before blindly
			// performing a replacement
			// It may also be necessary to adjust the character class
			words[i] = words[i].replaceAll("[^\\w]", "");
			System.out.print(words[i] + "-");

		}
		   System.out.println();
			String str1 = words[1];
		    System.out.println(str1);
		    

	}

	public static void main(String[] args) {

		m1();
		System.out.println(10*10/5+3-1*4/2);
		String str122 = "test123 test124 test125";
		String output = str122.replaceAll("\\s+","");
		System.out.println(output);
		

	}

}
