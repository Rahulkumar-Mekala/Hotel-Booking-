
<%@page import="Premiumrooms.preminumBean"%>
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
<%preminumBean adminBean = (preminumBean) session.getAttribute("abean");
out.println(" This Page Be long to "+adminBean.getBookingpersonname()+"<br>");
String msg= (String)request.getAttribute("msg");
out.println(msg);
%>
<br>
<a href="AdminpreminumLogin" target="black"><button>AllPreminumViewDetails :</button></a> 
<a href="AdminpreminumLogout" target="black"><button>AdminpreminumLogout</button></a>

</body>
</html>