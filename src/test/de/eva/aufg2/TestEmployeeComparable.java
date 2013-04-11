package de.eva.aufg2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestEmployeeComparable { // test benötigt funktionierende Getter und Setter in der Klasse Employee

	private static final int LOW_SALERY = 1000;
	private static final int MIDDLE_SALERY = 2000;
	private static final int HIGH_SALERY = 3000;
	
	private Employee testableEmployee1;
	private Employee testableEmployee2;
	private Employee testableEmployee3;

	@Before
	public void setup(){
		testableEmployee1 = new Employee();
		testableEmployee1.setSalery(LOW_SALERY);
		testableEmployee2 = new Employee();
		testableEmployee2.setSalery(MIDDLE_SALERY);
		testableEmployee3 = new Employee();
		testableEmployee3.setSalery(HIGH_SALERY);
	}
	
	@Test
	public void testCompareEquals(){
		Employee sameEmployee = new Employee();
		sameEmployee.setSalery(LOW_SALERY);
		assertEquals(0 ,testableEmployee1.compareTo(sameEmployee));
		sameEmployee.setSalery(MIDDLE_SALERY);
		assertEquals(0 ,testableEmployee2.compareTo(sameEmployee));
		sameEmployee.setSalery(HIGH_SALERY);
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
