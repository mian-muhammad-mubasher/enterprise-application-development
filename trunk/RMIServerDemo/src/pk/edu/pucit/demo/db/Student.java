package pk.edu.pucit.demo.db;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6802206066946704295L;
	private String rollNumber;
	private String name;
	private String session;
	private float cgpa;
	private boolean passedOut;
	
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
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
	
	@Override
	public String toString() {
		String retString = "";
		retString+= "Roll Number: "+this.getRollNumber() + System.getProperty("line.separator");
		retString+= "Name: "+this.getName() + System.getProperty("line.separator");
		retString+= "Session: "+this.getSession() + System.getProperty("line.separator");
		retString+= "CGPA: "+this.getCgpa() + System.getProperty("line.separator");
		retString+= "Passed Out: "+this.isPassedOut() + System.getProperty("line.separator");
		return retString;
	}

}
