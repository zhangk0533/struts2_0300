<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
<form name="f" action="" method="post">
	用户名：<input type="text" name="username"><br>
	密码：<input type="text" name="password"><br>
	<input type="button" name="b1" value="submit1" onclick="javascript:document.f.action='login/UserLogin1';document.f.submit()">
	<input type="button" name="b2" value="submit2" onclick="javascript:document.f.action='login/UserLogin2';document.f.submit()">
	<input type="button" name="b3" value="submit3">
	<input type="button" name="b4" value="submit4">
</form>
</body>
</html>