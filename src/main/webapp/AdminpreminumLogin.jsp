
<%@page import="Premiumrooms.preminumBean"%>
<%@page import="DeluxeRoom.DeluxeRoomBean"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%preminumBean adminBean = (preminumBean)session.getAttribute("abean");
out.println(" Welcome Admin : "+adminBean.getBookingpersonname()+"<br>");
%>
<br>
<a href="AdminpreminumLogin" target="black"><button>AllPreminumViewDetails :</button></a> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;
<a href="AdminpreminumLogout" target="black"><button>AdminpreminumLogout</button></a>
</body>
</html>