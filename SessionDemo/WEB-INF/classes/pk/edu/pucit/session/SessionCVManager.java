package pk.edu.pucit.session;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionCVManager extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		HttpSession session = req.getSession(true);
		String name = (String)session.getAttribute("name");
		String email = (String)session.getAttribute("email");
		String occupation = (String)session.getAttribute("occupation");
		String education = (String)session.getAttribute("education");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>SessionCVManager</h3>");
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