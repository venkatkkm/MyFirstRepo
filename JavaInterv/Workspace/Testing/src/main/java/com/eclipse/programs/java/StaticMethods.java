package com.eclipse.programs.java;

public  class StaticMethods extends Thread{

	public static void main(String[] args) {
		//System.out.println("main method");
		//StaticMethods.staticMethod1();
		System.out.println("main method2");
		StaticMethods t = new StaticMethods();
		t.start();
		//t.run();
		System.out.println("main method");
		//t.run();
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("thread "+i);
		}
	}

	/*static void staticMethod1() {

		System.out.println("staticmethod1");
		}

	static {
		System.out.println("staticm2");
		StaticMethods.staticMethod1();
	}
	static class Hi{
		void h() {
System.out.println("hi inner");
		}

	}*/
}
