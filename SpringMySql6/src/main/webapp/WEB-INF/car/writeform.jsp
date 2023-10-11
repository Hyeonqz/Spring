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
<h2>자동차 폼</h2>
<form action="write" method="post">
	<table class="table table-bordered" style="width:400px;">
		<tr>
			<th>자동차 이름</th>
			<td><input type="text" name="carname" required="required"></td>
		</tr>

		<tr>
			<th>자동차 가격</th>
			<td><input type="text" name="carprice" required="required"></td>
		</tr>
		
		<tr>
			<th>자동차 색상</th>
			<td><input type="color" name="carcolor" required="required"></td>
		</tr>
		
		<tr>
			<th>자동차 구입일</th>
			<td><input type="date" name="carguip" required="required"></td>
		</tr>
		
		<tr>
			<td colspan="2" align="center"><button type="submit" class="btn btn-outline-red">DB전송</button>
				<button type="button" class="btn btn-info" onclick="location.href='list'">목록</button>
			</td>
		</tr>	
	</table>
</form>


</body>
</html>