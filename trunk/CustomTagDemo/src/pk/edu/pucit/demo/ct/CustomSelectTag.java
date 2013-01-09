package pk.edu.pucit.demo.ct;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class CustomSelectTag extends SimpleTagSupport implements DynamicAttributes{

	HashMap<String, Object> dAttribs = new HashMap<String, Object>();
	
	@Override
	public void setDynamicAttribute(String arg0, String arg1, Object arg2)
			throws JspException {
		// TODO Auto-generated method stub
		dAttribs.put(arg1, arg2);
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		JspWriter out = getJspContext().getOut();
		out.write("<select name=\"myselect\">");
		for (Entry<String, Object> e : dAttribs.entrySet()) {
			out.write("<option value=\""+e.getKey()+"\">"+e.getValue().toString()+"</option>");
		}
		out.write("</select>");
	}

}
