<%@page import="java.sql.Array"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
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
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String passwordCheck = request.getParameter("passwordCheck");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String hobbyArray = request.getParameter("hobbyArray");


	if (hobbyArray != null) {
		out.println("<html>");
		out.println("<head>");
		out.println("<style>table{ border: 1px solid black; } </style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>작성하신 내용은 아래와 같습니다.</h1>");
		out.println("<hr>");
		out.println("이름 : " + name);
		out.println("<hr>");
		out.println("성별 : " + gender);
		out.println("<hr>");
		out.println("아이디 : " + id);
		out.println("<hr>");
		out.println("주소 : " + address);
		out.println("<hr>");
		out.println("전화번호 : " + phone);
		out.println("<hr>");
		out.println("이메일 주소 : " + email);
		out.println("<hr>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td>");
		out.println("취미 : " + hobbyArray);
		out.println("</td>");
		out.println("</tr>");
		out.println("</table>");
	} else {
		out.println("<html>");
		out.println("<head>");
		out.println("<style>table{ border: 1px solid black; } </style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>작성하신 내용은 아래와 같습니다.</h1>");
		out.println("<hr>");
		out.println("이름 : " + name);
		out.println("<hr>");
		out.println("성별 : " + gender);
		out.println("<hr>");
		out.println("아이디 : " + id);
		out.println("<hr>");
		out.println("주소 : " + address);
		out.println("<hr>");
		out.println("전화번호 : " + phone);
		out.println("<hr>");
		out.println("이메일 주소 : " + email);
		out.println("<hr>");
		out.println("선택한 취미가 없습니다.");
	}

	%>
</body>
</html>