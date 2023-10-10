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
<form action="res2" method="get">
	<table class="table table-bordered" width="500px;">

	<tr>
		<td width="100px;">이름</td>
		<td><input type="text" name="name" placeholder="이름입력해라"></td>
	</tr>
	
	<tr>
		<td width="100px;">학교</td>
		<td><input type="text" name="shcool" placeholder="학교입력"></td>
	</tr>
	
	<tr>
		<td width="100px;">학년</td>
		<td><input type="text" name="grade" placeholder="학년입력해라"></td>
	</tr>
	
	<tr>
		<td width="100px;">학교주소</td>
		<td><input type="text" name="saddr" placeholder="힉교주소입력해라"></td>
	</tr>
	
	<tr>
		<td colspan="2">
		<button type="submit" class="btn btn-outline-dark" style="margin-right:40px;">Result2 전송</button>
		</td>
	</tr>

	</table>
</form>
</div>


</body>
</html>