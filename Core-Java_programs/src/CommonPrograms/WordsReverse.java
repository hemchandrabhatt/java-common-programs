package CommonPrograms;

public class WordsReverse {

	public static void main(String[] args) {
		String str = new String("Hem Chandra Bhatt");
		reverse(str);

	}

	private static void reverse(String str) {
		String[] temp =str.split(" ");
		//System.out.println(temp);
		for(int i=temp.length-1 ;i<temp.length; i--){
			System.out.println(temp[i]);
		}
		
		str.equalsIgnoreCase(str);
		System.out.println();
	}

}
