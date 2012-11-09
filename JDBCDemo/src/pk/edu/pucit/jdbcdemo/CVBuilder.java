package pk.edu.pucit.jdbcdemo;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CVView
 */
@WebServlet("/CVBuilder")
public class CVBuilder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CVBuilder() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	try {
			ResultSet rs = getCVs();
			PrintWriter out = response.getWriter();
			String html = "";
			html += "<html>";
			html += "<body>";
			html += "<table border=\"1\">";
			html += "<tr><th>Name</th><th>Email</th><th>Occupation</th><th>Education</th></tr>";
			while(rs.next()){
				html += "<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>";
			}
			html += "</table>";
			html += "</body>";
			html += "</html>";
			out.write(html);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String jdbcType = request.getParameter("jdbcType");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String occupation = request.getParameter("occupation");
		String education = request.getParameter("education");
		boolean status = false;
		try {
			saveCV(jdbcType, name, email, occupation, education);
			status = true; 
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter out = response.getWriter();
		String html = "";
		html += "<table border=\"1\">";
		html += "<tr>";
		html += "<td>";
		html += "Name";
		html += "</td>";
		html += "<td>";
		html += name;
		html += "</td>";
		html += "</tr>";
		html += "<tr>";
		html += "<td>";
		html += "Email";
		html += "</td>";
		html += "<td>";
		html += email;
		html += "</td>";
		html += "</tr>";
		html += "<tr>";
		html += "<td>";
		html += "occupation";
		html += "</td>";
		html += "<td>";
		html += occupation;
		html += "</td>";
		html += "</tr>";
		html += "<tr>";
		html += "<td>";
		html += "education";
		html += "</td>";
		html += "<td>";
		html += education;
		html += "</td>";
		html += "</tr>";
		html += "<tr>";
		html += "<td>";
		html += "jdbcType";
		html += "</td>";
		html += "<td>";
		html += jdbcType;
		html += "</td>";
		html += "</tr>";
		html += "</table>";
		if(status){
			html += "Data is successfully saved.";
		}else{
			html += "Data is NOT saved, failure.";
		}
		out.write(html);
	}
	
	private void saveCV(String jdbcType, String name, String email, String occupation, String education) throws ClassNotFoundException, SQLException{
//	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	    Connection con = DriverManager.getConnection("jdbc:odbc:JDBCDemo", "root", "root");
	    String query = "INSERT INTO CV (name, email, occupation, education) VALUES (?, ?, ?, ?)";
	    PreparedStatement preparedStatement = con.prepareStatement(query);
	    preparedStatement.setString(1, name);
	    preparedStatement.setString(2, email);
	    preparedStatement.setString(3, occupation);
	    preparedStatement.setString(4, education);
	    preparedStatement.execute();
	    con.close();
	}
	
	private ResultSet getCVs() throws ClassNotFoundException, SQLException{
//	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//		This Line no more needed read link below JDBC 4.0 Features heading
//		http://onjava.com/pub/a/onjava/2006/08/02/jjdbc-4-enhancements-in-java-se-6.html
	    Connection con = DriverManager.getConnection("jdbc:odbc:JDBCDemo", "root", "root");
	    String query = "SELECT * FROM CV";
	    Statement statement = con.createStatement();
	    ResultSet rs = statement.executeQuery(query);
	    return rs;
	}

}
