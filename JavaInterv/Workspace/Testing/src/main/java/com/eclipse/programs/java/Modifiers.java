package com.eclipse.programs.java;

public class Modifiers {
	
	public static final String color = "black";
	int mileage = 20;

	protected void display() {
		System.out.println("color " + color);
	}
	public void ownerDetails() {
		System.out.println("Owner");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifiers mod = new Modifiers();
		mod.ownerDetails();
		mod.display();
	}

}
