package fm1;

public class DirectorFactory implements Factory {
	
	public DirectorFactory() {
		
	}
	
	@Override
	public Director create() {
		Director director = new Director(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
				EmployeeRandomizer.createYear(), "Management", "Management", 5000);
		return director;
	}
}
