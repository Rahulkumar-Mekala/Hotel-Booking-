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
<br>
<table>
<tr>
<th> Type Of Room :</th>
<th> Price ₹ :</th>
<th> Booking Person Name :</th>
<th> Phonenumber :</th>
<th> Date of Checking </th>
<th> Date of Checkout</th>

</tr>
<% DeluxeRoomBean  deluxeRoomBean =(DeluxeRoomBean)application.getAttribute("DelBean");
    String str=(String) request.getAttribute("fname");
    out.println(" Page belong "+str+"<br><br>");
    
    out.println("<tr>"+"<td>"+deluxeRoomBean.getRoomname()+"</td>"+"&nbsp&nbsp"+"<td>"+deluxeRoomBean.getPrice()+"</td>"+"&nbsp&nbsp"+"<td>"+deluxeRoomBean.getBookingpersonname()+"</td>"+"&nbsp&nbsp"+"<td>"+deluxeRoomBean.getPhonenumber()+"</td>"+"&nbsp&nbsp"+"<td>"+deluxeRoomBean.getCheckin()+"</td>"+"&nbsp&nbsp"+"<td>"+deluxeRoomBean.getCheckout()+"</td>"+"&nbsp&nbsp"+"</table>"+"<br><br>"+"<a href ='deluxeBookingDetailsLayout'><Button>DeluxeBookingDetailsLayout</Button</a>"+"<br>");
   
    %>
    
 
</body>
</html>