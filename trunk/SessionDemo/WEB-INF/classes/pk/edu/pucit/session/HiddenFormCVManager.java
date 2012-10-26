package pk.edu.pucit.session;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HiddenFormCVManager extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String occupation  = req.getParameter("occupation");
		String education = req.getParameter("education");
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>HiddenFormCVManager</h3>");
		out.println("<table border=\"1\">");
		out.println("<tr><td>Name</td><td>"+name+"</td></tr>");
		out.println("<tr><td>Email</td><td>"+email+"</td></tr>");
		out.println("<tr><td>Occupation</td><td>"+occupation+"</td></tr>");
		out.println("<tr><td>Education</td><td>"+education+"</td></tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}
}