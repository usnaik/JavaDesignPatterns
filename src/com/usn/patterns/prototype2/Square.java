package com.usn.patterns.prototype2;

public class Square extends Shape {

	public Square() {
		type = "Square";
	}

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}