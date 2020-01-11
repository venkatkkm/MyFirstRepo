package com.eclipse.programs.java;

public class NumberClass {

	public static void main(String[] args) {
		Integer x= 10;
		Double d = 9.87;
		Float f =1.23f;
		boolean b = false;
		String n= "venkat";
		System.out.println(x);
		System.out.println(x.doubleValue());
		System.out.println(x.toString());
		System.out.println(Integer.parseInt("20",16));
		System.out.println(Integer.valueOf("geeks",29));
		String s= String.valueOf(b);
		String s1 = Boolean.toString(b);
		System.out.println("string "+s);
		System.out.println("string "+s1);
		int a = 2;
		int c = 5;
		//a+c;
		System.out.println("mul "+(a*c)+"\na :"+a+"\nc :"+c);
		int[] arr = {1,2,3,4,5,6};
		System.out.println("array :"+arr);
		//System.out.println("reverse "+n.getBytes());
		String s2 = new String ("venkkk");
		// System.out.println("revvv :"+s2.revesre);
	}

}
