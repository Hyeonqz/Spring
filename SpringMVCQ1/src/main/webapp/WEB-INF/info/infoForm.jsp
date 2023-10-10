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
<form action="act" method="post">
	<table class="table table-bordered">
		<tr>
			<td>이름</td>
			<td><input type="text" name="name"></td>
		</tr>
		
		<tr>
			<td>색상</td>
			<td><input type="color" name="color"></td>
		</tr>
		
		<tr>
			<td>취미</td>
			<td>
				<input type="checkbox" name="hobby" value="soccer" checked="checked">축구
				<input type="checkbox" name="hobby" value="health">헬스
				<input type="checkbox" name="hobby" value="readbook">책읽기
				<input type="checkbox" name="hobby" value="watch utube">유튜브
				<input type="checkbox" name="hobby" value="sleep">잠자기
				<input type="checkbox" name="hobby" value="cook">요리하기
			</td>
		</tr>
		
		<tr>
			<td>언어</td>
			<td>
				<select multiple name="language" size="5">
					<option value="java">java</option>
					<option value="spring">spring</option>
					<option value="sql">sql</option>
					<option value="network">network</option>
					<option value="cs">CS</option>
				</select>			
			</td>
		</tr>
	
		<tr>
		<td colspan="4"><input type="submit" class="btn btn-info"></td>
		</tr>
		
	</table>
</form>



</body>
</html>