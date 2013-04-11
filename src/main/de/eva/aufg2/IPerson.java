package de.eva.aufg2;

public interface IPerson extends Comparable<IPerson> {
	public abstract int getId();
	public abstract void setId(int id);
	
	public Integer getSalery();
	public void setSalery(Integer salery);
	
	String getFirstName(); 
	String getLastName();
	
	void setFirstName(String firstName);
	void setLastName(String lastName);
}
