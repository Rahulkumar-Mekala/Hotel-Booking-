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

<%preminumBean bean = (preminumBean)session.getAttribute("abean");
ArrayList<preminumBean> arrayList = (ArrayList<preminumBean>)session.getAttribute("alist");
out.println(" Page Belong to Admin "+bean.getBookingpersonname()+"<br><br>");

if(arrayList.size()==0){
	out.println(" Not Product Avalivable...<br>");
}
else{
	Iterator<preminumBean> iterator= arrayList.iterator();
	while(iterator.hasNext()){
		preminumBean preminumBean= (preminumBean)iterator.next();
		out.println("<tr>"+"<td>"+preminumBean.getRoomname()+"&nbsp&nbsp"+"</td>"+"<td>"+preminumBean.getPrice()+"&nbsp&nbsp"+"</td>"+"<td>"+preminumBean.getBookingpersonname()+"&nbsp&nbsp"+"</td>"+"<td>"+preminumBean.getPhonenumber()+"&nbsp&nbsp"+"</td>"+"<td>"+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+"<a href ='preminumupdateedit?name="+preminumBean.getBookingpersonname()+"'><button>UpdateEdit</button></a>"+"&nbsp&nbsp"+"<a href ='preminumupdatedelete?name="+preminumBean.getBookingpersonname()+"'><button>Deluxepreminum</button></a>"+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+"<br><br>"+"</td>"+"</tr>");
	}
}
%>


</table>
<br>
<a href="AdminpreminumLogout" target="black"><button>AdminpreminumLogout</button></a>
</body>
</html>