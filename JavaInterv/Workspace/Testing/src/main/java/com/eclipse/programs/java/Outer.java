package com.eclipse.programs.java;

 /*class Inners{
	private class Inner{
		private void print() {
			System.out.println("inner classes");
		}
	}
	public void outer() {
		System.out.println("outer method");
		Inner in=new Inner();
		in.print();
	}
}
public class Outer{
public static void main(String[] args) {
		Inners ins=new Inners();
		ins.outer();
	}
}*/

public class Outer{
	int num=10;
	public void demo() {
		  class InnerDemo{
			 public void display() {
			System.out.println("Inner");
			 }
		}
	}
public static void main(String[] args) {
	System.out.println("hi");
		
	}
}