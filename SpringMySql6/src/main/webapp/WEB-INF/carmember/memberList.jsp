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

<c:if test="${count1==0 }">
	<h2 class="alert alert-info">등록된 고객정보가 없습니다.</h2>
</c:if>

<c:if test="${count1>0 }">
	<h2 class="alert alert-info">총 ${count1 }명의 고객이 있습니다.</h2>
</c:if>

	<button type="button" onclick="location.href='addform'">추가폼으로 이동</button>

	<hr>
	<hr>
	<table class="table table-bordered">

		<tr>
			<th width="60">등록번호</th>
			<th width="60">이름</th>
			<th width="60">전화번호</th>
			<th width="60">주소</th>
			<th width="60">구입날짜</th>
			<th width="60">Edit</th>
		</tr>

		<tr>
			<c:forEach var="dto" items="${list }" varStatus="i">
				<tr>
					<td>${i.count }</td>
					<td>${dto.name }</td>
					<td>${dto.hp }</td>
					<td>${dto.addr }</td>

					<td>
					<fmt:formatDate value="${dto.gaipday }" pattern="yyyy-MM_dd HH:mm"/>
					</td>

					<td>
						<button type="button" class="btn btn-info" onclick="location.href='update1?num=${dto.num}'">수정</button>
						<button type="button" class="btn btn-danger" onclick="location.href='deleteform?num=${dto.num}'">삭제</button>
					</td>
				</tr>
			</c:forEach>

		</tr>

	</table> 

</body>
</html>