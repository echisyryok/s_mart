<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인 헤더</title>
<link rel="stylesheet" type="text/css" href="form_comm.css">
</head>


<body>
<form action="">
<table>
<caption>　</caption>
<tr>
<th>아이디</th>
<td><input type="text" name="id" required="required"></td>
<td rowspan="2"><input type="submit" value="접속"></td>
</tr>
<tr>
<th>암호</th>
<td><input type="password" name="pass" required="required"></td>
</tr>
<tr><td></td><td>
<input type="radio" name="chk">회원 <input type="radio" name="chk">직원
</td><td></td></tr>

</table>
</form>
</body>
</html>