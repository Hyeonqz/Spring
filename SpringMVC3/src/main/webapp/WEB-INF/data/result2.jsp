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
<table class="table table-bordered" width="500px;">

	<tr>
		<td width="100px;">이름</td>
		<td>${name}</td>
	</tr>
	
	<tr>
		<td width="100px;">학교</td>
		<td>${school}</td>
	</tr>
	
	<tr>
		<td width="100px;">학년</td>
		<td>${grade}</td>
	</tr>
	
	<tr>
		<td width="100px;">학교주소</td>
		<td>${addr}</td>
	</tr>

</table>




</body>
</html>