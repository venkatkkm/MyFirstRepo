package com.eclipse.programs.nonStaticMembers;

public class Demo {

	static Demo obj;
	static {
		System.out.println("static block " + Demo.obj);
		Demo.obj = new Demo();
		System.out.println("static block after " + Demo.obj);
		//Demo.hello();
	}

	public static void main(String[] args) {
		System.out.println("main");
		Demo.hello();
	}

	public static void hello() {
		Demo.obj = new Demo();
		System.out.println("user defined static method");
	}

}
