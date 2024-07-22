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
<style>
table, th, td {
  border:1px solid black;
}
</style>
<table>
<tr>
<th> Type Of Room :</th>
<th> Price ₹ :</th>
<th> Booking Person Name :</th>
<th> Phonenumber :</th>
<th> Date of Checking </th>
<th> Date of Checkout</th>

</tr>
<% preminumBean  preminumBean =(preminumBean)application.getAttribute("preBean");
    String str=(String) request.getAttribute("fname");
    out.println(" Page belong "+str+"<br>");
    out.println("<tr>"+"<td>"+preminumBean.getRoomname()+"</td>"+"&nbsp&nbsp"+"<td>"+preminumBean.getPrice()+"</td>"+"&nbsp&nbsp"+"<td>"+preminumBean.getBookingpersonname()+"</td>"+"&nbsp&nbsp"+"<td>"+preminumBean.getPhonenumber()+"</td>"+"&nbsp&nbsp"+"<td>"+preminumBean.getCheckin()+"</td>"+"&nbsp&nbsp"+"<td>"+preminumBean.getCheckout()+"</td>"+"</tr>"+"</table>"+"&nbsp&nbsp"+"<br>"+"<a href='preminumBookingDetailsLayout'><button>PreminumBookingDetailsLayout</button></a>"+"<br>");
    
    %>
    
</body>
</html>