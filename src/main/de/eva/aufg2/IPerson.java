package de.eva.aufg2;

public interface IPerson extends Comparable<IPerson> {
	//public kann auch entfallen, da Schnittstellen nur �ffentliche Methoden enthalten
	
	//alle Methoden sind implizit abstract, da die Methoden erst in der realisierenden Klasse
	//implementiert werden
	
	public int getId();
	public void setId(int id);
	
	public Integer getSalary();				// für das Attribut "Gehalt" wird nicht der Basistyp int sondern
	public void setSalary(Integer salary);  // die Klasse Integer verwendet (demo: Integer verhält sich wie int)
	
	public String getFirstName(); 
	public String getLastName();
	
	public void setFirstName(String firstName);
	public void setLastName(String lastName);
}
