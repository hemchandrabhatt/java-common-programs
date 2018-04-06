package collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExampleUserdefinedClassMain {

	public static void main(String[] args) {
		
		System.out.println("hhhh");
		
		ArrayListExampleUserdefinedClass obj1=new ArrayListExampleUserdefinedClass(101,"Hem",30);
		ArrayListExampleUserdefinedClass obj2=new ArrayListExampleUserdefinedClass(102,"Chandra",31);
		ArrayListExampleUserdefinedClass obj3=new ArrayListExampleUserdefinedClass(103,"Bhatt",32);
		
		ArrayList<ArrayListExampleUserdefinedClass> al=new ArrayList<ArrayListExampleUserdefinedClass>();
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			ArrayListExampleUserdefinedClass st=(ArrayListExampleUserdefinedClass)itr.next();
			System.out.println(st.rollNo +" "+st.name +" "+ st.age);
		}

	}

}
