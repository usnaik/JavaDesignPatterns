package com.usn.patterns.singleton;

public class AThreadX implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		ASingleton s = ASingleton.getInstance();
		ATestClass.print("s6",s);
	}
	
}