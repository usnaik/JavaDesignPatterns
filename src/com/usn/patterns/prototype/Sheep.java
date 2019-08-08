package com.usn.patterns.prototype;

public class Sheep implements Animal {

	public Sheep() {

		System.out.println("Constructor! Sheep is Made.");

	}

	@Override
	public Animal makeCopy() {

		System.out.println("Clone: makeCopy! A `Clone` sheep is being made!");

		Sheep sheepObject = null;

		try {

			// Calls the Animal super classes clone()
			// Then casts the results to Sheep
			sheepObject = (Sheep) super.clone();
		}
		// If Animal didn't extend Cloneable this error
		// is thrown
		catch (CloneNotSupportedException e) {

			System.out.println("The Sheep was Turned to Mush");

			e.printStackTrace();

		}

		return sheepObject;
	}

	@Override
	public String toString() {

		return "Dolly is my Hero, Baaaaa  with hashcode : " + this.hashCode();

	}

}