package pk.edu.pucit.demo.ct;

import java.io.IOException;

import javax.servlet.jsp.JspException;
//import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyFragmentTag extends SimpleTagSupport {
	private int count;
	private JspFragment html;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public JspFragment getHtml() {
		return html;
	}
	
	public void setHtml(JspFragment html) {
		this.html = html;
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		//JspWriter out = getJspContext().getOut();
		for(int i=0;i<count;++i){
			html.invoke(null);
		}
	}
	
}
