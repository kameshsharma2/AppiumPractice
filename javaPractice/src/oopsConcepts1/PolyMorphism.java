package oopsConcepts1;
class Animal2 {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Pig extends Animal2 {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}

class Dog extends Animal2 {
	public void animalSound() {
		System.out.println("The dog says: bow wow");
	}
}

public class PolyMorphism {
	public static void main(String[] args) {
		Animal2 myAnimal = new Animal2();  // Create a Animal object
		Animal2 myPig = new Pig();  // Create a Pig object
		Animal2 myDog = new Dog();  // Create a Dog object
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
	}
}