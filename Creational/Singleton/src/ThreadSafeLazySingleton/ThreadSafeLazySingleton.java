package ThreadSafeLazySingleton;

public class ThreadSafeLazySingleton {

	private static volatile ThreadSafeLazySingleton singleton;

	private static int count = 0;
	private String name;

	private ThreadSafeLazySingleton() {
		
		count++;
		name = "LazySingleton " + count;
	}

	public static ThreadSafeLazySingleton getInstance() {
		
		// mutex lock used
		synchronized (ThreadSafeLazySingleton.class) {
			
			if (singleton == null)
				singleton = new ThreadSafeLazySingleton();
		}
		
		return singleton;
	}
	
	/*public static synchronized ThreadSafeLazySingleton getInstance() {
		
		if (singleton == null)
			singleton = new ThreadSafeLazySingleton();
		
		return singleton;
	}*/

	public void printName() {
		
		System.out.println(name);
	}
}
