package com.eclipse.programs.java;

import java.util.Date;

public class TimeDelay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println("first :"+new Date());
		long st=System.nanoTime();
		Thread.sleep(3000);
		System.out.println("second :"+new Date());
		long en=System.nanoTime();
		long en1=System.currentTimeMillis();
		System.out.println("en "+en);
		System.out.println("en1 "+en1);
		long diff=en-st;
		System.out.println("diff "+diff);
	}
		catch(Exception e) {
			System.out.println("Error");
		}

}
}