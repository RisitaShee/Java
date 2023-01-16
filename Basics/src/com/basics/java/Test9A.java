package com.basics.java;

public class Test9A {
public static void main(String[] args) {
	for (int i=100; i>=0; i=i-10) {
		System.out.println(i);
	}
	
	int sum=0;
	for (int y=30; y<=120; y++ ) {
		if (y%3==0 && y%5==0) {
			sum=sum+y;
		}
	}
	System.out.println("sum is: " + sum);
}
}
