import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;


public class HelloWorldGenericServlet extends GenericServlet {

  public void service(ServletRequest request, ServletResponse response)
        throws ServletException, IOException {

       // do something in here
	   response.getWriter().write(
        "<html><body>Generic Servlet is saying Hello World</body></html>");
  }
}