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

	<form action="process3" method="post">
		<table class="table table-bordered">
		
			<tr>
				<td>학생명</td>
				<td><input type="text" name="name" class="form-control" style="width:150px;"></td>
			</tr>		
			
			<tr>
				<td>자바점수</td>
				<td><input type="text" name="java" class="form-control" style="width:150px;"></td>
			</tr>		
			
			<tr>
				<td>스프링점수</td>
				<td><input type="text" name="spring" class="form-control" style="width:150px;"></td>
			</tr>		
			
			<tr>
				<td>SQL점수</td>
				<td><input type="text" name="sql" class="form-control" style="width:150px;"></td>
			</tr>
			
			<tr>
				<td><button type="submit" class="btn btn-danger">전송버튼</button></td>
			</tr>
		
		</table>	
	</form>



</body>
</html>