<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>상품 페이지</title>
<link rel="stylesheet" type="text/css" href="board_comm.css">
</head>
<body>
<table>
<caption>상품 페이지</caption>

<c:forEach var="pro" items="${list}" varStatus="status">
<c:if test="${status.count eq 1}">
<tr>
</c:if>


<td>

<input type="text" value="${pro.pname}">
<a href="Product.ProductView.do?pno=${pro.pno}">
<img src="${pro.pic}" width="180px" height="180px"></a>
<input type="text" value="${pro.price}">
</td>

<c:if test="${status.count %4 eq 0}">
</tr><tr>
</c:if>
<%-- 
<c:if test="${status.count %4 eq 0}">
</tr>
</c:if>
<c:if test="${status.count %4 eq 0}">
<tr>
</c:if> --%>

</c:forEach>

</tr>

</table>
</body>
</html>