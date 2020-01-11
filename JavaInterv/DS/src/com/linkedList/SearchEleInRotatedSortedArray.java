package com.linkedList;

public class SearchEleInRotatedSortedArray {

	public static void main(String[] args) {

		int[] a = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		int n = 10;
		int l = 0;
		int h = a.length-1;
		
		while(l<=h) {
			int mid = (l+h)/2;
			if(a[mid]==n)
				{System.out.println("given num found at "+mid);
				break;
				}
			if(n<a[mid])
				h= mid-1;
			else
				l= mid+1;
		}
		if(l>h)
		 System.out.println("not found");
	}
}
