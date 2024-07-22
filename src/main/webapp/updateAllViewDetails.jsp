<%@page import="AdminLogin.AdminBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>

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

<th> Email :</th>
<th> PhoneNumber :</th>
</tr>
<tr>
<%AdminBean bean = (AdminBean)session.getAttribute("abean");
ArrayList<AdminBean> arrayList = (ArrayList<AdminBean>)session.getAttribute("alist");
out.println(" Page Belong to Admin "+bean.getUsername()+"<br>");

if(arrayList.size()==0){
	out.println(" Not Product Avalivable...<br>");
}
else{
	Iterator<AdminBean> iterator= arrayList.iterator();
	while(iterator.hasNext()){
		AdminBean adminBean= (AdminBean)iterator.next();
		out.println("<td>"+adminBean.getUsername()+"</td>"+"&nbsp&nbsp"+"<td>"+adminBean.getPassword()+"</td>"+"&nbsp&nbsp"+"<td>"+adminBean.getFirstname()+"</td>"+"&nbsp&nbsp"+"<td>"+adminBean.getLastname()+"</td>"+"&nbsp&nbsp"+"<td>"+adminBean.getEmail()+"</td>"+"&nbsp&nbsp"+"</td>"+"<td>"+adminBean.getPhonenumber()+"</td>"+"&nbsp&nbsp"+"<td>&nbsp&nbsp"+"<a href ='updateedit?Email="+adminBean.getEmail()+"'><button>UpdateEdit</button></a>"+"&nbsp&nbsp"+"<a href = 'UpdateDeletepage?Email="+adminBean.getEmail()+"'><button>UpDateDelete</button></a>&nbsp&nbsp;<br>"+"</td>");
	}
}
%>
</tr>
</table>
<br>
<a href="AdminLogout" target="black"><button>AdminLogout</button></a>
</body>
</html>