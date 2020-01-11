package com.eclipse.programs.java;

public class NonStaticMethod {
	int num = 5;

	NonStaticMethod() {
		System.out.println("inside the constructor");
		System.out.println(num);
	}

	{
		System.out.println("non-static block");
		System.out.println(num);
	}

	public static void main(String[] args) {
		int num = 6;
		System.out.println("main method");
		System.out.println(num);
		new NonStaticMethod();
	}

	static {
		System.out.println("static block");
		new NonStaticMethod();

	}

}
