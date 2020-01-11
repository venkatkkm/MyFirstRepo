package com.eclipse.programs.nonStaticMembers;

public class WrapperClassesDemo {
	int x;

	public static void main(String[] args) {
		WrapperClassesDemo wrapper = new WrapperClassesDemo();
		wrapper.x = 100;
		Integer obj = Integer.valueOf(wrapper.x);
		int d = obj.intValue();// conversion of primitive to object
		System.out.println("d " + d);
		System.out.println("int " + wrapper.x);
		System.out.println("object " + obj);
		// primitive to string and vice-versa
		int y = 1234;
		String s = Integer.toString(y);
		System.out.println("prime to str " + s);
		int yz = Integer.parseInt(s);
		System.out.println("string to primi" + yz);
		// object to string vice
		int a = 10;
		Integer z = new Integer(a);
		System.out.println("using new keyword " + z);
		Integer n = Integer.valueOf(a);
		String b = n.toString();
		System.out.println("b " + b);
		System.out.println("n " + n);
		Integer g = Integer.valueOf(b);
		// using constructors
		long c = 1000;
		Long l = new Long(c);
		String f = "1000";
		Integer in = new Integer(f);
		//ternary
		int i=20; int j=30;
		String res =(i>j)?"big":"less" ;
		System.out.println("res "+res);
	}

}
