<%@page import="Premiumrooms.preminumBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%  preminumBean bean=(preminumBean)application.getAttribute("preBean");
out.println(" Welcome to Preminum Booking Person name :  &nbsp; &nbsp"+bean.getBookingpersonname());%>
<a href="preminumview"><button>PreminumRoom  Booking Details</button></a>

</body>
</html>