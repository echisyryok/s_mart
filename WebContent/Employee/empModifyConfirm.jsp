<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>직원 수정 완료</title>
</head>
<body>
<c:if test="${result>0 }">
<script type="text/javascript">
alert("직원 수정이 정상적으로 완료 되었습니다.");
location.href="Employee.EmpData.do";
</script>
</c:if>
<c:if test="${result eq 0 }">
<script type="text/javascript">
alert("직원 수정 오류 발생");
history.go(-1);
</script>
</c:if>

</body>
</html>