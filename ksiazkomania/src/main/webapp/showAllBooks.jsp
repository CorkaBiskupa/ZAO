<%@page import="com.example.book.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ksiazkomania</title>
</head>
<body>

<jsp:useBean id="storage" class="com.example.service.StorageService" scope="application" />
<%
  for (Book book : storage.getAllBooks()) {
	  out.println("<p>Tytuł: " + book.getTitle() + "; Autor: " + book.getAuthor() + "; Rok wydania: " + book.getYear() + "</p>");
  }
%>
<p>
  <a href="getBookData.jsp">Dodaj nowa ksiazke.</a>
</p>

</body>
</html>