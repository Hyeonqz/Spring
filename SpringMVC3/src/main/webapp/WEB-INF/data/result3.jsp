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
<form action="res3" method="post">
	<table class="table table-bordered">
	
		<tr>
			<td>상품명</td>
			<td><input type="text" name="sang"></td>
		</tr>	
		
		<tr>
			<td>카테고리</td>
			<td><input type="text" name="category"></td>
		</tr>	
		
		<tr>
			<td>색상</td>
			<td><input type="text" name="color"></td>
		</tr>	
		
		<tr>
			<td>가격</td>
			<td><input type="text" name="price"></td>
		</tr>	
	
		<tr>
			<td colspan="2"><button type="submit">res3전송하기</button></td>
		</tr>
	</table>
</form>




</body>
</html>