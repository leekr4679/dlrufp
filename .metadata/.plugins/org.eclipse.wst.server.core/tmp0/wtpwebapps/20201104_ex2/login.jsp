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
	String id = request.getParameter("id");
	String pwd = request.getParameter("password");
	
	if(id.equals("admin") && pwd.equals("1234")) {
		out.println("로그인 성공");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.90:1521:xe","scott","1234");
			pstmt = conn.prepareStatement("insert into lalala values(?,?)");
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			pstmt.close();
			conn.close();
		}
	} else {
		out.println("로그인 실패");
	}
%>

</body>
</html>