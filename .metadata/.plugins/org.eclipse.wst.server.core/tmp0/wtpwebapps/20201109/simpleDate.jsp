<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="include.html"%>
	<%@ include file="include.jsp"%>
	<%
		// include 한번더

	// taglib 지시자 -> jar 관리하는 회사 : maven	

	// 매서드 선언과 <%= 스크립틀릿

	//오전에 연습문제

	//오후에는 oracle 진행

	/*
	DB연결 객체
	Connection
	PrepareStatement
	ResultSet
	*/
	Date today = new Date();
	out.println("today : " + today + "<br>");
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/mm/dd");
	SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss a");

	out.println("sdf1 : " + sdf1.format(today));
	out.println("sdf2 : " + sdf2.format(today));
	%>
</body>
</html>