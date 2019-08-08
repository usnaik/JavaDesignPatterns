package com.usn.patterns.zchallenge;

//	Given a String, reverse it [  options ]
public class ReverseString {


	public static void main(String[] args) {		
		
		String str = "Hello World!";

		System.out.println(ReverseStringUsingStringBuilder(str));
		System.out.println(ReverseStringManually(str));

	}

	private static String ReverseStringManually(String str) {
		return new StringBuilder(str).reverse().toString();
	}

	private static String ReverseStringUsingStringBuilder(String str) {
		StringBuilder revString = new StringBuilder();
		for (int i=str.length()-1; i>=0; i--) {
			revString.append(str.charAt(i));
		}
		return revString.toString();
	}
	
}
