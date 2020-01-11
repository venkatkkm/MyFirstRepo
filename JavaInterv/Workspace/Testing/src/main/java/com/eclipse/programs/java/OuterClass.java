package com.eclipse.programs.java;

import java.util.ArrayList;

public class OuterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonyCls anc = new AnonyCls() {
		//ArrayList<String> hi = new ArrayList();
		public void disp() {
			System.out.println("anonymous example");
		}
	};
anc.disp();
}
}
 abstract class AnonyCls{
	public abstract void disp();
}
