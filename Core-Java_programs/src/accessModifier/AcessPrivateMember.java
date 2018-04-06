package accessModifier;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AcessPrivateMember {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		A 	obj = new A();
		obj.setM(10);
		int k =obj.getM();
		System.out.println(k);
		
        Class<?> c = obj.getClass();
		Method m = c.getDeclaredMethod("privateMethod",null);
		m.setAccessible(true);
		m.invoke(obj, null);
	}
}

class A{
	private int m;
	private int n;
	
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	private void privateMethod(){
		int a;
		
		System.out.println("This is private mothod in class A");
	}
	
}

