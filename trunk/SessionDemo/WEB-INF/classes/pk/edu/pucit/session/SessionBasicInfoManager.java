package pk.edu.pucit.session;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionBasicInfoManager extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String occupation  = req.getParameter("occupation");
		String education = req.getParameter("education");
		
		HttpSession session = req.getSession(true);
		session.setAttribute("name", name);
		session.setAttribute("email", email);
		session.setAttribute("occupation", occupation);
		session.setAttribute("education", education);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>SessionBasicInfoManager</h3>");
		out.println("<form action=\"/sessionCVManager\" method=\"GET\">");
		out.println("<input type=\"submit\" value=\"Are you done?\">");
		out.println("</form>");
		out.println("<br>");
		out.println("<a href=\"/sessionCVManager\">Are you done?</a>");
		out.println("</body>");
		out.println("</html>");
	}
}