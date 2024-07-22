
<%@page import="Register.Userbean"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
table, th, td {
  border:1px solid black;
}
</style>
<table>
<tr>
<th> UserName :</th>
<th> Password :</th>
<th> FirstName :</th>
<th> LastName :</th>
<th> Address :</th>
<th> Email :</th>
<th> PhoneNumber :</th>
</tr>

<% Userbean userBean =(Userbean)application.getAttribute("ubean");
    String str=(String) request.getAttribute("fname");
    out.println(" Page belong : "+str);
    out.println("<tr>"+"<td>"+userBean.getUsername()+"</td>"+"&nbsp&nbsp"+"<td>"+userBean.getPassword()+"</td>"+"&nbsp&nbsp"+"<td>"+userBean.getFristname()+"</td>"+"&nbsp&nbsp"+"<td>"+userBean.getLastname()+"</td>"+"&nbsp&nbsp"+"<td>"+userBean.getAddress()+"</td>"+"&nbsp&nbsp"+"<td>"+userBean.getEmail()+"</td>"+"&nbsp&nbsp"+"<td>"+userBean.getPhone()+"</td>"+"&nbsp&nbsp"+"</tr>"+"</table>"+"<br>"+"<a href = 'edit' target='black'><button> Edit</button></a>");
    %>
   &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;
<a href="Logout" target="black"><button>Logout</button></a>

   
</body>
</html>