package com.eclipse.programs.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		Date dt = new Date();
		String pattern="yyyy-mm-dd";
		System.out.println("date "+ dt);
		SimpleDateFormat df = new SimpleDateFormat("E yyyy.mm.dd 'at' hh:mm:ss a zzz");
		SimpleDateFormat dff = new SimpleDateFormat(pattern);
		System.out.println("diff "+dff.format(dt));
		System.out.println(df.format(dt));
		String str = String.format("Current date %tc", dt);
		System.out.printf(str);
		System.out.println(str);
		//format date with $
		System.out.printf("%1$tB, %1$tD, %1$tY",dt);
	}

}
