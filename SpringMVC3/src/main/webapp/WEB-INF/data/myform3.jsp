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

<div>
	<table class="table table-bordered">
		<tr>
			<td>상품명</td>
			<td>${sang }</td>
		</tr>
		
		<tr>
			<td>카테고리</td>
			<td>${category }</td>
		</tr>		
	
		<tr>
			<td>색상</td>
			<td>${color }</td>
		</tr>
		
				<tr>
			<td>가격</td>
			<td>${price }</td>
		</tr>
		
		<tr>
			<td colspan="2"><a href="../index.jsp">처음으로 돌아가기</a></td>
		</tr>
	</table>
</div>


</body>
</html>