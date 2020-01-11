package com.eclipse.programs.java;

public class ThisExample {
	int x;
	ThisExample(){
		System.out.println("no parameter constructor");
	}
	ThisExample(int x){
		this();
		this.x=x;
		System.out.println("parameter constructor");
		System.out.println(x);
	}
	public void greet() {
		System.out.println("hello");
	}
	public void print() {
		int num=20;
		System.out.println(num);
		this.greet();
		System.out.println(this.x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisExample e1 = new ThisExample();
		ThisExample e2 = new ThisExample(10);
		e1.print();
		e2.print();
	}

}
