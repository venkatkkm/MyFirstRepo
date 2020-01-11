package com.eclipse.programs.java;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("hello world==static method");
	}

	static {
		System.out.println("static block1");
	}
	static {
		System.out.println("static block2");
	}
}
