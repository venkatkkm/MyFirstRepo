package com.eclipse.programs.java;

public class ObjectReferenceDemo {
	int x;
	static ObjectReferenceDemo obj;
	/*
	 * ObjectReferenceDemo() { System.out.println("constructor"); }
	 */

	public static void main(String[] args) {
		ObjectReferenceDemo ord = new ObjectReferenceDemo();
		System.out.println(ord.x);
		System.out.println(ord);
		System.out.println(obj);
		obj = new ObjectReferenceDemo();
		System.out.println(obj.x);
		System.out.println(ObjectReferenceDemo.obj);
	}

	static {
		ObjectReferenceDemo ORD = new ObjectReferenceDemo();
		System.out.println(ORD);
		System.out.println(ObjectReferenceDemo.obj);
	}

}
