package com.eclipse.programs.abstraction;

public abstract class HP implements TouchScreenLaptop{
	public void scroll() {
		System.out.println("HP scroll()");
	}
	public abstract void click();
}
