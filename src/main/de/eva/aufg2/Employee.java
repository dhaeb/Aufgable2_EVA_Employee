package de.eva.aufg2;

public class Employee implements IPerson {

	private String firstName;
	private String lastName;
	private int id;
	private Integer salery;

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
		String salery = "Gehalt " + this.salery;
		return String.format("(%s, %s, %s, %s )", name, id, workload, salery);
	}

	@Override
	public int compareTo(IPerson o) { // Vergleiche Personen anhand des Gehaltes
		Integer saleryOfComparablePerson = o.getSalery();
		int comparisonResult = compareUsingSalery(saleryOfComparablePerson);
		return comparisonResult;
	}

	private int compareUsingSalery(Integer saleryOfComparablePerson) {
		int comparedResult = 0; // Ergebnis ist 0 wenn beide Personen das
								// gleiche Gehalt besitzen
		if (this.salery > saleryOfComparablePerson) // Ergebnis ist 1 wenn
													// Vergleichsperson
													// kleineres Gehalt besitzt
			comparedResult = 1;
		else if (this.salery < saleryOfComparablePerson)
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
	public Integer getSalery() {
		return salery;
	}

	@Override
	public void setSalery(Integer salery) {
		this.salery = salery;
	}

	public int getWorkingHoursPerWeek() {
		return workingHoursPerWeek;
	}

	public void setWorkingHoursPerWeek(int workingHoursPerWeek) {
		this.workingHoursPerWeek = workingHoursPerWeek;
	}
}
