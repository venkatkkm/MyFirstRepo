package com.eclipse.programs.io;
import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder(s);
		//sb.append(s.charAt(i));
		System.out.println("after revers :"+sb.reverse().toString());
		
/*System.out.println("Enter string to reverse:");
		
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println("Reversed string is:");
		System.out.println(sb.reverse().toString());
*/	}

}
