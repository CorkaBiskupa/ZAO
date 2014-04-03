<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ksiazkomania</title>
</head>
<body>
<jsp:useBean id="book" class="com.example.servletjspdemo.domain.Book" scope="session" />

<jsp:setProperty name="book" property="*" /> 

<jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application" />

<% 
  storage.add(book);
%>

<p>Nastepujaca ksiazka została dodana: </p>
<p>Tytul: ${book.title} </p>
<p>Autor: ${book.author} </p>
<p>Rok wydania: <jsp:getProperty name="book" property="year"></jsp:getProperty></p>
<p>
  <a href="showAllBooks.jsp">Pokaz wszystkie ksiazki</a>
</p>
</body>
</html>