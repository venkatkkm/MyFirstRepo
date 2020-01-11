package com.eclipse.programs.abstraction;

public class ThreeSeries extends BMW{
	
	public static void main(String[] args) {
		ThreeSeries three = new ThreeSeries();
		three.acclerator();
		three.commonFunctionality();
	}
	@Override
	void acclerator() {
		System.out.println("BMW series3 accelerator");
	}

}
