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
		Connection conn = null;
		
		PreparedStatement  pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.90:1521/xe", "scott", "1234");
			out.println("연결성공");
			pstmt = conn.prepareStatement("insert into helloWorld " + "(name, age, remark) " + "values " + "('이겨레', 25, '학생')");
			pstmt.executeUpdate();
		} catch(Exception e) {
			out.println("연결실패");
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	%>
</body>
</html>