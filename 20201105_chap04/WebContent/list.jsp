<%@page import="com.grganzy2.www.src.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function doDelete(idx) {
		alert("삭제 완료" + idx);
		location.href="Update?idx=" + idx;
	}

	function doUpdate(idx) {
		alert("수정 완료" + idx);
//		location.href="delete?idx=" + idx;
	}
</script>
</head>
<body>
	<a href="index.html">메인화면</a>
	<p>회원목록</p>
	<table border="1">
		<tr>
			<th>이름</th>
			<th>성별</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>주소</th>
			<th>연락처</th>
			<th>이메일</th>
			<th>취미</th>
			<th>가입일자</th>
			<th>삭제</th>
		</tr>
		<%
			ArrayList<Member> al = (ArrayList<Member>) request.getAttribute("list");
		for (int i = 0; i < al.size(); i++) {
		%>
		<tr>
			<%
				out.println("<td>" + al.get(i).getName() + "</td>");
			out.println("<td>" + al.get(i).getGender() + "</td>");
			out.println("<td>" + al.get(i).getId() + "</td>");
			out.println("<td>" + al.get(i).getPassword() + "</td>");
			out.println("<td>" + al.get(i).getAddress() + "</td>");
			out.println("<td>" + al.get(i).getPhone() + "</td>");
			out.println("<td>" + al.get(i).getEmali() + "</td>");
			out.println("<td>" + al.get(i).getHobbyArray() + "</td>");
			out.println("<td>" + al.get(i).getRegdate() + "</td>");
			out.println("<td><button type = 'button' onclick = 'doDelete(" + al.get(i).getIdx() + ");'>삭제</td>");
			out.println("<td><button type = 'button' onclick = 'doUpdate(" + al.get(i).getIdx() + ");'>수정</td>");
			%>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>