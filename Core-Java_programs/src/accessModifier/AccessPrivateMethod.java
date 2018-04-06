package accessModifier;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AccessPrivateMethod {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		/*Class c= Class.forName("ClassA");
		Object o= c.newInstance();*/
		ClassA obj = new ClassA();
		Class<?> c =obj.getClass();
		Method m = c.getDeclaredMethod("methodPrivate", null);
		m.setAccessible(true);
		m.invoke(obj, null);

	}

}
