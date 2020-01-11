package com.eclipse.programs.java;

interface Person{
	
}
class Employee implements Person{
	
}
public class InstanceOfExamp extends Employee{

	public static void main(String[] args) {
		InstanceOfExamp ins = new InstanceOfExamp();
		Employee emp = new Employee();
		System.out.println(ins instanceof InstanceOfExamp);
		System.out.println(emp instanceof Employee);
		System.out.println(ins instanceof Person);
	}

}
