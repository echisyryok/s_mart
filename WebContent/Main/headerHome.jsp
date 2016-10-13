<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%--  <%@ page trimDirectiveWhitespaces="true" %> --%>
  <%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.header { background-color: #5B0000;  color: white; }
#logo { position: absolute; left:100; } 
#login { float: right; background-color:  #5B0000; }
#logon { float: right; background-color:  #5B0000; }
table { margin:auto;}
#cart { float: right; } 
.info { background-color: #5B0000;  color: black;}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>홈 헤더</title>

<decorator:head />
</head>
<body>

<div class="header"  style="height: 150px">
<div id="logo"><a href="Main.main.do?id=${id}"><img alt="" src="images/LOGO.png"height="60px"></a></div>



<div>
<c:if test="${chk eq 'c'}">
<div id="info">
<table id="logon">
<tr>
<td>안녕하세요<br> ${id}님</td>
</tr>
<tr><td><input type="hidden" name="id" value="${id}">
<input type="hidden" name="chk" value="${hk}">
<a href="Login.Logout.do">로그아웃</a></td>
<td>배달 확인</td>
<td>회원정보 수정</td>
<td>구매 기록</td>
<td>찜 목록</td>
<td>게시판</td></tr>
</table>
</div>
<div id="cart"><img alt="" src="images/CART.png" height="60px">
</div> 
</c:if>

<c:if test="${chk eq 'e'}">
<div id="info">
<table id="logon">
<tr><td>사원 접속<br>접속자 :  ${id}</td></tr>
<tr><td><input type="hidden" name="id" value="${id}">

<input type="hidden" name="chk" value="${chk}">
<a href="Login.Logout.do">로그아웃</a></td>
<td>상품 등록</td>
<td>게시판</td>
<td>관리자 로그</td>
<td><a href="Customer.CusData.do?id=${id}">고객 관리</a></td>
<td><a href="Employee.EmpData.do?id=${id}">직원 관리</a></td></tr>
</table>
</div>
</c:if>

<c:if test="${chk eq 'no'}">
<div id="info">
<table id="logon">
<tr><td> </td></tr>
<tr><td></td><td></td></tr>
</table>
</div>
</c:if>

<c:if test="${chk eq null}">
<form action="Customer.Login.do" method="post">
<table id="login">
<tr>
<th>아이디</th>
<td><input type="text" name="id" required="required"></td>
<td rowspan="2"><input type="submit" value="　접속　"><p>
<input type="button" value="회원가입" onclick="location.href='Customer.CusNewAttatch.do'"></td>
</tr>
<tr>
<th>암호</th>
<td><input type="password" name="pass" required="required"></td>
</tr>
<tr><td></td><td>
<input type="radio" name="chk" value="c" checked="checked">회원 <input type="radio" name="chk" value="e">직원
</td><td></td></tr>
</table>
</form>
</c:if>
</div>


</div>
<decorator:body />

</body>
</html>