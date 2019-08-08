package com.usn.patterns.singleton;

import java.util.LinkedList;

public class GetTheTiles implements Runnable {

	public void run(){

		// How you create a new instance of Singleton

		Singleton newInstance = Singleton.getInstance();

		// Get unique id for instance object

		System.out.println( "Instance ID: " + System.identityHashCode(newInstance));

		// Get all of the letters stored in the List

		System.out.println(newInstance.getLetterList());

		LinkedList<String> playerTiles = newInstance.getTiles(7);

		System.out.println("Player : " + playerTiles);

		System.out.println("Got Tiles");

		System.out.println();

	}

}