package com.usn.patterns.singleton;

import java.io.Serializable;

public class ASingleton implements Serializable, Cloneable{

	private static ASingleton soleInstance = null;

	private ASingleton() {
		System.out.println("Creating ...");
	}

	static boolean firstThread = true; 

	public static ASingleton getInstance(){
		
		if (firstThread) {
			firstThread = false;
			if (soleInstance == null) {
				soleInstance = new ASingleton();
			}
		}
		return soleInstance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

