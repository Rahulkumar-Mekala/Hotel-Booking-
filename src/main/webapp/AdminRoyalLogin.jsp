
<%@page import="RoyalRooms.royalBean"%>
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
<%royalBean adminBean = (royalBean)session.getAttribute("abean");
out.println(" Welcome Admin : "+adminBean.getBookingpersonname()+"<br>");
%>
<br>
<a href="Adminroyalciew" target="black"><button>AllRoyalViewDetails :</button></a> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;
<a href="AdminroyalLogout"> <button>AdminRoyalLogout</button></a>
</body>
</html>