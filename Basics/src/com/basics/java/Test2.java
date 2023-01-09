package com.basics.java;

public class Test2 {
	public static void main(String[] args) {
//6.1
		int x = 3;
		if (x == 1) {
			System.out.println("hi");
		} else if (x == 2) {
			System.out.println("hello");
		} else if (x == 4) {
			System.out.println("hello world");
		} else {
			System.out.println("wrong input");

		}
		//6.2
int age = 26;
if (age< 2) {
	System.out.println("infant");
}else if (age<10) { // >=2 && < 10
	System.out.println("child");
} else if (age<20) {
	System.out.println("teenage");
} else if (age <30) {
	System.out.println("adult");
} else {
	System.out.println("old");
}
	}
}
