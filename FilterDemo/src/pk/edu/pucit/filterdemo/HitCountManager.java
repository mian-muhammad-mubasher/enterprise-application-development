package pk.edu.pucit.filterdemo;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class HitCountManager
 */
@WebFilter("/*")
public class HitCountManager implements Filter {

	private AtomicInteger count;
	
    /**
     * Default constructor. 
     */
    public HitCountManager() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		ExtendedHttpServletRequestWrapper requestWrapper = new ExtendedHttpServletRequestWrapper((HttpServletRequest) request);
		requestWrapper.setHitCount(this.count.incrementAndGet());
		chain.doFilter(requestWrapper, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.count = new AtomicInteger(0);
	}

}
