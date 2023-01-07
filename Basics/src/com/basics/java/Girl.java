package com.basics.java;

public class Girl extends Human {
	public static void main(String[] args) {
		Human Girl = new Human();  //Object
		
		Girl.name ="Risita"; // Values of variables
		Girl.age =24;
		Girl.heightInInches =60;
		Girl.haircolor ="Black";	
		
		Girl.speak(); // Predefined behavior
		
		
		Girl.favouritefood ="Mutton";
		
		Girl.eat();
		
		
	}

}
