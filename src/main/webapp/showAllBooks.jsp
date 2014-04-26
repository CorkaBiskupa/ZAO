<%@page import="com.example.book.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="default.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ksiazkomania</title>
</head>
<body>

<jsp:useBean id="storage" class="com.example.service.StorageService" scope="application" />
<%
		int i=0;
 		 for (Book book : storage.getAllBooks()) {
			out.println("<p>Numer: " + i + " Tytuł: " + book.getTitle() + "; Autor: " + book.getAuthor() + "; Rok wydania: " + book.getYear() + "</p>");
 		 i++;
 		 }
  
%>
<p>
  <a href="getBookData.jsp">Dodaj nowa ksiazke lub usun jakas.</a>  
</p>

</body>
</html>