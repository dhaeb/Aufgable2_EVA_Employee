package de.eva.aufg2;

public interface IPerson extends Comparable<IPerson> {
	public abstract int getId();
	public abstract void setId(int id);
	
	public Integer getSalary();
	public void setSalary(Integer salary);
	
	String getFirstName(); 
	String getLastName();
	
	void setFirstName(String firstName);
	void setLastName(String lastName);
}
