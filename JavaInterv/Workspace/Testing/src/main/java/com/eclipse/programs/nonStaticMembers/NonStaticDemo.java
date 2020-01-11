package com.eclipse.programs.nonStaticMembers;

public class NonStaticDemo {

	int num;

	NonStaticDemo() {
		System.out.println("constructor");
	}

	{
		System.out.println("non static block");
	}

	public void hi() {
		System.out.println("non static method");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		new NonStaticDemo();
		NonStaticDemo nsd = new NonStaticDemo();
		System.out.println("new " + new NonStaticDemo());
		System.out.println("non static variable " + nsd.num);
		nsd.hi();
	}

	static {
		System.out.println("static block");
	}
}
