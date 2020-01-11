package com.eclipse.programs.java;

 class Name{
	String fname;
	String mname;
	String lname;
	
	public Name(String fn,String mn,String ln) {
		this.fname = fn;
		this.mname = mn;
		this.lname = ln;
	}
}

public class HasARelation {
	
	int age;
	Name name;
	public void display(Name name,int age) {
		System.out.println("age "+age);
		System.out.println("f n "+name.fname+" mn "+name.mname+" ln "+name.lname);
	}

	public static void main(String[] args) {
		HasARelation hasarel = new HasARelation();
		Name nm = new Name("ven","devi","reddy");
		hasarel.display(nm,11);
	}

}
