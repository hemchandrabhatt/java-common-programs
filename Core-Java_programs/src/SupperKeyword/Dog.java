package SupperKeyword;

public class Dog extends Animal{
	String color ="Black";
	
	public void displayColor(){
		System.out.println(color);
		System.out.println(super.color);
		super.displayColor();
		super.displayColor1();
		
	}
	Dog(){
		super();
		System.out.println("this is example for construc thro super keyword.");
	}
}
