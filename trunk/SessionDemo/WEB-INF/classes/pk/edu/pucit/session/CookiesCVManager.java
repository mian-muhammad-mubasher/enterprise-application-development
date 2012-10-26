package pk.edu.pucit.session;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookiesCVManager extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		Cookie cookies[] = req.getCookies();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>CockiesCVManager</h3>");
		out.println("<table border=\"1\">");
		for(int i=0;i<cookies.length;++i){
			out.println("<tr><td>"+cookies[i].getName()+"</td><td>"+cookies[i].getValue()+"</td></tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}
}