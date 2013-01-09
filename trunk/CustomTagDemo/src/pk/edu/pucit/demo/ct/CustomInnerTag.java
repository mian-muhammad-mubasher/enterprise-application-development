package pk.edu.pucit.demo.ct;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomInnerTag extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		JspWriter out = getJspContext().getOut();
		out.write("I am "+this.getClass().toString()+" and following is my body<br>");
		getJspBody().invoke(null);
	}
}
