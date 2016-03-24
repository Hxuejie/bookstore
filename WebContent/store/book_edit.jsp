<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>书籍修改</title>
</head>
<body>

<s:form action="updatebook" namespace="/store" method="get" >
	书箱ID：<input name="bookID" type="text" value="<s:property value="book.id"/>"><br>
	<br>
	书箱名称：<input name="name" type="text" value="<s:property value="book.name"/>"><br>
	<br>
	书籍作者：<input name="author" type="text" value="<s:property value="book.author"/>"><br>
	<br>
	书籍价格：<input name="price" type="text" value="<s:property value="book.price"/>"><br>
	<br>
	书籍介绍：<input name="desc" type="text" value="<s:property value="book.desc"/>"><br>
	<br>
	书籍图片：<input name="picture" type="text" value="<s:property value="book.picture"/>"><br>
	<br>
	<button type="submit">修改</button>
</s:form>
</body>
</html>