package de.eva.aufg2;

public class Employee implements Person {

	private String firstName;
	private String lastName;
	private int id;
	private int workingHoursPerWeek;
	
	public Employee() {}
	
	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		if(obj != null && obj instanceof Employee){
			Employee castedObj = (Employee) obj;
			isEqual = this.id == castedObj.id;
		}
		return isEqual;
	}
	
	@Override
	public String toString() {
		String name = "Employee: " + firstName + " " + lastName;
		String id = "id: " + this.id;
		String workload = "workload: " + workingHoursPerWeek;
		return name + "\n" +
			   id + "\n" +
			   workload;
	}
	
	@Override
	public int compareTo(Person o) {	// Vergleiche Personen anhand der ID 
		int idOfOtherPersion  = o.getId();
		int comparisonResult = compareUsingId(idOfOtherPersion);
		return comparisonResult;
	}

	private int compareUsingId(int idOfOtherPersion) {
		int comparedResult = 0; // Ergebnis ist 0 wenn beide Personen die gleiche ID besitzen
		if(this.id > idOfOtherPersion) // Ergebnis ist 1 wenn Vergleichsperson kleinere ID besitzt
			comparedResult = 1;
		else 
			if(this.id != idOfOtherPersion)
				comparedResult = -1; // Ergebnis ist -1 wenn Vergleichsperson größere ID besitzt
		return comparedResult;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getWorkingHoursPerWeek() {
		return workingHoursPerWeek;
	}
	
	public void setWorkingHoursPerWeek(int workingHoursPerWeek) {
		this.workingHoursPerWeek = workingHoursPerWeek;
	}
}

