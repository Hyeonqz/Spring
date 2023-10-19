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
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
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
			
			
			<!-- 댓 글 -->
			<tr>
				<td>
					
					<!-- 대 댓글 출력 -->
					<div id="answer">
						<b>총 댓글 개수 :  ${acount }</b><br><br>
						<c:forEach var="a" items="${alist }">
							이름 : ${a.nickname } -- 내용 : ${a.content } -- 
							<span style="font-size:0.9em; color:gray;">
							작성일 : <fmt:formatDate value="${a.writeday }" pattern="yyyy-MM-dd-HH-mm-ss"/>
							</span>&nbsp;&nbsp;
							<i class="adel bi bi-trash3-fill" style="cursor:pointer;" idx="${a.idx}"></i><br>
						</c:forEach>
					</div>
					
					<div><b>댓글 목록 출력</b></div>
						<br>
						<form action="ainsert" method="post" style="width:700px;">
							<!-- hidden으로 값 넘기기 -->
							<input type="hidden" name="num" value=${dto.num }>
							<input type="hidden" name="currentPage" value=${currentPage }>
							<div class="d-inline-flex">
							<b>닉네임 &nbsp;</b>
							<input type="text" name="nickname" class="form-contorl" style="width:120px;" required="required">&nbsp;&nbsp;
							
							<b>비밀번호 &nbsp;</b>
							<input type="password" name="pass" class="form-contorl" id="pass1" style="width:120px;" required="required">
							<br><br>
							<input type="text" name="content" class="form-control" style="width:400px;" placeholder="댓글 내용을 입력해주세요">
							<button type="submit" class="btn btn-outline-info">확인</button>
							</div>
						</form>
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
<script>
	$("i.adel").click(function(){
		
		var idx= $(this).attr("idx");
		//alert(idx);
		
		var pass =prompt("비밀번호를 입력해주세요");
		//alert(pass);
	
		if(pass==null) {
			return;
		}
		
		$.ajax({
			type:"GET",
			dataType:"JSON",
			url : "adelete",
			data:{"idx":idx , "pass":pass},
			success:function(res) {
				if(res.check==0) {
					alert("비밀번호가 맞지않다.")
				} else {
					alert("댓글을 삭제합니다.")
					location.reload();
				}
			}
			
			
			
		})
		
	})



</script>




</body>
</html>