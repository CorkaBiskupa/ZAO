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
		out.println("<html><body><h2>Wpisz swoje imie, bo chcemy Cie poznac: </h2>" +
				"<form action=data>"+
				"Wpisujesz czy nie? "
				+ "<input type=text name='username' size=20>"+
		"<P><input type=submit value=wysylaj>"+
				"</body></html>");
		HttpSession session = request.getSession();
		String name = request.getParameter("username");
		session.setAttribute("theName", name);
		out.close();
	}

}
