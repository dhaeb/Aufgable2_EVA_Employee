package de.eva.aufg2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestPersonUtil {

	@Test
	public void testCalcAvgSalary() throws Exception {
		Employee poorProgrammer = PersonUtil.createEmployee("John", "Smith", 1, 40, 36000);
		Employee projectManager = PersonUtil.createEmployee("Frank", "Miller", 2, 38, 80000);
		Employee softwareArchitect = PersonUtil.createEmployee("Tim", "Fisher", 3, 38, 64000);
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(poorProgrammer);
		employees.add(projectManager);
		employees.add(softwareArchitect);
		double expected = 60000,
			   result = PersonUtil.calculateAvgSalary(employees);
		assertEquals(expected, result, 3);
	}
}
