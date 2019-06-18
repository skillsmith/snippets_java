package com.java.level2;

public abstract class BigCat implements Animal{
	
	String respond2Stimuli = "bite";

	public void eatFood(){
		System.out.println("Hunts and eats meat");
	}
	public void moveAround(){
		System.out.println("walk or run");
	}
	public void makeSound(){
		System.out.println("Howls");
	}
	
}