<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=VT323&display=swap" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<body>

<form action="process" method="post">
	작성자 : <input type="text" name="name"><br>
	날짜 : <input type="date" name="date"><br>
	나이 : <input type="text" name="age"><br>
	성별 : <input type="radio" name="gender" value="남자" checked="checked">남자
		  <input type="radio" name="gender" value="여자">여자
	
	<input type="submit" value="서버에 전송" class="btn btn-info">
</form>



</body>
</html>