package pk.edu.pucit.filterdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
/**
 * Servlet Filter implementation class AuthenticationManager
 */
public class AuthenticationManager implements Filter {

	String allowedRemoteAddresses[];
	private AtomicInteger count;
    /**
     * Default constructor. 
     */
    public AuthenticationManager() {
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
		String remoteAddress = request.getRemoteAddr();
		if(Arrays.binarySearch(this.allowedRemoteAddresses, remoteAddress)>=0){			
			if(((HttpServletRequest)request).getRequestURI().equals("/HitCountView")){
				ExtendedHttpServletRequestWrapper requestWrapper = new ExtendedHttpServletRequestWrapper((HttpServletRequest) request);
				requestWrapper.setHitCount(this.count.get());
				chain.doFilter(requestWrapper, response);
			}else{
				this.count.incrementAndGet();
				chain.doFilter(request, response);				
			}
		}else{
			response.setContentType("text/html");
			String errorMsg = "";
			PrintWriter out = response.getWriter();
			errorMsg += "<h3>Your Remote Location ("+remoteAddress+") is unauotherized to access this service.</h3>";
			out.write(errorMsg);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.allowedRemoteAddresses = fConfig.getInitParameter("allowedRemoteAddresses").split(",");
		Arrays.sort(this.allowedRemoteAddresses);
		this.count = new AtomicInteger(0);
	}

}
