
<%@page import="RoyalRooms.royalBean"%>
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
<h2> Update  royal Profile Details : </h2>
<%royalBean adminBean = (royalBean)session.getAttribute("abean");
out.println(" This Page To Admin : "+adminBean.getBookingpersonname()+"<br>");
royalBean bean = (royalBean)request.getAttribute("ubean");
%>
<form action="admineroyaldelete" method="post">
<br>
<label>PhoneNumber : </label>
<input type="text" name="phonenumber" value=<%=bean.getPhonenumber()%>><br><br>
<input class="button" type="submit" value="DeleteDetails">
</form>
</div>
</body>
</html>