package pk.edu.pucit.filterdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HitCountViewer
 */
public class HitCountView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HitCountView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ExtendedHttpServletRequestWrapper requestWrapper = (ExtendedHttpServletRequestWrapper)request;
		PrintWriter out = response.getWriter();
		String html = "";
		html += "<h1>Server has been hit "+requestWrapper.getHitCount()+" times.</h1>";
		out.println(html);
	}

}
