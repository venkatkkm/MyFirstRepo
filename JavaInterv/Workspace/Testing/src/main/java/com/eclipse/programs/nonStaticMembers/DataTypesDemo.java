package com.eclipse.programs.nonStaticMembers;

public class DataTypesDemo {

	byte b = 10;
	short sh = 20;
	long ln = 100;
	int in = 200;
	float f = 1.99f;
	double db = 2d;

	public static void main(String[] args) {
		System.out.println("main method");
		new DataTypesDemo().hello();
	}

	public void hello() {
		System.out.println(this.f);
		System.out.println(this.db);
	}

}
