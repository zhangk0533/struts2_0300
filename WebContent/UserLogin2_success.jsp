<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Success Page</title>
</head>
<body>
<h1>SUCCESS</h1>
<s:property value="#request.r1" />|<%=request.getAttribute("r1") %>
<s:debug></s:debug>

</body>
</html>