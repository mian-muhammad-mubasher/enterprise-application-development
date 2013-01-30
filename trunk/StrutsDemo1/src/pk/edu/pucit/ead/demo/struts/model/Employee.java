package pk.edu.pucit.ead.demo.struts.model;

public class Employee {

	private String name; 
	private String ssNum;
	
	public Employee(String name, String ssNum) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.ssNum = ssNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsNum() {
		return ssNum;
	}

	public void setSsNum(String ssNum) {
		this.ssNum = ssNum;
	}

}
