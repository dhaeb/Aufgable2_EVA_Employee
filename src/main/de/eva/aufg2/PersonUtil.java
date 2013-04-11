package de.eva.aufg2;

public class PersonUtil {

	public static Employee createEmployee(String firstName, String lastName, int id, int workload, Integer salery){
		Employee newEmployee = new Employee();
		newEmployee.setFirstName(firstName);
		newEmployee.setLastName(lastName);
		newEmployee.setId(id);
		newEmployee.setWorkingHoursPerWeek(workload);
		newEmployee.setSalery(salery);
		return newEmployee;
	}
	
}
