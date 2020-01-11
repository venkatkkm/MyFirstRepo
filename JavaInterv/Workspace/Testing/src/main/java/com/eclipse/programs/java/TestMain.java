package com.eclipse.programs.java;

public class TestMain {

	public static void main(String[] args) {
		String[] name = {"hi","hello","world","1","2","4","hi","hello","world","1","2","4","hi","hello","world","1","2","4"}; ;
		//name = 
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		
		for(int i=0; i<=name.length-1;i++) {
		System.out.println(name[i]);	
		}
		int[] age = new int[20];
		for(int i=0; i<=age.length-1;i++) {
			age[i] = i;
			System.out.println("dynamic "+age[i]);	
			}
	}

}
