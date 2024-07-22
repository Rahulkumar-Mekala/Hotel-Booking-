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
<% DeluxeRoomBean bean=(DeluxeRoomBean) application.getAttribute("DelBean");
out.println(" Welcome to User &nbsp&nbsp"+bean.getBookingpersonname());%>
<a href="deluxeview" target="black">&nbsp&nbsp&nbsp <button>DeluxeRoom Booking Details</button></a>

</body>
</html>