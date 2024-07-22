<%@page import="AdminLogin.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%AdminBean adminBean = (AdminBean) session.getAttribute("abean");
out.println(" This Page Be long to "+adminBean.getUsername()+"<br>");
String msg= (String)request.getAttribute("msg");
out.println(msg);
%>
<br>
<a href="AllViewDetails" target="black"><button>AllViewDetails :</button></a> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;
<a href="AdminLogout" target="black"><button>AdminLogout</button></a>

</body>
</html>