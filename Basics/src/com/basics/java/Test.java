package com.basics.java;

public class Test {
	int a = 2;
	int b = 3;

	public static int sub(int a, int b) {
		return a - b;

	}

	public static void main(String[] args) {
		System.out.print("kolkata\t");
		System.out.print("behala\t");
		System.out.println("Khardah");
		System.out.println("Dumdum");
		System.out.print("Esplanade");
		System.out.println("Nandan");

		System.out.println(sub(2, 3));
		int myVar = 200;
		myVar = myVar + 10;
		System.out.println("value of myVar is: " + myVar);

		double x;
		x = 200.66;
		x = x + 20;
		System.out.println("value of x is: " + x);

		int a, b, c;
		a = 10;
		b = -5;
		c = 20;
		float avg;
		avg = (float) (a + b + c) / 3;
		System.out.println("avg of a,b and c is: " + avg);
		long r, y, z;
		r = 4444;
		y = 5465;
		z = 4567;
		double avg1;
		avg1 = (double) (r + y + z) / 3;
		System.out.println("avg1 of r,y and z is: " + avg1);

		boolean t;
		t = true;
		System.out.println("value of t is: " + t);
		char n;
		n = '5';
		System.out.println("value of n is: " + n);

		float p, q;
		p = (float) 0.5; // float is used for fractional number. you can't write decimal numbers in
					// float)

		q = (float) 0.5;

		double sum;
		sum = (double) (p + q);

		System.out.println("the value of sum is " + sum);
		
		
		int u= 5;
		if (x==5) {
			System.out.println("value of x is 5");
		}

	}

}
