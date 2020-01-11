package com.eclipse.programs.java;

class Parent{
	String name = "venky";
	public void display() {
		System.out.println("super method");
	}
}

public class SuperKeyExamp extends Parent{
	String name ="Hello";
	
	public void display() {
		System.out.println("child method");
		System.out.println("super var "+super.name);
		System.out.println("local var "+name);
	}
	public void disp() {
		super.display();
	}
	public static void main(String[] args) {
		SuperKeyExamp ske = new SuperKeyExamp();
		ske.display();
		ske.disp();
	}

}
