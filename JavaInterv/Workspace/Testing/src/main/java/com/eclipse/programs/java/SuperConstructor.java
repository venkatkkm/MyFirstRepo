package com.eclipse.programs.java;

 class ParentCons{
	 String name;
	 ParentCons(){
		 System.out.println("no parameterized constructor");
	 }
	 ParentCons(String name){
		 this.name = name;
		 System.out.println("parameterized constructor");
		 System.out.println("name "+ this.name);
		 System.out.println("name1 "+ name);
	 }
 }
public class SuperConstructor extends ParentCons{
	int i;
	SuperConstructor(){
		super();//constructor call must be 1st statement in the const
		System.out.println("child cons");
	}
	SuperConstructor(String name, int i){
		super(name);
		this.i=i;
	}
	public void display() {
		System.out.println("name of child "+name +"Eid "+i);
	}
	public static void main(String[] args) {
		SuperConstructor e= new SuperConstructor();
		SuperConstructor e2 = new SuperConstructor("venk",11);
		e2.display();
	}

}
