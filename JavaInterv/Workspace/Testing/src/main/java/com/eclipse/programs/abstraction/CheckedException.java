package com.eclipse.programs.abstraction;

public class CheckedException extends Exception{
	CheckedException(String msg){
		super(msg);
		System.out.println("CheckedException");
	}
}
