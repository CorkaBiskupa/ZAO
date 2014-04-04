
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ksiazkomania</title>
</head>
<body>
<jsp:useBean id="book" class="com.example.book.Book" scope="session" />



<jsp:useBean id="storage" class="com.example.service.StorageService" scope="application" />

<% int index = Integer.parseInt(request.getParameter("index"));
  storage.delete(index);
%>

<p>
	Ksiazke o indeksie: </p><%= request.getParameter("index") %> <p>pomyslnie usunieto.
  <a href="showAllBooks.jsp">Pokaz wszystkie ksiazki</a>
</p>
</body>
</html>