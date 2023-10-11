<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=VT323&display=swap"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<body>
	<c:if test="${ totalCount==0}">
		<div class="alret alert-info">
			<h3>저장된 차 정보가 없습니다</h3>
		</div>
	</c:if>
	<c:if test="${totalCount>0 }">
		<h3 class="alret alert-ifno">
			<b>${totalCount }</b>대의 차가 있습니다
		</h3>
	</c:if>

	<button type="button" onclick="location.href='writeform'">이동시킫기</button>

	<hr>
	<hr>
	<table class="table table-bordered">

		<tr>
			<th width="60">번호</th>
			<th width="60">차량명</th>
			<th width="60">색상</th>
			<th width="60">차랑가격</th>
			<th width="60">구입일</th>
			<th width="60">Edit</th>
		</tr>

		<tr>
			<c:forEach var="dto" items="${list }" varStatus="i">
				<tr>
					<td>${i.count }</td>

					<td>${dto.carname }</td>

					<td>
						<div style="width:20px; height:20px; background-color:${dto.carcolor}"></div>
					</td>

					<td><fmt:formatNumber value="${dto.carprice }" type="currency" />
					</td>

					<td>${dto.carguip }</td>

					<td>
						<button type="button" class="btn btn-info" onclick="location.href='updateform?num=${dto.num}'">수정</button>
						<button type="button" class="btn btn-danger" onclick="location.href='deleteform?num=${dto.num}'">삭제</button>
					</td>


				</tr>



			</c:forEach>




		</tr>

	</table>

</body>
</html>