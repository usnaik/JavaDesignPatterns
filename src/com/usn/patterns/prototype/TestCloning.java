package com.usn.patterns.prototype;

public class TestCloning {

	public static void main(String[] args) {

		// Handles routing makeCopy method calls to the
		// right subclasses of Animal

		CloneFactory animalMaker = new CloneFactory();

		// Creates a new Sheep instance

		Sheep sally = new Sheep();

		// Creates a clone of Sally and stores it in its own
		// memory location

		Sheep clonedSheep1 = (Sheep) animalMaker.getClone(sally);

		// Creates a second clone of Sally and stores it in its own
		// memory location
		Sheep clonedSheep2 = (Sheep) animalMaker.getClone(sally);

		// These are exact copies of each other

		System.out.println(sally);

		System.out.println(clonedSheep1);

		System.out.println(clonedSheep2);

		System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sally)));

		System.out.println("Clone 1 HashCode: " + System.identityHashCode(System.identityHashCode(clonedSheep1)));

		System.out.println("Clone 2 HashCode: " + System.identityHashCode(System.identityHashCode(clonedSheep2)));
	}

}