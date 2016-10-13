<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="board_comm.css">
</head>
<body>
<table border="1">
<caption>${pro.pname}</caption>
<tr>

<td colspan="2"><input type="hidden" name="pno" value="${pro.pno}">
<img alt="" src="${pro.pic}"height="200px"></td>
<td>

<table border="1">
<caption>구매 정보</caption>
<c:if test="${chk eq 'e'}">
<tr><td>관리자 : </td>

<td colspan="2">수정 삭제</td>
</tr>
</c:if>
<tr><td colspan="3"><br><br>가격 : ${pro.price}</td></tr>
<tr><td colspan="3">좋아요 : ${pro.pre}<br>
싫어요 : ${pro.pco}</td></tr>
<c:if test="${chk eq 'c'}">
<tr><td><a href="Cart.CartForm.do?pno=${pro.pno}">카트에 넣기</a></td><td>찜 하기</td><td>바로 구매</td></tr>
</c:if>
<c:if test="${chk eq 'e'}">
<tr><td colspan="3">재고 수량 : ${pro.psto}</td></tr>
</c:if>
</table>

</td>
</tr>

<tr>
<td colspan="3">
<table  border="1"><tr>
<td>관령 상품1</td><td>관령 상품2</td><td>관령 상품3</td>
</tr>
</table>
</td>
</tr>
</table>

<table>



</table>

</body>
</html>