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

<h3>ex3번 예제</h3>
<br>
<button type="button" id="btn3" class="btn btn-info">list3 Json 배열 데이터 출력하기</button>

<div id="out3">

</div>

<script>
$("#btn3").click(function(){
    // alert("ㅎㅇ");

    $.ajax({
        type: "get",
        dataType: "json",
        url: "list3",
        success: function(res) {

            var s = "";

            $.each(res, function(i, elt) {

                s += "<img src='image/" + elt.photo + "' width=100>"; // 수정: 이미지 태그 내의 width 속성 추가
                s += elt.name;
            });

            $("#out3").html(s); // 수정: .show() 대신 .html()을 사용하여 내용을 설정
        }
    });
});






</script>


</body>
</html>