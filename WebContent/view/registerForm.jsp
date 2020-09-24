<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
</head>
<body>
	
	<h2>Registration Form</h2>
	
	<form action="/hw1-helloMVC/doRegister" method="get">
		
		<table style="border:3px solid black">
			<tr align="center"><td colspan="2">Enter Information Here</td></tr>
			<tr><th>아이디</th><th><input type="text" name="id"></th></tr>
			<tr><th>비밀번호</th><th><input type="password" name="password"></th></tr>
			<tr><th>이름</th><th><input type="text" name="name"></th></tr>
			<tr><th>성별</th><th>남자<input type="radio" name="gender" value="male">
								여자<input type="radio" name="gender" value="female"></th></tr>
			<tr><th>이메일</th><th><input type="email" name="email" placeholder="id@host"></th></tr>
			<tr><th></th><th><input type="submit" value="register"></th></tr>
		</table>
		
	</form>
	
</body>
</html>