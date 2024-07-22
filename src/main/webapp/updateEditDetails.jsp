
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
<h2> Update  Admin Profile Details : </h2>

<%AdminBean adminBean = (AdminBean)session.getAttribute("abean");
out.println(" This Page To Admin : "+adminBean.getFirstname()+"<br>");
AdminBean bean = (AdminBean)request.getAttribute("ubean");
%>
<form action="adminupdate" method="post">
<br>
<label>UserName : </label>
<input type="text" name="username" value=<%=bean.getUsername()%>><br><br>
<label> Password :</label>
<input type="password" name= "password" value=<%=bean.getPassword() %>><br><br>
<label>FristName :</label>
<input type="text" name="firstname" value=<%=bean.getFirstname() %>><br><br>
<label>LastName : </label>
<input type="text" name="lastname" value=<%=bean.getLastname() %>><br><br>
<label>Address : </label>
<input type="text" name="Address" value=<%=bean.getAddress() %>><br><br>
<label>EmailAddress :</label>
<input type="email" name="emailAddress" value=<%=bean.getEmail() %>><br><br>
<input class="button" type="submit" value="UpdateDetails">

</form>
</div>
</body>
</html>