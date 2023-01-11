package com.basics.java;

public class Test8 {
public static void main(String[] args) {
	//8 operator precedence associativity
	int j;
	j=7+5;
	j+=10;
	System.out.println("the value of x is :" + j);
	
	int y;
	y= 7+5;
	y++;
	System.out.println("the value of y is :" + y);
	
	int i;
	i= 5;
	System.out.println("current value of i is :" + i++);
	System.out.println("current va;lue of i is :" + ++i);
	
	i =5;
	System.out.println("cueent value of i is :" + ++i);
	System.out.println("current value of i is :" + i++);
	
	
	int x = 10+2 * 4 -3;// 10 + 8 -3=18-3=15
	System.out.println(x);
}
}
