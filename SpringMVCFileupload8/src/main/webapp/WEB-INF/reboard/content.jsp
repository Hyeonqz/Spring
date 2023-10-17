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

<div style="margin:100px; 100px;">
	<table class="table table-bordered" style="width:600px;">
		<caption align="top"><b>내용보기</b></caption>
			<tr>
				<td>
					<h2><b>${dto.subject }</b></h2>		
					<span style="float:right; margin-right:20px;">
						조회 : ${dto.readcount}&nbsp;&nbsp;&nbsp;&nbsp;
						<fmt:formatDate value="${dto.writeday }" pattern="yyyy-MM-dd HH:mm"/>
					</span><br>
					<h5><b>작성자 : ${dto.writer }</b></h5>		
				</td>
			</tr>
			
			<tr>
				<td>
					<pre>${dto.content }</pre>
					<br><br>
					
					<c:if test="${dto.photo != null }">
						<c:forTokens var="pho" items="${dto.photo }" delims=","> <!-- , 구분으로 짜르기  -->
						<a href="../upload/${pho }">
						<img src="../upload/${pho }" style="width:220px; height:180px; border:1px solid green; border-radius:20px;">
						</a>
						</c:forTokens>
					</c:if>
					
					<c:if test="${dto.photo ==null }">
						<img src="../photo/noimage.JPG" style="width:220px; height:180px; border:1px solid green; border-radius:20px;">
					</c:if>
					
				</td>
			</tr>
			
			<tr>
				<td align="right">
					<button class="btn btn-outline-success" onclick="location.href='writeform1'">글쓰기</button>
					<button class="btn btn-outline-success" onclick="location.href='writeform?num=${dto.num}&regroup=${dto.regroup }&restep=${dto.restep }$relevel=${dto.relevel }&currentPage=${currentPage }'">답글</button>
					<button class="btn btn-outline-success" onclick="location.href='updatepassform?num=${dto.num}&currentPage=${currentPage }'">수정</button>
					<button class="btn btn-outline-success" onclick="location.href='deletepassform?num=${dto.num}&currentPage=${currentPage }'">삭제</button>
					<button class="btn btn-outline-success" onclick="location.href='list?currentPage=${currentPage}'">목록</button>
				</td>
			
			</tr>
			
			
	</table>
</div>



</body>
</html>