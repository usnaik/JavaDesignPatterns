package com.usn.patterns.zchallenge;

// Print 1 to 100 numbers ; 
// if number is divisible by 3 pring Fizz; 
// If number divisible by 5 print Buzz; 
// if number divisible by 3 and 5 print FizzBuzz; 
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i<=100; i++) {
			
			System.out.print("i = " + i + " ");
			if (i%3 == 0) System.out.print("Fizz");
			if (i%5 == 0) System.out.print("Buzz");
			System.out.println();
						
		}
	}

}
