package com.eclipse.programs.abstraction;

public class HPNoteBook extends HP {
	public void click() {
		System.out.println("hp click()");
	}
	public static void main(String[] args) {
		HPNoteBook hpn = new HPNoteBook();
		hpn.click();
		hpn.scroll();
	}

}
