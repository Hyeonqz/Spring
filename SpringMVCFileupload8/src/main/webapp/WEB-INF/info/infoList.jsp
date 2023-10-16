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

<div class="alert alert-danger">
<b>${totalcount } 개의 데이터가 있습니다.</b><br><br>
<button type="button" class="btn btn-outline-dark" onclick="location.href='addform'">글쓰기</button>
</div>

	<hr>
	<table class="table table-bordered" style="width:1200px;">

		<tr>
			<th align="center" width="100">등록번호</th>
			<th align="center" width="100">이름</th>
			<th align="center" width="100">운전면허 여부</th>
			<th align="center" width="100">주소</th>
			<th align="center" width="150">사진</th>
			<th align="center" width="150">작성일</th>
			<th align="center" width="100">Edit</th>
		</tr>
		
		<c:forEach var="dto" items="${list}" varStatus="i">
		
		<tr>
			<td>${i.count }</td>
			<td>${dto.name }</td>
			<td>${dto.driver }</td>
			<td>${dto.addr }</td>
			
			<td>
			<c:if test="${dto.photo!='no'}">
				<img src="../photo/${dto.photo}" width="50" height="50">
			</c:if>
			
			<c:if test="${dto.photo=='no'}">
				<img src="../photo/noimage.JPG" width="50" height="50">
			</c:if>
			</td>
			
			<td><fmt:formatDate value="${dto.gaipday }" pattern="yyyy-MM-dd HH:mm:ss"/>
			</td>
			
				
				<td>
					<button type="button" class="btn btn-outline-dark" onclick="location.href='uform?num=${dto.num}'">수정</button>
					<button type="button" class="btn btn-outline-dark" onclick="location.href='deletego?num=${dto.num}'">삭제</button>
				</td>			
		</tr>
		
		
		</c:forEach>

	</table>
	
	<div style="width: 900px; text-align: left; border: 2px solid orange;">
	
		<form action="list" style="width: 150px;">
			<select name="title">
				<option value="name" ${title=='name'?"selected":""}>이름</option>
				<option value="addr" ${title=='name'?"selected":""}>주소</option>
				<option value="driver" ${title=='name'?"selected":""}>운전면허</option>
			</select>
			<input type="text" name="search" class="form-control" placeholder="검색할 단어" style="width:150px;" value="${search }">
			
			<button type="submit" class="btn btn-outlie-dark">검색</button>
		</form>
	</div>

</body>
</html>