package com.linkedList;

public class Stack {

	int top;
	int[] data = new int[4];
	
	public static void main(String[] args) {

		Stack st = new Stack();
		st.push(3);
		st.push(1);
		st.push(6);
		st.push(8);
		st.show();
		st.pop();
		st.show();
		st.peek();
	}
	
	void push(int value) {
		data[top++] = value;	
	}
	
	void pop() {
		top--;
		data[top] = 0;
	}
	void show() {
		for(int i=0;i<=top-1;i++) {
			System.out.print(data[i]+"->");
		}
		System.out.println();
	}
	void peek() {
		top--;
		System.out.println("last "+data[top]);
	}
}
