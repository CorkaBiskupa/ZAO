<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
 
        session.removeAttribute("username");
        session.removeAttribute("password");
        session.invalidate();
        %>
        <h1><a href="index.jsp">Wylogowalismy cie!</a></h1>
         
    </body>
</html>


