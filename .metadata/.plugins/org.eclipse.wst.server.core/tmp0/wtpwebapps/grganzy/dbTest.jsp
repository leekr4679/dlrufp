<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GRGANZY</title>
</head>
<body>
	<%
		//DB 연결 유지 객체
	Connection conn = null;
	//DB sql 작성 객체
	PreparedStatement pstmt = null;

	try {
		//ojdbc6.jar 파일 추가 확인
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.90:1521/xe", "scott", "1234");
		out.println("연결성공");
		pstmt = conn.prepareStatement("insert into helloWorld " + "(name, age, remark) " + "values " + "('이겨레', 25, '학생')");
		pstmt.executeUpdate();
	} catch (Exception e) {
		out.println("연결 실패");
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