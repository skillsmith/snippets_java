package com.java.level2;

public class Dog extends Canine {

	public static void main(String[] args) {
		Dog dobberman = new Dog();
		
		dobberman.eatFood();
		dobberman.moveAround();
		dobberman.makeSound();
		dobberman.makeSound("male");
		
		System.out.println("All OK! Being a living thing, do you respond to stimuli?" + Animal.respond2Stimuli);

	}
	
	public void eatFood(){		//overridden
		System.out.println("I eat meat but do not need to hunt. My master steals from the grocer!");
	}

	public void makeSound(){	//overload
		System.out.println("huh...bark only");
	}
	
	public void makeSound(String gender){	//overload
		if (gender.equals("male")) System.out.println("sometimes, I howl");
	}

}