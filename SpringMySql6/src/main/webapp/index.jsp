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

<button type="button" class="btn btn-info" style="width:120px;" onclick="location.href='kakao/list'">자동차 정보목록</button>
<button type="button" class="btn btn-info" style="width:120px;" onclick="location.href='car/list'">자동차 구입고객명단</button>

	<!-- 내 정보 -->
<div id="rightSideBar">
	<div id="myinfoContainer">
		<div id="name">
			<h3> 진현규 </h3>
		</div>
		<div id="position">
			JAVA Backend Engineer
		</div>
	</div>

	<div id="contactContainer">
		<a href="https://github.com/galid1">
			<i class="contactIcon fab fa-github"></i>		
		</a>
		<a href="https://www.notion.so/8607945aef264311887549734c2dd611">
			<i class="contactIcon fas fa-user-circle"></i>
		</a>
		<a href="mailto:galid9619@gmail.com">
			<i class="contactIcon fas fa-envelope"></i>
		</a>
	</div>

</div>

</body>
</html>