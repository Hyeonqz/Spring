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
<h3>ex2번 예제</h3>
<br>
<button type="button" id="btn2" class="btn btn-info">list2 Json 데이터 출력하기</button>

<div id="out2">

</div>

<script>
	$("#btn2").click(function(){
		$.ajax({
			type:"get",
			dataType:"json",
			url : "list1",
			success:function(res){
				$("#out2").empty();
				$("#out2").append("상품 : "+res.sang + "<br>");
				$("#out2").append("가격 : " +res.price + "<br>");
				$("#out2").append("색깔 : "+res.color + "<br>");
			}
		})
	})

</script>

</body>
</html>