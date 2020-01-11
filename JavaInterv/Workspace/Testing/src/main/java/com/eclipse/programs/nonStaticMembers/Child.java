package com.eclipse.programs.nonStaticMembers;

public class Child extends Parent {
	int c, d,a,b;

	Child(int e, int f, int c, int d) {
		super(e, f);
		System.out.println("child constructor");
		/*this.a = a;
		this.b = b;*/
		this.c = c;
		this.d = d;		
		super.e =e;
		super.f = f;
		System.out.println("a :"+this.a);
		System.out.println("b :"+this.b);
		System.out.println("e :"+e);
		System.out.println("f :"+f);
		System.out.println("c :"+c);
		System.out.println("d :"+d);
	}
	void display(){
		System.out.println("dis a :"+super.e);
	}

	void m1() {
		super.m1();
		System.out.println("child method m1()");
	}

}
