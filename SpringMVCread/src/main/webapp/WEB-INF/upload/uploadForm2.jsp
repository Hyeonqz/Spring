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
<form action="upload2" method="post" enctype="multipart/form-data">
	<table class="table table-bordered" style="width:450px;">
		<caption><b>Spring upload file anything</b></caption>
		
			<tr>
				<th>제목</th>
				<td><input type="text" name="title"></td>
			</tr>
			
			<tr>
				<th>업로드</th>
				<td><input type="file" name="photo" class="form-control" multiple="multiple"></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center"><button type="submit" class="btn btn-info">업로드#2</button></td>
			</tr>
	
	</table>
</form>



</body>
</html>