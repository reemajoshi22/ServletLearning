package com.example.servlet;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstFilterClass implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init of filter");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		String myParam=request.getParameter("myParam");
		System.out.println("inside filter");
		/*if(!"blockTheRequest".equals(myParam)){
			chain.doFilter(request, response);
	    }*/
		
	}

	@Override
	public void destroy() {
		
	}

}
