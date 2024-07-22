<%@page import="RoyalRooms.royalBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% royalBean bean=(royalBean)application.getAttribute("royalBean");
out.println( " Welcome to Royal Room Booking Person name &nbsp &nbsp"+bean.getBookingpersonname());%>
<a href="royalview" target="black"><button> RoyalRoom Booking Details</button> </a>
</body>
</html>