<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String  fname =(String)request.getAttribute("fname");
String msg=(String) request.getAttribute("msg");
out.println("  this page belong to "+fname);
out.println(msg);%>
<a href="view" target="black"><button>viewProfile</button></a>&nbsp&nbsp&nbsp;
<a href="Logout" target="black"><button>Logout</button></a>
</body>
</html>