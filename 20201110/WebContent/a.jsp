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
		String filename = request.getParameter("file");
	if (filename != null) {
		if (filename.equals("b")) {
			response.sendRedirect("b.jsp");
		} else if (filename.equals("c")) {
			response.sendRedirect("c.jsp");
		}
	} else {
		out.println("어떤 페이지로 아동할 건지 파라메타로 남겨주세요.");
	}
	%>
</body>
</html>