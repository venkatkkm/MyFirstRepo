package com.eclipse.programs.interfaces;

public interface Car {
	String brand();
	int speed();
	public static final int a= 1;//no use
	//public abstract void car();
	default void hi() {
		System.out.println("default ");
	}
	static void car1() {
		System.out.println("static method ");
	}
	/*Car(){
		System.out.println("ji");
	}*/
	/*public static void main(String[] args) {
		Car.car();
	}*/
}
