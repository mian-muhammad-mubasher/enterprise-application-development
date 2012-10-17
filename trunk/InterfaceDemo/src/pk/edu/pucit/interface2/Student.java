package pk.edu.pucit.interface2;

public class Student implements Comparable<Student> {

	private String rollNumber;
	
	public Student(String rollNumber){
		this.setRollNumber(rollNumber);
	}
	
	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		return this.rollNumber.compareTo(arg0.rollNumber);
	}

	private String getRollNumber() {
		return rollNumber;
	}

	private void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public String toString(){
		return this.getRollNumber();
	}

}
