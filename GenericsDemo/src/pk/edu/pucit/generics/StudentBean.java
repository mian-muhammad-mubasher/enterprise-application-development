package pk.edu.pucit.generics;

import java.io.Serializable;

public class StudentBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1675917699351211760L;
	private String name;
	private String rollNumber;
	private float cgpa;
	private boolean passedOut;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	public boolean isPassedOut() {
		return passedOut;
	}
	public void setPassedOut(boolean passedOut) {
		this.passedOut = passedOut;
	}
}
