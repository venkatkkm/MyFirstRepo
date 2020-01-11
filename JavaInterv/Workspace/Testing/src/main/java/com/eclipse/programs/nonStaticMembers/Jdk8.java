package com.eclipse.programs.nonStaticMembers;

public class Jdk8 extends Jdk7 {
	Jdk8(){
		System.out.println("java version 8");
		System.out.println(this);
	}
	public static void main(String[] args) {
		Jdk8 j8 = new Jdk8();
	}
	//multi-level inheritance example
}
