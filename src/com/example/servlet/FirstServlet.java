package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet{
	private String message;
	
	@Override
	public void init() throws ServletException {
		message="My First Servlet";
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String pass = req.getParameter("pwd");
		PrintWriter writer=resp.getWriter();
		writer.write("name is"+name+" password is "+ pass);
		resp.setContentType("text/html");
		
		HttpSession httpSession=req.getSession();
		httpSession.setAttribute("username", "reema");
		String user=(String)httpSession.getAttribute("username");
		System.out.println(user);
		resp.setHeader("header", "header-value");
		PrintWriter printWriter=resp.getWriter();
		printWriter.write("<h1>This is a html text</h1>");
		printWriter.write("<h2>This is a html text</h2>");
	}
	@Override
	public void destroy() {
	}

}
