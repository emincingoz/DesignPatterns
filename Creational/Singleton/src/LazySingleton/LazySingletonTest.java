package LazySingleton;

public class LazySingletonTest {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			LazySingleton singleton = LazySingleton.getInstance();
			singleton.printName();
		}

		LazySingleton s1 = LazySingleton.getInstance();
		System.out.println("\nHashCode: " + s1.hashCode());
		
		LazySingleton s2 = LazySingleton.getInstance();
		System.out.println("\nHashCode: " + s2.hashCode());
		
		if (s1 == s2)
			System.out.println("\nThe same object!");
		else
			System.out.println("\nDifferent Objects");
	}

}
