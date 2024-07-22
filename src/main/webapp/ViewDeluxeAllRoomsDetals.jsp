<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
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

</tr>
<%DeluxeRoomBean bean = (DeluxeRoomBean)session.getAttribute("abean");
ArrayList<DeluxeRoomBean> arrayList = (ArrayList<DeluxeRoomBean>)session.getAttribute("alist");
out.println(" Page Belong to Admin "+bean.getBookingpersonname()+"<br>");

if(arrayList.size()==0){
	out.println(" Not Product Avalivable...<br>");
}
else{
	Iterator<DeluxeRoomBean> iterator= arrayList.iterator();
	while(iterator.hasNext()){
		DeluxeRoomBean deluxeRoomBean= (DeluxeRoomBean)iterator.next();
		out.println("<tr>"+"<td>"+deluxeRoomBean.getRoomname()+"&nbsp&nbsp"+"</td>"+"<td>"+deluxeRoomBean.getPrice()+"&nbsp&nbsp"+"</td>"+"<td>"+deluxeRoomBean.getBookingpersonname()+"&nbsp&nbsp"+"</td>"+"<td>"+deluxeRoomBean.getPhonenumber()+"&nbsp&nbsp"+"</td>"+"<td>&nbsp&nbsp&nbsp"+"<a href ='updatedeluxeedit?name="+deluxeRoomBean.getBookingpersonname()+"'><button>UpdateEdit</button></a>"+"&nbsp&nbsp"+"<a href ='updatedeluxedelete?name="+deluxeRoomBean.getBookingpersonname()+"'><button>DeluxeDelete</button></a>"+"&nbsp&nbsp&nbsp"+"</td>"+"</tr>"+"<br><br>");
	}
}
%>
</table>
<br>
<a href="AdminDeluxeLogout" target="black "><button>AdminDeluxeLogout</button></a>
</body>
</html>