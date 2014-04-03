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
		
		/*String selectedGender = "";
		for (String gender : request.getParameterValues("gender")) {
			selectedGender += gender + " ";
		}*/
		HttpSession session = request.getSession();
		out.println("<html><body><h2>Twoje dane: </h2>" +
				"<p>Imie: " + session.getAttribute("theName") + "<br />" +
				//"<p>Płeć: " + selectedGender + "<br />" +
				"<br>"+"<br>"+"<br>"+"<br>"+
				"<h1>Wybierz co chcesz zrobic z ksiazkami: </h1>"+
				"<a href=getBookData.jsp>Dodaj nowa ksiazke.</a>"+
				"</body></html>");
		out.close();
	}

}
