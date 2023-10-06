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

<div class="alert alert-info">
<button onclick="location.href='ilike/movie'" class="btn btn-outline-dark">제목을 메시지로 받아서 출력하고 그아래 이미지</button><br><br>
<button onclick="location.href='school/myinfo'" class="btn btn-outline-dark">GET방식 테이블 출력(이름,학교,학년,학교주소)</button><br><br>
<button onclick="location.href='shop/ipgo'" class="btn btn-outline-dark">POST방식 테이블 출력(상품명,카테고리,색상,가격)_Dto활용</button><br><br>
<button onclick="location.href='mysinsang'" class="btn btn-outline-dark">MAP방식 테이블 출력()</button>
</div>

</body>
</html>