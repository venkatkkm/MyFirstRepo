package com.eclipse.programs.java;

class PersonClass{
	public void display() {
		System.out.println("person class");
	}
}
class EmpClass extends PersonClass {
	public void display() {
		System.out.println("Emp class");
	}
}
class CompClass extends EmpClass{
	public void display() {
		System.out.println("company method");
	}
}
public class Overriding{

	public static void main(String[] args) {
		System.out.println("Overriding class");
		PersonClass per = new PersonClass();
		per.display();
		PersonClass emp = new EmpClass();
		emp.display();
		EmpClass comp = new CompClass();
		comp.display();
	}

}
