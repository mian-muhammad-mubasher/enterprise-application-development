package pk.edu.pucit.demo.pattern.FC;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -527015506567399529L;

	/** Processes requests for both HTTP  
	 * <code>GET</code> and <code>POST</code> methods.
	 * @param request servlet request
	 * @param response servlet response
	 */
	protected void processRequest(HttpServletRequest 
			request, HttpServletResponse response)
					throws ServletException, java.io.IOException {
		String page;
		
		RequestHelper helper = new RequestHelper(request);

		page = helper.getRequiredPage();

		// dispatch control to view
		dispatch(request, response, page);
	}

	/** Handles the HTTP <code>GET</code> method.
	 * @param request servlet request
	 * @param response servlet response
	 */
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response)
					throws ServletException, java.io.IOException {
		processRequest(request, response);
	}

	/** Handles the HTTP <code>POST</code> method.
	 * @param request servlet request
	 * @param response servlet response
	 */
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response)
					throws ServletException, java.io.IOException {
		processRequest(request, response);
	}

	protected void dispatch(HttpServletRequest request, 
			HttpServletResponse response,
			String page) 
					throws  javax.servlet.ServletException, 
					java.io.IOException {
		RequestDispatcher dispatcher = 
				getServletContext().getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}
}