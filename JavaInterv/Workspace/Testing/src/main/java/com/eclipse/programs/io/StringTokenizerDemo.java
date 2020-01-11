package com.eclipse.programs.io;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String s = "hello world , this is robo2.0";
		StringTokenizer st = new StringTokenizer(s, " ");
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken());
		}
		int count =0;
		
		/*String[] ch = s.split("");
		for(String str:ch ){
			  System.out.println(str);
			  count++;
			}*/
		
		System.out.println("count "+count);
	}

}
