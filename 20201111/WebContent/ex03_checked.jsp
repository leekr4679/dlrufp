<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = (String)session.getAttribute("id");
    	String password = (String)session.getAttribute("password");
    	
    	out.println("id : " + id);
    	out.println("password : " + password);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	아이디 : admin, 비밀번호 : 1234 로 로그인 해야합니다.
</body>
</html>