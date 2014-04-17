package de.eva.aufg2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestEmployeeDefaultWorkload {

	private Employee testableEmployee;
	private Employee testableEmployee2;

	@Before
	public void setup(){
		testableEmployee = new Employee();
		testableEmployee2 = new Employee(35);
	}
	
	@Test
	public void testDefaultWorkload(){
		assertEquals(40, testableEmployee.getWorkingHoursPerWeek());
		assertEquals(35, testableEmployee2.getWorkingHoursPerWeek());
	}
	
}

