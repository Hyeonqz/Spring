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
<h3 class="alert alert-success">Ex4번 예제</h3>
<br>

<h4>메뉴명을 입력 후 엔터를 쳐 주세요</h4>
<input type="text" id="search" class="form-contorl" style="width:200px;">
<br><br>

<h2 id="fname"></h2>
<img alt="이미지 나와야댄다 너말고" src="" id="photo">

<script>
	$("#search").keypress(function(e){
		
		if(e.keyCode==13) {
			var name = $(this).val();
			alert(name);
			
			$.ajax({
				type:"get",
				dataType:"json",
				url:"list4",
				data:{"name":name},
				success:function(res) {
					
					$("#fname").text(res.name);
					$("#photo").attr("src","image/"+res.photo);
					$("#search").val('');
				}
				
				
			})
		}
	})

</script>

</body>
</html>