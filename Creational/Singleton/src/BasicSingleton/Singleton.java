package BasicSingleton;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	private String name;
	private static int count;
	
	private Singleton() {
		count++;
		name = "Singleton " + count;
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
	
	public void printName() {
		System.out.println(name);
	}
}
