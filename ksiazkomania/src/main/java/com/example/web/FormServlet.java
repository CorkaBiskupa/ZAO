package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;

@WebServlet(urlPatterns = "/form")
public class FormServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body><h2>Simple form servlet</h2>" +
				"<FORM action=data>"+
		"What's your name? <INPUT TYPE=TEXT NAME='username' SIZE=20>"+
		"<P><INPUT TYPE=SUBMIT>"+
				"</body></html>");
		HttpSession session = request.getSession();
		String name = request.getParameter("username");
		session.setAttribute("theName", name);
		out.close();
	}

}
