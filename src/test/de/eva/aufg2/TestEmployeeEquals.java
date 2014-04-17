package de.eva.aufg2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestEmployeeEquals {
	
	private Employee testableEmployee;

	@Before
	public void setup(){
		testableEmployee = new Employee();
		testableEmployee.setId(123456);
	}
	
	@Test
	public void testEqualEmployee(){
		Employee sameEmployee = new Employee();
		sameEmployee.setId(123456);
		assertEquals(testableEmployee, testableEmployee);
		assertEquals(sameEmployee, testableEmployee);
	}
	
	@Test
	public void testDifferentEmployee(){
		Employee differentEmployee = new Employee();
		differentEmployee.setId(999);
		assertNotEquals(differentEmployee, testableEmployee);
	}
	
}
