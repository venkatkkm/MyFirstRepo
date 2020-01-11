package com.eclipse.programs.nonStaticMembers;

public class Jdk7 extends Jdk6 {
	Jdk7(){
		System.out.println("java version 7");
		System.out.println(this);
	}
}
