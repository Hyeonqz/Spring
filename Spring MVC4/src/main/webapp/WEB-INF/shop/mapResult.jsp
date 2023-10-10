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

<div style="maring-left:150px; margin-top:100px;">

	이름 : ${name }<br>
	자바점수 : ${java }<br>
	스프링점수 : ${spring }<br>
	SQL점수 : ${sql }<br>
	<c:set var="tot" value="${java+spring+sql }"/>
	<c:set var="avg" value="${tot/3 }"/>
	총점수 : ${tot }<br><br>
	
	평균점수 : ${avg}



</div>




</body>
</html>