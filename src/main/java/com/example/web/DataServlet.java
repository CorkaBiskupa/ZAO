package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/data")
public class DataServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		String a=session.getAttribute("username").toString();
		out.println(
				 "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>"
			      +"<link href='default.css' rel='stylesheet' type='text/css'>" +
				"Hello  "+ a + "<br>" +
				"<a href='logout.jsp'>Logout</a><br><br>"+
				"<h1>Wybierz co chcesz zrobic z ksiazkami: </h1>"+
				"<a href=getBookData.jsp>Dodaj nowa ksiazke lub usun stare.</a><br>"+
				"<a href=showAllBooks.jsp>Pokaz ksiazki jakie juz sa.</a><br>"+
				"</body></html>");
		out.close();
	}

}
