package pk.edu.pucit.demo.customtag;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class AnotherCustomTag extends SimpleTagSupport {

	private StringWriter sw = new StringWriter();
	
	private String by;

	public void setBy(String by) {
	      this.by = by;
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		getJspBody().invoke(sw);
		String html = "";
		JspContext context = getJspContext();
		JspWriter out = context.getOut();
		html += "<h1>"+by+" says:</h1>";
		html += "<h2>"+sw.toString()+"</h2>";
		out.write(html);
	}
	
}
