package de.eva.aufg2;

public interface IPerson extends Comparable<IPerson> {
	//public kann auch entfallen, da Schnittstellen nur öffentliche Methoden enthalten
	
	//alle Methoden sind implizit abstract, da die Methoden erst in der realisierenden Klasse
	//implementiert werden
	
	public int getId();
	public void setId(int id);
	
	public int getSalary();				
	public void setSalary(int salary);  
	
	public String getFirstName(); 
	public String getLastName();
	
	public void setFirstName(String firstName);
	public void setLastName(String lastName);
}
