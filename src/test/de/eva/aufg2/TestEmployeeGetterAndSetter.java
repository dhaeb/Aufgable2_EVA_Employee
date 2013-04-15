package de.eva.aufg2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestEmployeeGetterAndSetter {

	private Employee testableEmployee;

	@Before
	public void setup(){
		testableEmployee = new Employee();
	}
	
	@Test
	public void testGetter(){
		testableEmployee.getFirstName();
		testableEmployee.getLastName();
		testableEmployee.getId();
		testableEmployee.getWorkingHoursPerWeek();
		testableEmployee.getSalary();
	}
	
	@Test
	public void testSetter(){ // dieser Test kann nur funktionieren, wenn der Getter Test erfolgreich ausgeführt wird
		testableEmployee.setFirstName("Max");
		testableEmployee.setLastName("Mustermann");
		testableEmployee.setId(123456);
		testableEmployee.setWorkingHoursPerWeek(20);
		testableEmployee.setSalary(Integer.valueOf(1200));
		
		assertEquals("Max", testableEmployee.getFirstName());
		assertEquals("Mustermann", testableEmployee.getLastName());
		assertEquals(123456, testableEmployee.getId());
		assertEquals(20, testableEmployee.getWorkingHoursPerWeek());
		assertEquals(Integer.valueOf(1200), testableEmployee.getSalary());
	}
	
}
