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
	<div style="margin-left:200px; margin-top:50px;">
		<button type="button" class="btn btn-outline-dark" onclick="location.href='naver/form1'">각각 읽기</button><br><br>
	
		<button type="button" class="btn btn-outline-dark" onclick="location.href='naver/form2'">DTO 읽기</button><br><br>
	
		<button type="button" class="btn btn-outline-dark" onclick="location.href='naver/form3'">MAP 읽기</button><br><br>
	
		<button type="button" class="btn btn-outline-dark" onclick="location.href='naver/form4'">이미지 업로드하기</button><br>
	</div>
</body>
</html>