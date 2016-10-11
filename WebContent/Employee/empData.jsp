<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">


</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>직원 관리 테이블</title>
<link rel="stylesheet" type="text/css" href="board_comm.css">
</head>
<body>
<form action="">
<table border="1">
<caption>직원 관리</caption>
<tr>
<th>사원 번호</th><th>이름</th><th>급여</th>
<th>부서번호</th>
<th>경력</th><th>관리등급</th>
</tr>
<c:forEach var="emp" items="${list}">
<input type="hidden" name="${emp.epass}">
<tr>
<td>${emp.empno}</td><td><a href="Employee.EmpModify.do?empno=${emp.empno}">${emp.ename}</a></td>
<td>${emp.sal}</td>
<td>${emp.dno}</td>
<td>${emp.ecarr}</td><td>${emp.rank}</td>
</tr>
</c:forEach>
</table>
<table>
<tr>
<tr>
<td>
<c:forEach begin="1" end="60">&nbsp;</c:forEach>
</td>
<td>
<input type="button" value="등록하기" onclick="location.href='Employee.EmpJoin.do'"></td>
</tr>
</table>
</form>
</body>
</html>