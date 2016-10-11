<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>직원 수정 창</title>
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

</script>

<link rel="stylesheet" type="text/css" href="form_comm.css">
</head>
<body>
<form action="Employee.EmpModifyConfirm.do" method="post" name="frm" onsubmit="return chkemp()">
<table>
<caption>　</caption>
<tr>
<td>　　　　</td>
<td>사원 번호</td>
<td></td>
<td><lable>${emp.empno}</lable>
<input type="hidden" name="empno"  required="required" value="${emp.empno}"></td>
<td>　　　　</td>
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
<td><input type="text" name="ename" required="required" value="${emp.ename}"></td>
<td>　　　　</td>
</tr>
<tr>
<td>　　　　</td>
<td>급여</td>
<td>　　　　</td>
<td><input type="number" name="sal" required="required" value="${emp.sal}"></td>
<td>　　　　</td>
</tr>
<tr>
<td>　　　　</td>
<td>부서 번호</td>
<td>　　　　</td>
<td>
<select name="dno">
<c:forEach var="d" items="${dept}">
<c:if test="${emp.dno eq d.dno }">
<option value="${d.dno}" selected="selected">${d.dname}</option>
</c:if>
<c:if test="${emp.dno ne d.dno }">
<option value="${d.dno}">${d.dname}</option>
</c:if>
</c:forEach>
</select></td>
<td>　　　　</td>
</tr>
<tr>
<td>　　　　</td>
<td>경력</td>
<td>　　　　</td>
<td><input type="number" name="ecarr" required="required" value="${emp.ecarr}"></td>
<td>　　　　</td>
</tr>
<tr>
<td>　　　　</td>
<td>관리등급</td>
<td>　　　　</td>
<td><select name="rank">
<c:if test="${emp.ecarr eq 1}">
<option value="1" selected="selected">일반</option>
</c:if>
<c:if test="${emp.ecarr ne 1}">
<option value="1">일반</option>
</c:if>
<c:if test="${emp.ecarr eq 2}">
<option value="2" selected="selected">웹</option>
</c:if>
<c:if test="${emp.ecarr ne 2}">
<option value="2">웹</option>
</c:if>
<c:if test="${emp.ecarr eq 3}">
<option value="3" selected="selected">관리자</option>
</c:if>
<c:if test="${emp.ecarr ne 3}">
<option value="3">관리자</option>
</c:if>
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
<td><input type="button" value="삭제" onclick="location.href='Employee.EmpDel.do?empno=${emp.empno}'"></td>
<td><input type="submit" value="수정" onclick="chkemp()"></td>
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