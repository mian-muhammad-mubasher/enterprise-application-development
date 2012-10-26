package pk.edu.pucit.session;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HiddenFormBasicInfoManager extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String occupation  = req.getParameter("occupation");
		String education = req.getParameter("education");
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>HiddenFormBasicInfoManager</h3>");
		out.println("<form action=\"/hiddenFormCVManager\" method=\"GET\">");
		out.println("<input type=\"hidden\" name=\"name\" value=\""+name+"\">");
		out.println("<input type=\"hidden\" name=\"email\" value=\""+email+"\">");
		out.println("<input type=\"hidden\" name=\"occupation\" value=\""+occupation+"\">");
		out.println("<input type=\"hidden\" name=\"education\" value=\""+education+"\">");
		out.println("<input type=\"submit\" value=\"Are you done?\">");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
}