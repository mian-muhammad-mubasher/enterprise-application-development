package pk.edu.pucit.ead.demo.struts.model;

import java.util.ArrayList;

public class EmployeeSearchService {


	/* Hard-coded sample data. Normally this would come from a real data
    source such as a database. */
	private static Employee[] employees = 
		{
		new Employee("Bob Davidson", "123-45-6789"),
		new Employee("Mary Williams", "987-65-4321"),
		new Employee("Jim Smith", "111-11-1111"),
		new Employee("Beverly Harris", "222-22-2222"),
		new Employee("Thomas Frank", "333-33-3333"),
		new Employee("Jim Davidson", "444-44-4444")
		};

	public ArrayList<Employee> searchByName(String name) {
		// TODO Auto-generated method stub
		ArrayList<Employee> resultList = new ArrayList<Employee>();

		for (int i = 0; i < employees.length; i++) {
			if(employees[i].getName().toUpperCase().indexOf(name.toUpperCase())!= -1){
				resultList.add(employees[i]);
			}
		}

		return resultList;
	}

	public ArrayList<Employee> searchBySsNum(String ssNum) {
		// TODO Auto-generated method stub
		ArrayList<Employee> resultList = new ArrayList<Employee>();

		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getSsNum().equals(ssNum)) {
				resultList.add(employees[i]);
			}
		}

		return resultList;
	}

}
