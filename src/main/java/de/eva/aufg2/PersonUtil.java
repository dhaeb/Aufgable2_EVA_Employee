package de.eva.aufg2;

import java.util.List;

public class PersonUtil {

	public static Employee createEmployee(String firstName, String lastName, int id, int workingHoursPerWeek, int salary){
		Employee newEmployee = new Employee();
		newEmployee.setFirstName(firstName);
		newEmployee.setLastName(lastName);
		newEmployee.setId(id);
		newEmployee.setWorkingHoursPerWeek(workingHoursPerWeek);
		newEmployee.setSalary(salary);
		return newEmployee;
	}
	
	public static double calculateAvgSalary(List<Employee> employees){
		double averageSalary = 0;
		int count = 0;
		for(Employee e : employees){
			averageSalary = e.getSalary();
			count++;
		}
		double result = averageSalary / count;
		return result;
	}
	
}
