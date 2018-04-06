package stringExample;

public class StringPallendrom {
	
	public static String strip(String s) {
	    return s.toLowerCase().replaceAll("[^a-z]", "");
	  }

	  public static boolean isPalindrome(String s) {
	    for (int i = 0; i < s.length() / 2; i++) {
	      if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
	        return false;
	      }
	    }

	    return true;
	  }

	  public static void main(String[] args) {
	    System.out.println(strip("Eva, can I see bees in a cave?"));
	    System.out.println(isPalindrome(strip("Eva, can I see bees in a cave?")));
	  }

}
