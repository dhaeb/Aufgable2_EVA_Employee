package de.eva.aufg2;

public interface Person extends Comparable<Person> {

	int getId();
	void setId(int id);
	String getFirstName();
	String getLastName();
	void setFirstName(String firstName);
	void setLastName(String lastName);
	
}
