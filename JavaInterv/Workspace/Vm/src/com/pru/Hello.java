package com.pru;

public class Hello {

	public static void main(String[] args) {

		//System.out.println("hi");
		
		int[] arr= {1,2,3,4,5};
		int sum=0,sum1=0,sum2=0,sum3=0,sum4=0;
		for(int i=0;i<=arr.length-2;i++) {
			sum=arr[i]+arr[i+1];
		}
		sum= sum+arr[arr.length-1];
		for(int i=1;i<=arr.length-2;i++) {
			sum1=arr[i]+arr[i+1];
		}
		sum1= sum1+arr[arr.length-2];
		for(int i=2;i<=arr.length-2;i++) {
			sum2=arr[i]+arr[i+1];
		}
		sum2= sum2+arr[arr.length-1];
		for(int i=3;i<=arr.length-2;i++) {
			sum3=arr[i]+arr[i+1];
		}
		sum3= sum3+arr[arr.length-1];
			arr[0]=sum;
			arr[1]=sum1;
			arr[2] = sum2;
			arr[3] = sum3;
			//arr[4] = sum4;
			for(int i:arr) {
				System.out.print(i);
			}
		}
		
		//System.out.println(arr[0]);
}
