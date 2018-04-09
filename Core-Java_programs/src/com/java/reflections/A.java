package com.java.reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Private{
	private void m(){
	System.out.println("this is private method");
}
}
// how to call private method in java
public class A{
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Private obj = new Private();
		Class<?> cls = obj.getClass();
		Method method = cls.getDeclaredMethod("m");
	      method.setAccessible(true);
	      System.out.println(method.invoke(obj));
	}
}