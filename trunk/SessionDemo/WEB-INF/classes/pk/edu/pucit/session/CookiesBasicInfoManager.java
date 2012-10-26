package pk.edu.pucit.session;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookiesBasicInfoManager extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String occupation  = req.getParameter("occupation");
		String education = req.getParameter("education");
		
		Cookie nameCookie = new Cookie("name", name);
		Cookie emailCookie = new Cookie("email", email);
		Cookie occupationCookie = new Cookie("occupation", occupation);
		Cookie educationCookie = new Cookie("education", education);
		
		res.addCookie(nameCookie);
		res.addCookie(emailCookie);
		res.addCookie(occupationCookie);
		res.addCookie(educationCookie);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>CockiesBasicInfoManager</h3>");
		out.println("<form action=\"/cookiesCVManager\" method=\"GET\">");
		out.println("<input type=\"submit\" value=\"Are you done?\">");
		out.println("</form>");
		out.println("<br>");
		out.println("<a href=\"/cookiesCVManager\">Are you done?</a>");
		out.println("</body>");
		out.println("</html>");
	}
}