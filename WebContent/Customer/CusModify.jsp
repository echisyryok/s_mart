<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
 
function checkfield(){
	/*
	1private String cpass;
	2private String caddr;
	3private String cphn;
	4private String cdel;
	5private String cmail;
	6private String cid;
	*/
 if(document.frm.cpass.value==""){
 alert("비밀번호를 입력하세요");
 document.frm.cpass.focus();
 return false;
 
 }else if(document.frm.cpass2.value==""){
 alert("비밀번호확인을 입력하세요");
 document.frm.cpass2.focus();
 return false;
 
 }else if(document.frm.cphn.value==""){
 alert("전화번호를 입력하세요");
 document.frm.cphn.focus();
 return false;
 
 }else if(document.frm.caddr.value==""){
 alert("주소를 입력하세요");
 document.frm.caddr.focus();
 return false;
 
 }else if(document.frm.cmail.value==""){
 alert("이메일을 입력하세요");
 document.frm.cmail.focus();
 return false;
 }
 

 
 if(document.frm.cpass.value!=document.frm.cpass2.value){
 //비밀번호와 비밀번호확인의 값이 다를 경우
 
 alert("입력한 2개의 비밀번호가 일치하지 않습니다.");
 document.frm.cpass.focus();
 return false;
 
 }
 
 
 var exptext = /^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.[A-Za-z0-9\-]+/;
 
 if(exptext.test(document.frm.cmail.value)==false){
 //이메일 형식이 알파벳+숫자@알파벳+숫자.알파벳+숫자 형식이 아닐경우
 
 alert("이 메일형식이 올바르지 않습니다.");
 document.frm.cmail.focus();
 return false;
 }

}
</script>
</head>
<body>
<div align="center">
<h1> 회원 정보 수정</h1>
<form action="Customer.CusModify.do" name="frm" method="post" onsubmit="return checkfield()">
<table style="text-align: left">
<tr>
<td>비밀번호</td><td ><input type="password" name="cpass" id="cpass" required="required"></td>
</tr>
<tr>
<td>비밀번호확인</td><td><input type="password" name="cpass2" id = "cpass2" required="required" >
 </td>
 </tr>
<tr>
<td>전화번호</td><td><input type="text" name="cphn" required="required"></td>
</tr>
<tr>
<td>주소</td><td><input type="text" name="caddr" required="required"></td>
</tr>
<tr>
<td>이메일</td><td><input type="text" name="cmail" id ="cmail" onkeyup="checkemail()"></td>
</tr>
<tr>
<td>배달시간</td><td><select name="cdel">
<option value="11:00">11:00</option>
<option value="15:00">15:00</option>
<option value="19:00" selected="selected">19:00</option>
</select>
</td>
</tr>
</table>
<br>
<table>
<tr><td style="text-align: center">
<input type="hidden" name="cid" value="${cid }">
<input type="submit" value="수정">
<input type="button" value="취소" onClick="history.back();">
</td>
</tr>
</table>
</form>
</div>
</body>
</html>