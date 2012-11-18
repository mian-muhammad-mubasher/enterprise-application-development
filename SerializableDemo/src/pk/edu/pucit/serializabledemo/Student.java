package pk.edu.pucit.serializabledemo;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1786490505248571402L;
	private String name;
	private String rollNumber;
	private Boolean passedOut;
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
	public Boolean isPassedOut() {
		return passedOut;
	}
	public void setPassedOut(Boolean passedOut) {
		this.passedOut = passedOut;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+this.name+" Roll Number: "+this.rollNumber+" Passed Out: "+this.passedOut;
	}
}
