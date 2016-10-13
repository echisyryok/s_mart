<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
 function goModify(a){
	location.href="Product.ItemGoModify.do?pno="+a
 }
 function goDelete(){
	 var items =  document.getElementsByName("chk");
	 alert(items.name);
	 alert(items.length);
	 for(var i = 0 ; i<items.length; i++){
	 	alert(items[i].checked);
	 }
 }
</script>
</head>
<body>
<div align="center">
<form action="Product.ItemGoUpload.do" name="frm">
<table border="1">
<caption>상품 업로드</caption>
<tr>
<td></td><td>상품번호</td><td>상품명</td><td>가격</td><td>재고</td><td>상품 구별</td><td>상품 추천</td><td>상품 불평</td><td>수정</td></tr>
<c:forEach var="item" items="${list}" varStatus="status">
<tr>
<td><input type="checkbox" name="chk" value="${status.index+1}"></td>
<td>${item.pno }</td><!-- 상품번호 -->
<td>${item.pname }</td><!-- 상품명 -->
<td>${item.price }</td><!-- 가격 -->
<td>${item.psto }</td><!-- 재고 -->
<td>${item.prop }</td><!-- 상품구별 -->
<td>${item.pre }</td><!-- 상품추천 -->
<td>${item.pco }</td><!-- 상품불평 -->
<td>
<input type="button" value="수정" onclick="goModify(${status.index+1})">
</td> <!-- 수정 -->
</tr>
</c:forEach >
<tfoot align="center"><tr><td><input type="submit" value="Upload">
<input type="button" value="삭제" onclick="goDelete()"></td></tr> </tfoot>
</table>
</form>
</div>
</body>
</html>