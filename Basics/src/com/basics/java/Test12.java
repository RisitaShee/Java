package com.basics.java;

public class Test12 {
	public static void main(String[] args) {
		int i,j;
		for (i=1;i<=2;i++) { //2 times
			System.out.println("outer loop start");
			for (j=1; j<=3; j++) {
				System.out.println("hi");
			}
			System.out.println("outer loop end");
			
		}
	}

}
