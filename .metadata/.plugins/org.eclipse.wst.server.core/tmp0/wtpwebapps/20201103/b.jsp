<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<button id="abtn">aa</button>
	<form action="BMove" method="get">
		a : <input type="text" name="a" id="aa"> <br> b : <input
			type="text" name="b"> <br> <input type="submit"
			value="확인" id="bb">
	</form>
</body>
</html>
<script type="text/javascript">
	let a = document.getElementById("abtn").onclick = function() {
		alert("잘된다");
	};
</script>