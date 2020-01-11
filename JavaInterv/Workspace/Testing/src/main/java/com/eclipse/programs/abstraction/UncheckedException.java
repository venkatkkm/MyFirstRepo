package com.eclipse.programs.abstraction;

public class UncheckedException extends RuntimeException{
	UncheckedException(String msg){
		super(msg);
		System.out.println("UncheckedException");
	}
}
