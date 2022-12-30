package com.basics.java;

public class Human {
	
String name;
int age;
int heightInInches;
String haircolor;
String favouritefood; //Property

public Human() {
}     //Constructor

 public void speak () {   //Behavior
	 System.out.println("My name is "+ name);
	 System.out.println("My age is "+ age+ " years");
	 System.out.println("My height is "+ heightInInches+" inches");
	 System.out.println("My haircolor is "+ haircolor);
	
}

 public void eat () {
	 System.out.println(favouritefood);
 }
 

}
