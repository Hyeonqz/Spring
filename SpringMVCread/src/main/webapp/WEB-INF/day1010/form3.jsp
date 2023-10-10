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
<form action="read2" method="post">
	<table class="table table-bordered">
		<tr>
			<td>상품명</td>
			<td><input type="text" name="sang"></td>
		</tr>
		
		<tr>
			<td>색상</td>
			<td><input type="color" name="color" value="##FF0000"></td>
		</tr>
		
		<tr>
			<td>가격</td>
			<td><input type="text" name="price" class="form-control"></td>
		</tr>
		
		<tr>
			<th>이미지</th>
			<td>
				<select name="image">
					<option value="ajax">ajax</option>
					<option value="intellj">intellij</option>
					<option value="b3">사진3</option>
					<option value="b4">사진4</option>
					<option value="g5">사진5</option>
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