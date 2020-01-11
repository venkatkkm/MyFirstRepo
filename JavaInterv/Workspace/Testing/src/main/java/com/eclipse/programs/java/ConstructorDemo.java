package com.eclipse.programs.java;

public class ConstructorDemo {
	
	int x;
	ConstructorDemo(){
		x=10;
	}

	public static void main(String[] args) {
		ConstructorDemo c1 = new ConstructorDemo();
		ConstructorDemo c2 = new ConstructorDemo();
		System.out.println("sum " + (c1.x+c2.x));
		System.out.println(c1.x+ "+ " +c2.x);
	}

}
