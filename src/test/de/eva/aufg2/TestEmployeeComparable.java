package de.eva.aufg2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestEmployeeComparable { // test benötigt funktionierende Getter und Setter in der Klasse Employee

	private static final int LOW_ID = 1;
	private static final int MIDDLE_ID = 2;
	private static final int HIGH_ID = 3;
	
	private Employee testableEmployee1;
	private Employee testableEmployee2;
	private Employee testableEmployee3;

	@Before
	public void setup(){
		testableEmployee1 = new Employee();
		testableEmployee1.setId(LOW_ID);
		testableEmployee2 = new Employee();
		testableEmployee2.setId(MIDDLE_ID);
		testableEmployee3 = new Employee();
		testableEmployee3.setId(HIGH_ID);
	}
	
	@Test
	public void testEquals(){
		Employee sameEmployee = new Employee();
		sameEmployee.setId(LOW_ID);
		assertEquals(0 ,testableEmployee1.compareTo(sameEmployee));
		sameEmployee.setId(MIDDLE_ID);
		assertEquals(0 ,testableEmployee2.compareTo(sameEmployee));
		sameEmployee.setId(HIGH_ID);
		assertEquals(0 ,testableEmployee3.compareTo(sameEmployee));
	}
	
	@Test
	public void testGreaterThan(){
		assertEquals(1, testableEmployee2.compareTo(testableEmployee1));
		assertEquals(1, testableEmployee3.compareTo(testableEmployee1));
		assertEquals(1, testableEmployee3.compareTo(testableEmployee2));
	}
	
	@Test
	public void testLowerThan(){
		assertEquals(-1, testableEmployee1.compareTo(testableEmployee2));
		assertEquals(-1, testableEmployee1.compareTo(testableEmployee3));
		assertEquals(-1, testableEmployee2.compareTo(testableEmployee3));
	}
	
}
