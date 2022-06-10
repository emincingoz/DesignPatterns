package LazySingleton;

public class LazySingleton {
	
	private static LazySingleton singleton;

	private static int count = 0;
	private String name;

	private LazySingleton() {
		
		count++;
		name = "LazySingleton " + count;
	}

	public static LazySingleton getInstance() {
		
		// To late initialize the singleton object, it is checked whether the singleton object is null
		if (singleton == null)
			singleton = new LazySingleton();
		
		return singleton;
	}

	public void printName() {
		
		System.out.println(name);
	}
}
