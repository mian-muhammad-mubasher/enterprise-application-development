package pk.edu.pucit.demo.pattern.FC;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

public class RequestHelper {

	HttpServletRequest request;
	public RequestHelper(HttpServletRequest request) {
		// TODO Auto-generated constructor stub
		this.request = request;
	}

	public String getRequiredPage() {
		// TODO Auto-generated method stub
		String retval = null;
		Pattern p = Pattern.compile("^/c/(?<page>.*)");
		Matcher m = p.matcher(request.getRequestURI());
		if (m.matches()){			
			retval = m.group("page");
			retval = "/WEB-INF/Views/"+retval;
			return retval;
		}
		return retval;
	}

}
