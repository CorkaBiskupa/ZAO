<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="default.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        
        if((username.equals("Niohacz") && password.equals("1234")))
            {
            session.setAttribute("username",username);
            response.sendRedirect("data");
            }
        else
            response.sendRedirect("index.jsp");
        %>
    </body>
</html>


