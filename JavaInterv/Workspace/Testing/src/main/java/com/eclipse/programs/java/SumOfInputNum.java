package com.eclipse.programs.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfInputNum {

	public static void main(String[] args) {
		System.out.println("plz enter two numbers");
		try {
		Scanner sc = new Scanner(System.in);
		//int num1 = Integer.parseInt(sc.next());
		int num1 = Integer.parseInt(sc.nextLine());
		int num2 = Integer.parseInt(sc.next());
		/*int num1 = sc.nextInt();
		int num2 = sc.nextInt();
*/		
		int res = num1 + num2;
		System.out.println("result "+res);
		}
		catch(InputMismatchException e) {
			System.out.println("only integers are allowed");
		}
	}

}
