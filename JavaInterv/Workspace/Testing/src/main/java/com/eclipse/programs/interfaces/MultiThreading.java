package com.eclipse.programs.interfaces;

public class MultiThreading extends Thread{
	int a = 200;

	public static void main(String[] args) throws InterruptedException {
		
		MultiThreading mt = new MultiThreading();
		mt.run();
		mt.setPriority(9);;
		for (int i = 1; i <= mt.a; i++) {
			System.out.println("main for " + i);
			Thread.sleep(1000);
		}
	}

	public void run(){
		for (int i = 1; i <= a; i++) {
			System.out.println("run for  "+i );
			try{
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("sleeping prbm");
			}
		}
	}
}
