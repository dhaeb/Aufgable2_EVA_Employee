package de.eva.aufg2;

public class MainClass {
	
	public static Employee createEmployee(String firstName, String lastName, int id, int workload){
		Employee newEmployee = new Employee();
		newEmployee.setFirstName(firstName);
		newEmployee.setLastName(lastName);
		newEmployee.setId(id);
		newEmployee.setWorkingHoursPerWeek(workload);
		return newEmployee;
	}
	
	public static void main(String[] args) {
		Employee employee = MainClass.createEmployee("Dein Vorname!", "Dein Nachname", 1234, 150);
		
	}
}
