<%@page import="RoyalRooms.royalBean"%>
<%@page import="Premiumrooms.preminumBean"%>
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

<%royalBean bean = (royalBean)session.getAttribute("abean");
ArrayList<royalBean> arrayList = (ArrayList<royalBean>)session.getAttribute("alist");
out.println(" Page Belong to Admin "+bean.getBookingpersonname()+"<br>");

if(arrayList.size()==0){
	out.println(" Not Product Avalivable...<br>");
}
else{
	Iterator<royalBean> iterator= arrayList.iterator();
	while(iterator.hasNext()){
		royalBean royalBean= (royalBean)iterator.next();
		out.println("<tr>"+"<td>"+royalBean.getRoomname()+"&nbsp&nbsp"+"</td>"+"<td>"+royalBean.getPrice()+"&nbsp&nbsp"+"</td>"+"<td>"+royalBean.getBookingpersonname()+"</td>"+"&nbsp&nbsp"+"<td>"+royalBean.getPhonenumber()+"</td>"+"&nbsp&nbsp&nbsp&nbsp"+"<td>"+"&nbsp&nbsp&nbsp"+"<a href ='updateroyaledit?name="+royalBean.getBookingpersonname()+ "'><button>UpdateEdit</button></a>"+"&nbsp&nbsp"+"<a href ='updateroyaldelete?name="+royalBean.getBookingpersonname()+"'><button>DeluxeDelete</button></a>"+"&nbsp&nbsp&nbsp&nbsp"+"</td>"+"</tr>"+"<br><br>");
	}
}
%>
</table>
<br>
<a href="AdminroyalLogout" target="black"><button>AdminRoyalLogout</button></a>
</body>
</html>