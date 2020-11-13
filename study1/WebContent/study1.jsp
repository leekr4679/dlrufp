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
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<style>
	h4 {
		display: inline-block;
	}
	
	name, gender, id, address, phoneNumber, email, hobby {
		display: inline-block;
	}
</style>
</head>
<body>
	<%
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String passwordCheck = request.getParameter("passwordCheck");
	String address = request.getParameter("address");
	String phoneNumber = request.getParameter("phoneNumber");
	String email = request.getParameter("email");
	String[] hobby = request.getParameterValues("hobby");
	String hobbyArray = "";
	
	/* while(true) {
		if(!password.equals(passwordCheck)) {
		 out.print("<script>alert(\"비밀번호가 일치하지 않습니다.\");</script>");
		} else {
			break;
		}
		
		if(password.length() < 5) {
			out.print("<script>alert(\"비밀번호는 5글자 이상이어야 합니다.\");</script>");
			return;
		} else {
			break;
		}
	} */

	 
	out.println("<h1>작성하신 내용은 아래와 같습니다.</h1><hr>");
	out.println("<h4>이름 : </h4>" + name + "<hr>");
	out.println("<h4>성별 : </h4>" + gender + "<hr>");
	out.println("<h4>아이디 : </h4>" + id + "<hr>");
	out.println("<h4>주소 : </h4>" + address + "<hr>");
	out.println("<h4>전화번호 : </h4>" + phoneNumber + "<hr>");
	out.println("<h4>이메일주소 : </h4>" + email + "<hr>");
	if (hobby != null) {
		out.println("<table>");
		out.println("<h4>취미 : </h4>");
		for (int i = 0; i < hobby.length; i++) {
			out.println("<tr>");
			out.println("<td>");
			out.println(hobby[i]);
			out.println("</td>");
			out.println("</tr>");
		}
		out.println("</table>");
	} else {
		out.println("<h4>[선택한 취미가 없습니다.]</h4>");
	}
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.90:1521:xe", "scott", "1234");
		pstmt = conn.prepareStatement("insert into memberchap04gr2 values(?,?,?,?,?,?,?,?,sysdate)");
		pstmt.setString(1, name);
		pstmt.setString(2, gender);
		pstmt.setString(3, id);
		pstmt.setString(4, password);
		pstmt.setString(5, address);
		pstmt.setString(6, phoneNumber);
		pstmt.setString(7, email);
		for (int i = 0; i < hobby.length; i++) {
			hobbyArray += hobby[i] + " ";
		}
		pstmt.setString(8, hobbyArray);
		pstmt.executeUpdate();
	} catch(Exception e) {
		e.printStackTrace();
	} finally{
		pstmt.close();
		conn.close();
	}
	%>
</body>
</html>