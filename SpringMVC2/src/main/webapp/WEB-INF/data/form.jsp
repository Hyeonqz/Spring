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
<form action="read">
	<table class="table table-bordered">
		<tr>
			<th>아이디</th>
			<td>
			<input type="text" name="myid" class="form-control" style="width:200px;">
			</td>	
		</tr>	
		
		<tr>
			<th>비밀번호</th>
			<td>
			<input type="password" name="mypass" class="form-control" style="width:200px;">
			</td>	
		</tr>	
		
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="데이터전송하기">
			</td>
		</tr>
	
	</table>
</form>



</body>
</html>