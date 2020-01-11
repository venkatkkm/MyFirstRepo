package com.eclipse.programs.java;

public class PassingPrameters {

	public static void main(String[] args) {
		int number1 = 22;
		int number2 = 11;
		System.out.println("main method");
		System.out.println("Before swapping " + number1+", "+number2);
		parameter(number1,number2);
		//hi = new int[];
		int[] hello = new int[5];
		int[] array1 = {1,2,3,4,5};
		System.out.println("size "+ hello.length);
		System.out.println("array1 "+ array1);
	}
	public static void parameter(int num1,int num2) {
		int num3 = num1 + num2;
		int num4;
		num4 = num1;
		num1 = num2;
		num2 = num4;
		System.out.println("parameters method " +num3);
		System.out.println("after swapping " + num1+", "+num2);
	}
}
