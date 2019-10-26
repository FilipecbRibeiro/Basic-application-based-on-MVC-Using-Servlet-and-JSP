<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
Home<br>
<a href="<%=request.getContextPath() %>/ServletTheController?page=Login.jsp">Login</a>
<br>
<a href="<%=request.getContextPath() %>/ServletTheController?page=SignUp.jsp">SignUp</a>
<br>
<a href="<%=request.getContextPath() %>/ServletTheController?page=About.jsp">About</a>
<br>
This was done to put in practice last concepts!
<br>
</body>
</html>