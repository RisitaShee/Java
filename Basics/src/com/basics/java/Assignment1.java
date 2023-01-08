package com.basics.java;

public class Assignment1 {
	public static void main(String[] args) {
		int length;
		int breadth;
		length = 20;
		breadth = 10;
		System.out.println("Area of the rectangle is  " + (length * breadth));

		int a;
		int b;
		int c;
		int p;
		a = 4;
		b = 3;
		c = -1;
		p = 2;
		System.out.println("the value of f(" + p + ")is " + (a * p * p + b * p + c));

		int m = 13513;
		System.out.println("the value of last two digits of m is " + ((m % 10) + ((m / 100) % 10)));

		int n;
		n = 23617;
		System.out.println("second last digit of " + n + " is " + ((n / 10) % 10));
		
		int j=4270;
		int l=543;
		
		int f=j%10;
		int e=l%10;
		j=j*10+e;
		l=l*10+f;
		System.out.println(j+ " "+l+" "+j*l);

	}

}
