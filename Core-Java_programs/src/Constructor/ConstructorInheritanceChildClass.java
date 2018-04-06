package Constructor;

public class ConstructorInheritanceChildClass extends ConstructorInheritanceBaseClass {
	int a,x, b;
	ConstructorInheritanceChildClass(){
		System.out.println("This is child class default construcor");
	}
	ConstructorInheritanceChildClass(int a, int b){
		super.a=a;
		System.out.println(a);
		this.b=b;
		System.out.println(b);
	}
	
}
