package pk.edu.pucit.demo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class DataAccessManager {
	public static void saveStudent(Student s) throws SQLException{
		Connection con = DriverManager.getConnection("jdbc:odbc:MITF11MidTerm", "root", "root");
		String query = "INSERT INTO student (rollnumber, name, session, cgpa, passedout) VALUES (?, ?, ?, ?, ?)";
	    PreparedStatement preparedStatement = con.prepareStatement(query);
	    preparedStatement.setString(1, s.getRollNumber());
	    preparedStatement.setString(2, s.getName());
	    preparedStatement.setString(3, s.getSession());
	    preparedStatement.setFloat(4, s.getCgpa());
	    preparedStatement.setBoolean(5, s.isPassedOut());
	    preparedStatement.execute();
	    con.close();
	}
	
	public static Student getStudent(String rollNumber) throws SQLException{
		Student s = new Student();
	    Connection con = DriverManager.getConnection("jdbc:odbc:MITF11MidTerm", "root", "root");
	    String query = "SELECT * FROM student where rollnumber = ?";
	    PreparedStatement preparedStatement = con.prepareStatement(query);
	    preparedStatement.setString(1, rollNumber);
	    ResultSet rs = preparedStatement.executeQuery();
	    rs.next();
	    s.setRollNumber(rs.getString("rollNumber"));
	    s.setName(rs.getString("name"));
	    s.setSession(rs.getString("session"));
	    s.setCgpa(rs.getFloat("cgpa"));
	    s.setPassedOut(rs.getBoolean("passedout"));
	    con.close();
		return s;
	}
	
	public static String[] getAllRollNumber() throws SQLException{
		String retStrings[] = null;
		LinkedList<String> rnll = new LinkedList<String>();
		// rnll.add("MITF11M001"); this line will add a string in linked list
		Connection con = DriverManager.getConnection("jdbc:odbc:MITF11MidTerm", "root", "root");
		String query = "SELECT rollnumber FROM student";
		Statement statement = con.createStatement();
		ResultSet resultSet= statement.executeQuery(query);
		while(resultSet.next()){
			rnll.add(resultSet.getString("rollnumber"));
		}
		con.close();
		// Following two lines will populate array of string from linked list
		retStrings = new String[rnll.size()];
		retStrings = rnll.toArray(retStrings);
		return retStrings;
	}
}
