package com.eclipse.programs.java;

class Calc{
	int c;
	public void add(int a,int b) {
		c=a+b;
		System.out.println("add "+c);	
	}
	public void sub(int a,int b) {
		c=a-b;
		System.out.println("sub "+c);	
	}
	
}
/*public class ExtendExamp extends Calc {
	
	public static void main(String[] args) {
		ExtendExamp cal = new ExtendExamp();
		int a =10;
		int b = 20;
		cal.add(a, b);
		cal.sub(a, b);
		cal.mult(a, b);
	}
	public void mult(int a,int b) {
		c= a*b;
		System.out.println("mult "+c);
	}

}*/

public class ExtendExamp{
	public static void main(String[] reddy) {
		Calc cal = new Calc();
		int a =10;
		int b = 20;
		cal.add(a, b);
		cal.sub(a, b);
		cal.c=a*b;
		System.out.println("mult "+cal.c);
	}
	/*public void mult(int a,int b) {
		cal.c= a*b;
		System.out.println("mult "+c);
	}*/
}
