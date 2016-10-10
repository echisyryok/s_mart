<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
function wincl() {
	
	opener.frm.empno.value=${empno};
	window.close();
}

</script>


<title>사번 중복 확인</title>

</head>
<body>
<c:if test="${empchk==1}">
	<form>
	<table>
	<caption>다른 사원 번호를 입력하세요</caption>
		<tr><th>사원 번호</th><td><input type="number" name="empno" required="required"></td></tr>
		<tr><td colspan="2"><input type="submit" value="사원 번호 체크"></td></tr> 
	</table>
	</form>
</c:if>
<c:if test="${empchk==0}">
	<h2>사용 가능한 사원 번호 입니다.</h2>
	<button onclick="wincl()">확인</button>
</c:if>



</body>
</html>