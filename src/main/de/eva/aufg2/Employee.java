package de.eva.aufg2;

public class Employee implements IPerson {

	private String firstName;
	private String lastName;
	private int id;
	private Integer salary;

	private int workingHoursPerWeek;

	public Employee() {
		this(40);
	}

	public Employee(int workingHoursPerWeek) {
		this.workingHoursPerWeek = workingHoursPerWeek;
	}

	@Override
	public boolean equals(Object obj) { // Vergleiche, ob gleicher Mitarbeiter
										// übergeben wurde. Kriterium: ID
		boolean isEqual = false;
		if (obj != null && obj instanceof Employee) {
			Employee castedObj = (Employee) obj;
			isEqual = this.id == castedObj.id;
		}
		return isEqual;
	}

	@Override
	public String toString() { // Einfache ausgabe der Objektattribute (die von
								// Object geerbte Methode enthält darüber keine
								// Informationen)
		String name = "Employee: " + firstName + " " + lastName;
		String id = "id: " + this.id;
		String workload = "workload: " + this.workingHoursPerWeek + " hours per week";
		String salary = "Gehalt " + this.salary;
		return String.format("(%s, %s, %s, %s )", name, id, workload, salary);
	}

	@Override
	public int compareTo(IPerson o) { // Vergleiche Personen anhand des Gehaltes
		Integer salaryOfComparablePerson = o.getSalary();
		int comparisonResult = compareUsingSalery(salaryOfComparablePerson);
		return comparisonResult;
	}

	private int compareUsingSalery(Integer salaryOfComparablePerson) {
		int comparedResult = 0; // Ergebnis ist 0 wenn beide Personen das
								// gleiche Gehalt besitzen
		if (this.salary > salaryOfComparablePerson) // Ergebnis ist 1 wenn
													// Vergleichsperson
													// kleineres Gehalt besitzt
			comparedResult = 1;
		else if (this.salary < salaryOfComparablePerson)
			comparedResult = -1; // Ergebnis ist -1 wenn Vergleichsperson
									// größeres Gehalt besitzt
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

	@Override
	public Integer getSalary() {
		return salary;
	}

	@Override
	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public int getWorkingHoursPerWeek() {
		return workingHoursPerWeek;
	}

	public void setWorkingHoursPerWeek(int workingHoursPerWeek) {
		this.workingHoursPerWeek = workingHoursPerWeek;
	}
}
