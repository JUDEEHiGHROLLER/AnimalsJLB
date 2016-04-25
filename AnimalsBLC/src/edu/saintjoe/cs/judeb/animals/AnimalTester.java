package edu.saintjoe.cs.judeb.animals;

public class AnimalTester {

	public static void main(String[] args) {
		// Demonstration of various constuctors
		// This instantiation calls the "default" (no parameter) constructor
		Animal myPet = new Animal();
		
		// This one uses the one-parameter constructor
		Animal myLocalPet = new Animal(23);
		
		// This instantiation uses the third constructor
		// This instantiation uses the fourth constructor
		// This instantiation uses the fifth constructor
		// This instantiation uses the sixth constructor
		
		
		
		System.out.println("My animal has " + myPet.location + " as its location");
		System.out.println("My animal has " + myLocalPet.location + " as its location");

	}

}
