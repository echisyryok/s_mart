<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  
		1private int cno;
		2private String cid;
		3private String cpass;
		4private String cname;
		5private String caddr;
		6private Date cbir;
		7private String cphn;
		8private String cdel;
		9private String cmail;
		10private Date cjoin;
		11private Date cout;
		12private String outchk;
		13private int cgrd;
		14private int cmil;
		15private int cmils;*/
-->

<form action="">
<table border="1">
<caption>회원 관리</caption>
<tr>
<th>사원 번호</th><th>이름</th><th>아이디</th><th>주소</th><th>경력</th><th>관리등급</th></tr>
<c:forEach var="cus" items="${list}">
<input type="hidden" name="${cus.cpass}">
<tr>
<td>${cus.cno}</td>
<td>${cus.cname}</td>
<td>${cus.cid}</td>
<td>${cus.caddr}</td>
</tr>
</c:forEach>



</table>
<table>
<tr>

<tr>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td><input type="button" value="삭제하기">
<input type="button" value="등록하기" onclick="location.href='Employee.empJoin.do'"></td>
</tr>
</table>
</form>

</body>
</html>