package com.eclipse.programs.io;
import java.io.File;
import java.util.Scanner;

public class InputStream {

	public static void main(String[] args) {
		/*FileInputStream fis= null;
		try {
		fis = new FileInputStream("C:\\Users\\VenkataDevireddy\\Documents\\hello.txt");
		//int i;
		for(int i=0; (i=fis.read())!=-1; i++) {
			System.out.print((char)i);
		}
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		
		File file = new File("C:\\Users\\VenkataDevireddy\\Documents", "hello.txt");
		if(file.exists()) {
			 //no read() for File,it is for FIS.
		}
		
		StringBuffer sb = new StringBuffer();
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		String s1="hello";
		System.out.println(s.toCharArray());
		System.out.println(s.substring(1,4));
			//Write code here
		System.out.println(s.charAt(0));
	}

}
