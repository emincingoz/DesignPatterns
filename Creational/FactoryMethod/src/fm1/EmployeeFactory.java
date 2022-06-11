package fm1;

public class EmployeeFactory implements Factory {
	
	public EmployeeFactory() {
		
	}
	
	@Override
	public Employee create() {
		Employee employee = new Employee(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
				EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment());
		return employee;
	}
}
