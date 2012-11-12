package pk.edu.pucit.filterdemo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;


public class ExtendedHttpServletRequestWrapper extends
		HttpServletRequestWrapper {

	private int hitCount;
	
	public ExtendedHttpServletRequestWrapper(HttpServletRequest request) {
		super(request);
		// TODO Auto-generated constructor stub
	}

	public int getHitCount() {
		return hitCount;
	}

	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}

}
