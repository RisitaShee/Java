package com.basics.java;

public class Test10A{
public static void main(String[] args) {

	//5+10+15+......=100=?
	int sum=0;
	int i=5;
	while (i<=100) {
		sum=sum+i;
		i=i+5;
	}
	System.out.println("sum is: " + sum);
}
}
