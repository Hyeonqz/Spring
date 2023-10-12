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
<h2>자동차 인간 수정폼</h2>

<form action="update2" method="post">
	<input type="hidden" name="num" value="${cdto.num }">
	<table class="table table-bordered" style="width:400px;">
		<tr>
			<th>이름</th>
			<td><input type="text" name="name" required="required" value="${cdto.name }"></td>
		</tr>

		<tr>
			<th>전화번호</th>
			<td><input type="text" name="hp" required="required" value="${cdto.hp }"></td>
		</tr>
		
		<tr>
			<th>주소</th>
			<td><input type="text" name="addr" required="required" value="${cdto.addr }"></td>
		</tr>
		
		<tr>
			<td colspan="2" align="center"><button type="submit" class="btn btn-outline-red">수정하기</button>
				<button type="button" class="btn btn-info" onclick="location.href='list'">목록</button>
			</td>
		</tr>	
	</table>
</form>


</body>
</html>