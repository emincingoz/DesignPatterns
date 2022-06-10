package ThreadSafeLazySingleton;

public class ThreadSafeLazySingletonTest extends Thread{

	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++) {
			new ThreadSafeLazySingletonTest().start();
		}
	}
	
	public void run() {
		ThreadSafeLazySingleton singleton = ThreadSafeLazySingleton.getInstance();
		singleton.printName();
	}

}
