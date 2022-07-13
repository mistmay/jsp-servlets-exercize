<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>Get Jsp</title>
</head>

<body>
   <%
      String name = request.getParameter("firstName");
      if (name != null) {
   %>
   <h1>Hello <%= name %></h1>
   <%
       } else {
   %>
   <form action="Welcome.jsp" method="get">
       <input type="text" name="firstName" placeholder="Insert your Name">
       <button type="submit">Send</button>
   </form>
   <%
       }
   %>
</body>

</html>