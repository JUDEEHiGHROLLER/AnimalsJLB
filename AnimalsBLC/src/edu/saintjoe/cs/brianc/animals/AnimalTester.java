package edu.saintjoe.cs.brianc.animals;

public class AnimalTester {

	public static void main(String[] args) {
		Dog C = new Dog();
		Animal Taco = new Dog();
		Cat Garfield = new Cat();
		
		System.out.println(C.makeNoise());
		System.out.println(Taco.makeNoise());
		System.out.println(Garfield.makeNoise());

	}

}
