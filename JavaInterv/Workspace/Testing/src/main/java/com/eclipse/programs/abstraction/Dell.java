package com.eclipse.programs.abstraction;

public abstract class Dell implements TouchScreenLaptop{
	public void scroll() {
		System.out.println("Dell scroll()");
	}
	public abstract void click();
}
