package com.java.reflections;

public class ClassForNameExample {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		System.out.println("Hello this is test");
		Class c = Class.forName("SimpleTest");
		System.out.println(c.getName());
		
		SimpleTest sampleObj = (SimpleTest)c.newInstance();
		sampleObj.method1();
	}

}


