package com.eclipse.programs.abstraction;

public class CustomException {

	public static void main(String[] args) throws CheckedException {
		//throw new UncheckedException("custom exception-unchecked");
		throw new CheckedException("cutom-Checked exception");
	}

}
