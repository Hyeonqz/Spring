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

	<h2>Get방식 폼</h2>
	<form action="read1" method="get">
	<b>
		이름 : <input type="text" name="myname" size="6"><br>
		나이 : <input type="text" name="myage" size="5"><br>
	</b>
	<button type="submit">Get 전송</button>
	</form>
	<br><br>
	
	<h2>Post방식 폼 _ dto읽기</h2>
	<form action="read2" method="post">
	<b>
		상품 : <input type="text" name="sang" size="10"><br>
		가격 : <input type="text" name="price" size="10"><br>
	</b>
	<button type="submit">Post 전송</button>
	</form>
	
	<br><br>
	
	
	<h2>Post방식 폼 _ map읽기</h2>
	<form action="read3" method="post">
	<b>
		상품 : <input type="text" name="sang" size="10"><br>
		가격 : <input type="text" name="price" size="10"><br>
	</b>
	<button type="submit">Post 전송</button>
	</form>

</body>
</html>