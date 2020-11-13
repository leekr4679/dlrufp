<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String a = request.getParameter("number");
	out.println("단 : " + a + "<br>");
	int gugudan = Integer.parseInt(a);
	int count = 0;

	for (int i = 1; i < 10; i++) {
		out.println(gugudan + " x " + i + " = " + (gugudan * i) + "<br>");
		count++;
	}
	out.println(count + "개");
	%>
</body>
</html>