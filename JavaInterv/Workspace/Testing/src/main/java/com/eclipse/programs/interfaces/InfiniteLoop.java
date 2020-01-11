package com.eclipse.programs.interfaces;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class InfiniteLoop {
	
	 InfiniteLoop(){
		
	}

	public static void main(String[] args){

		/*for(int i=0;i<=i;i++) {
			System.out.println(i);
		}*/
		/*while(true) {
			System.out.println("ji");
		}*/
		//excep();
		try {
		System.out.println("hi");
		}catch(Exception e) {
			System.out.println("null");
		}
		InfiniteLoop in = new InfiniteLoop();
		
		System.out.println(in.hashCode());
		System.out.println(in.toString());
		System.out.println(in);
		StringBuffer sb =new StringBuffer("hello");
		List<Integer> ls = new ArrayList<>();
		for(int i=0;i<=3;i++) {
			ls.add(i);
		}
		List<Integer> ls1 = new ArrayList<>();
		for(int i=4;i<=6;i++) {
			ls1.add(i);
		}
		ls.addAll(ls1);
		System.out.println(ls);
		Set<String> set = new TreeSet<>();
		set.add(null);
		
	}
	@Override
	protected void finalize() {
		
	}
	static void excep() throws IOException{
		System.out.println("hi");
	}

}
