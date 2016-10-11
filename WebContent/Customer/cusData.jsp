<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function checkfield(){
	 
	 if(document.frm.radiobtn.value==""){ //id값이 없을 경우
	 alert("수정할 회원을 선택해주세요");         //메세지 경고창을 띄운 후
	 document.frm.cid.focus();     // id 텍스트박스에 커서를 위치
	 return false;
	 
	 }
	 else{
		 alert("선택된 cid:"+document.frm.radiobtn.value);
		 document.frm.cid.value=document.frm.radiobtn.value;
		 alert("선택된 cid:"+document.frm.cid.value);
	 }
	 
}
</script>
</head>
<body>

<form action="Customer.CusSetCid.do" method="post" name="frm" onsubmit="return checkfield()">
<table  border="1">
<caption>관리자 고객 관리</caption>
<tr>
<th></th><th>회원 번호</th><th>이름</th><th>아이디</th><th>전화번호</th><th>이메일</th>
<th>가입날짜</th><th>탈퇴날짜</th><th>탈퇴여부</th><th>회원 종류</th><th>마일리지</th><th>누적 마일리지</th></tr>
<c:forEach var="cus" items="${list}">
<input type="hidden" name="${cus.cpass}">
<tr>
<td><input type="radio" name="radiobtn" value="${cus.cid}" ></td>
<td>${cus.cno}</td>
<td>${cus.cname}</td>
<td>${cus.cid}</td>
<td>${cus.cphn}</td>
<td>${cus.cmail}</td>
<td>${cus.cjoin}</td>
<td>${cus.cout}</td>
<td>${cus.outchk}</td>
<td>${cus.cgrd}</td>
<td>${cus.cmil}</td>
<td>${cus.cmils}</td>
</tr>
</c:forEach>
<tr>
<td><input type="hidden" id="cid" name="cid"></td>
<td><input type="button" value="삭제하기"></td>
<td><input type="submit" value="수정하기" ></td>
</tr>
</table>

</form>

</body>
</html>