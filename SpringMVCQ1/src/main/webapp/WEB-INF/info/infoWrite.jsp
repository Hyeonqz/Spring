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
<div class="alert alert-info" style="color:${color}">
<h2>출력하기</h2>
</div>

<div style="margin-left:100px; margin-top:100px;">

	<p>1) 나의 이름은 ? ${dto.name } </p><br>
	<p>2) 너가 좋아하는 색상은 ? <input type="color">${dto.color==null?"없음":dto.color} <br><br>
	<p>3) 너의 취미는 ? 	
	<c:if test="${!empty dto.hobby }">
	 	<c:forEach var="i" items="${dto.hobby }">
			[${i }]
		</c:forEach>
	
	</c:if>
	</p><br>
	<p>4) 너가 좋아하는 언어는 ? [${dto.language }] </p>
	
</div>





</body>
</html>