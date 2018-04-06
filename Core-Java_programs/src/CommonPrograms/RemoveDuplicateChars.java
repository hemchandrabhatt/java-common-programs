package CommonPrograms;

public class RemoveDuplicateChars {
	
	public static void main(String[] args) {
		  char c[]={'a','b','g','c','d','e','a','f','c','g'};
		  RemoveDuplicateChars obj = new RemoveDuplicateChars();
		  obj.method1(c);
		 }
		 
		 public void method1(char a[]) {
		  String s=new String(a);
		  String temp="";
		  for(int i=0;i<s.length();i++) {
		   String s1=s.substring(i, i+1);
		   if(temp.contains(s1)) {
		    continue;
		   } else {
		    temp+=s1;
		   }
		  }
		  System.out.println(temp);
		 }
}
