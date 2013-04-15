package de.eva.aufg2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestEmployeeToString { // test benötigt funktionierende Getter und Setter in der Klasse Employee

	private Employee testableEmployee;

	@Before
	public void setup(){
		testableEmployee = new Employee();
		testableEmployee.setFirstName("Max");
		testableEmployee.setLastName("Mustermann");
		testableEmployee.setId(123456);
		testableEmployee.setWorkingHoursPerWeek(20);
		testableEmployee.setSalary(987);
	}
	
	@Test
	public void testToString(){
		String employeeDescription = testableEmployee.toString();
		assertTrue("Method Employee.toString() does not contain the first name!", employeeDescription.contains("Max"));
		assertTrue("Method Employee.toString() does not contain the last name!", employeeDescription.contains("Mustermann"));
		assertTrue("Method Employee.toString() does not contain the id!", employeeDescription.contains("123456"));
		assertTrue("Method Employee.toString() does not contain the workload!", employeeDescription.contains("20"));
		assertTrue("Method Employee.toString() does not contain the salery!", employeeDescription.contains("987"));
	}
	
}

