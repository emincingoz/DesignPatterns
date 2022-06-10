package DoubleCheckedLockingSingleton;

public class DoubleCheckedLockingSingleton {

	private static volatile DoubleCheckedLockingSingleton singleton;

	private static int count = 0;
	private String name;

	private DoubleCheckedLockingSingleton() {
		
		count++;
		name = "DoubleCheckedLockingSingleton " + count;
	}

	public static DoubleCheckedLockingSingleton getInstance() {
		
		if (singleton == null) {
			// mutex lock used
			synchronized (DoubleCheckedLockingSingleton.class) {
				
				if (singleton == null)
					singleton = new DoubleCheckedLockingSingleton();
			}
		}
		
		return singleton;
	}

	public void printName() {
		
		System.out.println(name);
	}
}
