<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<form action="Product.ProModify.do">
		<table>
				<caption>상품 정보 수정</caption>
				<tr>
					<td>상품 명 :</td>
					<td><input name="pname" type="text"></td>
				</tr>
				<tr>
					<td>가격 :</td>
					<td><input name="price" type="text"></td>
				</tr>
				<tr>
					<td>수량 :</td>
					<td><input name="psto" type="text"></td>
				</tr>
				<tr>
					<td>상품 구별 :</td>
					<td><input name="prop" type="text"></td>
				</tr>
				<tr>
					<td>이미지 URL :</td>
					<td><input name="pic" type="text"></td>
				</tr>
				<tr>
					<td><input type="hidden" name="pno" value="${pno }"></td>
				</tr>
				<tr>
				<td><input type="submit" value="수정"></td>
				<td><input type="button" value="취소" onClick="history.back();"></td>
				</tr>
		</table>
	</form>
</div>
</body>
</html>