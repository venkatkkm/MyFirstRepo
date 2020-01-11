package com.eclipse.programs.interfaces;

public class RunnableImpl extends Honda implements Runnable{

	public static void main(String[] args) {

		System.out.println("main");
		Runnable t = new RunnableImpl();
		//t.run();
		Thread t1 = new Thread(t);
		t1.start();
		//t1.run();
		for(int i=0;i<5;i++) {
			System.out.println("main thread "+i);
		}
		
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("thread "+i);
		}
	}

}
