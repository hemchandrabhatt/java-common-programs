package CommonPrograms;

public class AccessMothdsThroParentAndChildObject {

	public static void main(String[] args) {
		
		ClassBParent parentObject= new ClassBParent();
		ClassChild childObject = new ClassChild();
		ClassBParent childObjTypeparent = new ClassChild(); 
		ClassBParent childObjParentType = (ClassBParent) childObject;
		//ClassChild oparentObjChildType = (ClassChild)parentObject;
		
		if (parentObject instanceof ClassChild) {
			ClassChild obj = (ClassChild) childObject;
            obj.method();
        }
		
		//ClassChild parentObjchildType = new ClassBParent(); 
		//ClassBParent childObjTypeparent = new ClassChild(); 
		//ClassChild parentObjchildType = (ClassBParent())(childObject); 
		
		parentObject.method();
		childObject.method();
		childObjTypeparent.method();
		childObjParentType.method();
		//oparentObjChildType.method();
		//AbstractClassExample abc =new AbstractClassExample();
		
		ClassBParent obj1 = new ClassChild();
		ClassChild obj2 = (ClassChild)obj1;
		
		System.out.println("-----------");
		obj2.method();
		
		System.out.println("--------------");
		String str = new String("Hello World. how you doing?");
		//str.g
	}

}

class ClassChild extends ClassBParent{
	public void method(){
		System.out.println("This si child method.");
	}
}

 class ClassBParent {
	 public void concreateMethod() {
		 System.out.println("hello");
	}
	public void method(){
		System.out.println("This si parent method.");
	}
}
 abstract class AbstractClassExample {
	 int i;
	 public void concreateMethod(){
			System.out.println("This si abstract class method.");
		}
 }
