package pk.edu.pucit.demo.customtag;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class NewYearTag extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		String html = "";
		JspContext context = getJspContext();
		JspWriter out = context.getOut();
		html += "<h1>Happy New Year</h1>";
		html += "<h2>May you have a very prosper life ahead and may you pass this course :P</h2>";
		out.write(html);
	}
	
}
