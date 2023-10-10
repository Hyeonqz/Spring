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

	<form action="process2" method="post">
		<table class="table table-bordered">
		
			<tr>
				<td>상품명</td>
				<td><input type="text" name="sangpum" class="form-control" style="width:150px;"></td>
			</tr>		
			
			<tr>
				<td>수량</td>
				<td><input type="text" name="su" class="form-control" style="width:150px;"></td>
			</tr>		
			
			<tr>
				<td>단가</td>
				<td><input type="text" name="danga" class="form-control" style="width:150px;"></td>
			</tr>		
			
			<tr>
				<td>색상</td>
				<td><input type="text" name="color" class="form-control" style="width:150px;"></td>
			</tr>
			
			<tr>
				<td><button type="submit" class="btn btn-danger">전송버튼</button></td>
			</tr>
		
		</table>	
	</form>



</body>
</html>