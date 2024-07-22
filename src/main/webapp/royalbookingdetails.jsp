<%@page import="RoyalRooms.royalBean"%>
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
<% royalBean royalBean =(royalBean)application.getAttribute("royalBean");
    String str=(String) request.getAttribute("fname");
    out.println(" Page belong "+str+"<br>");
    out.println("<tr>"+"<td>"+royalBean.getRoomname()+"</td>"+"&nbsp&nbsp"+"<td>"+royalBean.getPrice()+"</td>"+"&nbsp&nbsp"+"<td>"+royalBean.getBookingpersonname()+"</td>"+"&nbsp&nbsp"+"<td>"+royalBean.getPhonenumber()+"</td>"+"&nbsp&nbsp"+"<td>"+royalBean.getCheckin()+"</td>"+"&nbsp&nbsp"+"<td>"+royalBean.getCheckout()+"&nbsp&nbsp"+"</td>"+"</tr>"+"</table>"+"<br>"+"<a href='RoyalBookingDetailsLayout'><Button>RoyalBookingDetailsLayout</Button></a>");
    %>
    
</body>
</html>