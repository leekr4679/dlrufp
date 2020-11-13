<%@page import="com.grganzy2.www.src.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% Member member = (Member)request.getAttribute("member"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.identify {
		display: inline-block;
	}
</style>
</head>
<body>
	<form action="Join" method="post">
		<div>이름: <input type="text" name="name" value="<%= member.getName() %>"></div>
		<div>성별: <select name="gender" value="<%= member.getGender() %>">
			<option value="man">남자</option>
			<option value="woman">여자</option>
		</select></div>
		<div>아이디: <input type="text" name="id" value="<%= member.getId() %>"></div>
		<div>비밀번호: <input type="password" name="password" value="<%= member.getPassword() %>"></div>
		<div>비밀번호 확인: <input type="password" name="passwordCheck" value="<%= member.getPasswordCheck() %>"></div>
		<div>주소: <input type="text" name="address" value="<%= member.getAddress() %>"></div>
		<div>전화번호: <input type="text" name="phone" value="<%= member.getPhone() %>"></div>
		<div>이메일주소: <input type="email" name="email" value="<%= member.getEmali() %>"></div>
		<div>취미:
			<input type="checkbox" name="hobby" value="축구">축구 
			<input type="checkbox" name="hobby" value="야구">야구 
			<input type="checkbox" name="hobby" value="농구">농구
			<input type="checkbox" name="hobby" value="볼링">볼링 
			<input type="checkbox" name="hobby" value="당구">당구 
			<input type="checkbox" name="hobby" value="게임">게임 
			<input type="checkbox" name="hobby" value="배구">배구 
			<input type="checkbox" name="hobby" value="TV">TV
			<input type="checkbox" name="hobby" value="유튜브">유튜브 
		</div>
		<hr>
		<div><input type="submit" value="회원가입"></div>
	</form>
</body>
</html>