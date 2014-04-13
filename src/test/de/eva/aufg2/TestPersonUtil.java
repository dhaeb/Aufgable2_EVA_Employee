package de.eva.aufg2;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestPersonUtil {

	@Test
	public void testCalcMeanSalary() throws Exception {
		Employee poorProgrammer = PersonUtil.createEmployee("John", "Smith", 1, 40, 36000);
		Employee projectManager = PersonUtil.createEmployee("Frank", "Miller", 2, 38, 80000);
		Employee softwareArchitect = PersonUtil.createEmployee("Tim", "Fisher", 3, 38, 64000);
		double expected = 60000,
			   result = PersonUtil.calculateAvgSalary(Arrays.asList(new Employee[]{poorProgrammer, projectManager, softwareArchitect}));
		assertEquals(expected, result, 3);
	}
}
