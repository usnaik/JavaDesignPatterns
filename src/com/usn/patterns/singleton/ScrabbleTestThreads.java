package com.usn.patterns.singleton;

public class ScrabbleTestThreads{
	
	public static void main(String[] args){
		
		// Create a new Thread created using the Runnable interface
		// Execute the code in run after 10 seconds
				
		Runnable P1Tiles = new GetTheTiles();
		Runnable P2Tiles = new GetTheTiles();
//		Runnable P3Tiles = new GetTheTiles();
				
		// Call for the code in the method run to execute
				
		new Thread(P1Tiles).start();
		new Thread(P2Tiles).start();
//		new Thread(P3Tiles).start();
		
	}
	
}
