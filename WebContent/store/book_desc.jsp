<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>书籍介绍</title>
</head>
<body>

书箱名称：<s:property value="book.name"/><br>
<br>
书籍作者：<s:property value="book.author"/><br>
<br>
书籍价格：<s:property value="book.price"/><br>
<br>
书籍介绍：<s:property value="book.desc"/>

</body>
</html>