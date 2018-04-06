package Constructor;

public class ConstructorInheritanceBaseClass {
	int a=10;
	ConstructorInheritanceBaseClass(){
		System.out.println("This is parent class Defalault construcor");
	}
	ConstructorInheritanceBaseClass(int a){
		this.a=a;
		System.out.println(a);
	}

}
