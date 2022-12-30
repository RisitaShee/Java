package com.basics.java;

public class Earth {
	public static void main(String[] args) {
		Human Girl;
		Girl = new Human();  //Object
		
		Girl.name ="Risita"; // Values of variables
		Girl.age =24;
		Girl.heightInInches =60;
		Girl.haircolor ="Black";	
		
		Girl.speak(); // Predefined behavior
		
		
		Girl.favouritefood ="Mutton";
		
		Girl.eat();
		
		Human Boy;
		Boy = new Human();
		Boy.name ="Sourav";
		
		Boy.speak();
		Boy.favouritefood ="Chicken";
		Boy.eat();
	}

}
