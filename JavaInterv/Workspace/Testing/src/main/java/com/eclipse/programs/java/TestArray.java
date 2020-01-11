package com.eclipse.programs.java;

public class TestArray {

	public static void main(String[] args) {
		String[] names = {"ram","shyam","sundar","hello"};
		double[] num = {3.5,3.4,5.6,7.8,9.0};
		for(String x : names) {
			System.out.println("printing using enhanced for loop " + x);
		}
		for(int i=0; i<names.length ;i++) {
			System.out.println("i "+i);
			System.out.println("for loop " + names[i]);
		}
		double sum = 0;
		for(int i=0; i<num.length ;i++) {
			sum = sum+num[i];
			//System.out.println("sum  " +sum);
		}
		System.out.println("sum  " +sum);
		
		double max = num[0];
	for(int j=0; j<=num.length-1;j++) {
		if(num[j]> max) {
			max = num[j];
		}
	}
	System.out.println("max "+ max);
	{
		System.out.println("non-static");
	}
}
	static {
		System.out.println("static");
	}
	
}
