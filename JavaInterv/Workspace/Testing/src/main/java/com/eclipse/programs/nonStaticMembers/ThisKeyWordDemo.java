package com.eclipse.programs.nonStaticMembers;

public class ThisKeyWordDemo {
	int num;
	String name;

	ThisKeyWordDemo() {
		System.out.println(this.num);
		System.out.println(this);
	}

	public static void main(String[] args) {
		System.out.println("main");
		new ThisKeyWordDemo();
		ThisKeyWordDemo th = new ThisKeyWordDemo();
		th.mul();
	}

	public void mul() {
		System.out.println("non-static method");
	}

}
