package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	private String message;

	@Override
	public void init() throws ServletException {
		message = "hello";
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/plain");
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("plain text");
	}

	@Override
	public void destroy() {
	}
}
