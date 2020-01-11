package com.eclipse.programs.java;

public class OverLoading {
	int a;
	int b;
	int c;
	public void addition() {
		System.out.println("no parameter method");
	}
	public void addition(int a,int b) {
		c= a+b;
		System.out.println("2-parameter toal c "+c);
	}
	public int addition(int a,int b,int c) {
		
		System.out.println("3-parameter toal c "+c);
		return (a+b+c);
	}
	public static void main(String[] args) {
		OverLoading ol = new OverLoading();
		ol.addition();
		ol.addition(20, 20);
		int ret=ol.addition(10, 20, 30);
		System.out.println("return  "+ret);
	}

}
