<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page trimDirectiveWhitespaces="true" %>
    <%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<decorator:head /> <!-- 데코레이터가 적용될 응답화면 head내용 title은 제외 -->
</head>
<body>
<a href="bestItem.jsp">인기상품</a>
	<a href="newItem.jsp">신상품</a>
	<a href="home.jsp">회사소개</a><hr>
<hr/>
<decorator:body /> // 데코레이터가 적용될 응답화면의 body태그 내용
인기 상품 신상품 회사 소개 <hr>

<hr/>
<div id="footer">하단 내용</div>
중앙정보처리 주식회사 1111 - 2222
</body>
</html>