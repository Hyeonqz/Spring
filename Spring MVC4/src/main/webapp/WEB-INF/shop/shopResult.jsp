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
<h2>데이터 shopForm출력</h2>
<div style="color:${shopDto.color}">

상품명 : ${shopDto.sangpum }<br>
색상 : ${shopDto.color }<br>
수량 : <fmt:formatNumber value="${dto.su }" pattern="#,##0"/><br>
단가 : <fmt:formatNumber value="${dto.danga }" type="currency"/><br>
총가격 : <fmt:formatNumber value="${dto.su*dto.danga }" type="currency"/>
</div>



</body>
</html>