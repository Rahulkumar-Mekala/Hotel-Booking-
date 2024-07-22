
<%@page import="DeluxeRoom.DeluxeRoomBean"%>
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
<style type="text/css">
body {
text-align: center;
	background:  silver;
	padding: 20px;
	
}
.edit{
 
background:  white;
margin-left: 400px;
margin-right: 400px;
padding: 50px;
border-radius: 20px;
}
.button {
	background: white;
	color: black;
	border-radius:20px; 
}
.button:hover {
background: blue;
	color: white;
	
}
</style>
<div class="edit">
<h2> Delete DeluxeRoomS Profile Details : </h2>
<%DeluxeRoomBean deluxeRoomBean = (DeluxeRoomBean)session.getAttribute("abean");
out.println(" This Page To Admin : "+deluxeRoomBean.getBookingpersonname()+"<br>");
DeluxeRoomBean bean = (DeluxeRoomBean)request.getAttribute("ubean");
%>'
<br>
<form action="admineDeluxedelete" method="post">

<label>PhoneNumber : </label>
<input type="text" name="phonenumber" value=<%=bean.getPhonenumber()%>><br><br>
<input  class="button" type="submit" value="DeleteDetails">
</form>
</div>
</body>
</html>