package de.eva.aufg2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
	
	public static void main(String[] args) {
		//Ein paar beliebige Mitarbeiter sollen nach Gehalt geordnet werden
			//Erstellung der Mitarbeiter
		Employee poorProgrammer = PersonUtil.createEmployee("Programmer", "", 1, 40, Integer.valueOf(36000));
		Employee projectManger = PersonUtil.createEmployee("Manager", "", 2, 38, Integer.valueOf(80000));
		Employee softwareArchitect = PersonUtil.createEmployee("Architekt", "", 3, 38, Integer.valueOf(63000));
			//Erstellung einer Liste, die sortiert werden kann
		List<Employee> employeeList = new ArrayList<Employee>();
			//Hinzufügen der zuvor erstellten Mitarbeiter
		employeeList.add(poorProgrammer);
		employeeList.add(projectManger);
		employeeList.add(softwareArchitect);
			//aufsteigende Sortierung
		Collections.sort(employeeList);
		
			//ausgabe über STDOUT der aufsteigend sortierten Liste
		System.out.println("AUFSTEIGENDE SORTIERUNG: \n");
		System.out.println(employeeList);
			
		Comparator<Employee> comparator = Collections.reverseOrder();
		Collections.sort(employeeList, comparator);
			//einfügen einer Leerzeile
		System.out.println(); 
			//ausgabe über STDOUT der absteigend sortierten Liste
		System.out.println("ABSTEIGENDE SORTIERUNG: \n");
		System.out.println(employeeList);
	}
}
