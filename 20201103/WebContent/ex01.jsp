<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
		<%
			int a = 10;
		int b;
		b = 11;

		out.println("a = " + a + "<br>");
		out.println("b = " + b + "<br>");

		out.println(a + " + " + b + " = " + (a + b));
		%>
	</h1>
	
</body>
</html>