package ThreadSafeLazySingleton;

import LazySingleton.LazySingleton;

public class ThreadedLazySingletonTest extends Thread {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			new ThreadedLazySingletonTest().start();
		}
	}
	
	public void run() {
		LazySingleton singleton = LazySingleton.getInstance();
		singleton.printName();
	}

}
