<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>직원 등록 창</title>
<script type="text/javascript">
function chkemp() {
	if (frm.epass.value != frm.epass2.value){
		alert("암호를 확인하세요");
		frm.epass.focus();
		frm.epass.value="";
		frm.epass2.value="";
		return false;
	}
	
}

function empnochk() {
	if(!frm.empno.value){
		alert("사원 번호를 입력하세요");
		frm.empno.focus();
		return false;
	}
	window.open("Employee.EmpnoChk.do?empno="+frm.empno.value,"","width='200'","height='200'");
	
	
}
</script>

<link rel="stylesheet" type="text/css" href="form_comm.css">
</head>
<body>

<form action="Employee.EmpJoinConfirm.do" method="post" name="frm" onsubmit="return chkemp()">
<table>
<caption>　</caption>
<tr>
<td>　　　　</td>
<td>사원 번호</td>
<td></td>
<td><input type="number" name="empno" required="required"></td>
<td><input type="button" value="사원 번호 체크" onclick="empnochk()"></td>
</tr>
<tr>
<td>　　　　</td>
<td>비밀 번호</td>
<td>　　　　</td>
<td><input type="password" name="epass" required="required"></td>
<td></td>
</tr>
<tr>
<td>　　　　</td>
<td>비밀 번호 확인</td>
<td>　　　　</td>
<td><input type="password" name="epass2" required="required"></td>
<td>　　　　</td>
</tr>
<tr>
<td colspan="5" id="graytable">
</tr>
<tr>
<td>　　　　</td>
<td>성명</td>
<td>　　　　</td>
<td><input type="text" name="ename" required="required"></td>
<td>　　　　</td>
</tr>
<tr>
<td>　　　　</td>
<td>급여</td>
<td>　　　　</td>
<td><input type="number" name="sal" required="required"></td>
<td>　　　　</td>
</tr>
<tr>
<td>　　　　</td>
<td>부서 번호</td>
<td>　　　　</td>
<td>
<select name="dno">
<c:forEach var="d" items="${dept}">
<option value="${d.dno}">${d.dname}</option>
</c:forEach>
</select></td>
<td>　　　　</td>
</tr>
<tr>
<td>　　　　</td>
<td>경력</td>
<td>　　　　</td>
<td><input type="number" name="ecarr" required="required"></td>
<td>　　　　</td>
</tr>
<tr>
<td>　　　　</td>
<td>관리등급</td>
<td>　　　　</td>
<td><select name="rank">
<option value="1">일반</option>
<option value="2">웹</option>
<option value="3">관리자</option>
</select></td>
<td>　　　　</td>
</tr>
<tr>
<td colspan="5" id="graytable">
</tr>
<tr>
</tr>
<tr>
<td>　　　　</td>
<td>　　　　</td>
<td><input type="submit" value="확인" onclick="chkemp()"></td>
<td><input type="button" value="취소" onclick="location.href='Employee.EmpData.do'"></td>
<td>　　　　</td>
</tr>
<tr>
<tr>
<td colspan="5" id="red">
</tr>
<tr>
</table>
</form>
</body>
</html>