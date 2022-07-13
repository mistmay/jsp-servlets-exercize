<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:useBean id="rotator" scope="application" class="controller.Rotator" />
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>AdRotator</title>
    <% rotator.nextAd(); %>
</head>

<body>
   <a href="<jsp:getProperty name="rotator" property="link" />">
       <img src="<jsp:getProperty name="rotator" property="image" />">
   </a>
</body>

</html>