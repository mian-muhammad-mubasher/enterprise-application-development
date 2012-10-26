package pk.edu.pucit.session;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class URLRewriteBasicInfoManager extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String occupation  = req.getParameter("occupation");
		String education = req.getParameter("education");
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>URLRewriteBasicInfoManager</h3>");
		out.println("<a href=\"/urlRewriteCVManager?name="+name+"&email="+email+"&occupation="+occupation+"&education="+education+"\">Are you done?</a>");
		out.println("</body>");
		out.println("</html>");
	}
}