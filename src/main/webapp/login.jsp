<%@page import="Register.Userbean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% Userbean userbean= (Userbean) application.getAttribute("ubean");
out.println(userbean.getUsername());%>
<br><br>

<a href="view" target="black"><button>View Profile</button></a>
<br><br>
<a href="Home.html" target="black"><button>Welcome to App</button></a>
</body>
</html>