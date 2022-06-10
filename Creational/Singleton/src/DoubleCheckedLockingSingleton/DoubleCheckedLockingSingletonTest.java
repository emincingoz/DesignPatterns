package DoubleCheckedLockingSingleton;

public class DoubleCheckedLockingSingletonTest extends Thread {

public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++) {
			new DoubleCheckedLockingSingletonTest().start();
		}
	}
	
	public void run() {
		DoubleCheckedLockingSingleton singleton = DoubleCheckedLockingSingleton.getInstance();
		singleton.printName();
	}

}
