package com.usn.patterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ATestClass {

	static void useSingleton() {
		ASingleton s = ASingleton.getInstance();
		print("singleton",s);
	}

	public static void main(String[] args) throws Throwable, Exception {
		
//		ASingleton s1 = ASingleton.getInstance();
//		ASingleton s2 = ASingleton.getInstance();
//		print("s1", s1);
//		print("s2", s2);
//		
//		//1. Reflection : Singleton fails on this
//		Class clz = Class.forName("com.usn.patterns.singleton.ASingleton");
//		Constructor ctor[] = clz.getDeclaredConstructors();
//		ctor[0].setAccessible(true);
//		ASingleton s3 = (ASingleton)ctor[0].newInstance();		
//		print("s3",s3);
//
//		//2.  Serialization / Deserialization : Fails on this 
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./s2.ser"));
//		oos.writeObject(s2);
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./s2.ser"));
//		ASingleton s4 = (ASingleton)ois.readObject();
//		print("s2=>s4 Serializaton ",s4);
//
//		//3.  Clone : Fails on this 
//		ASingleton s5 = (ASingleton) s1.clone();
//		print("s1=>s5 Clone ",s5);
		
		//4.1 Threading : Fails if not handlede correctly
		// Run seperately
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(ATestClass::useSingleton);
		service.submit(ATestClass::useSingleton);
		service.shutdown();
		
		//4.2 Threading : Fails if not handlede correctly 
		// Run seperately
//		Thread t1 = new Thread (new AThreadX());
//		Thread t2 = new Thread (new AThreadX());
//		t1.start();
//		t2.start();
		
	}

	
	static void print(String name, Object obj){
		System.out.println(String.format("Öbject name: %s, Object hashcode %s", name, obj.hashCode()));
	}
	
}
