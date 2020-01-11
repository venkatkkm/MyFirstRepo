package com.eclipse.programs.abstraction;

public class DellNoteBook extends Dell{
	
	public void click() {
		System.out.println("Dell click()");
	}
	public static void main(String[] args) {
		DellNoteBook dnb = new DellNoteBook();
		dnb.scroll();
		dnb.click();
	}

}
