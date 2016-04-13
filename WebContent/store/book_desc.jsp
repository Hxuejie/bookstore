<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../css/base.css" rel="stylesheet" type="text/css"/>
<style type="text/css">
.center{
	margin-top: 100px;
	margin-left: auto;
	margin-right: auto;
	width: 600px;
	background-color: #408080;
}
.pic{
	width: 170px;
	height: 210px;
}
.icon{
	float: left;
	width: 200px;
}
.desc{
	float: left;
	width: 400px;
}
.addCart{
	background-color: red;
	border-radius: 3px;
	border-style: none;
	color: white;
	padding: 5px;
}
p{
color: white;
}
</style>
<title>书籍介绍</title>
</head>
<body>
<div class="center">
<p>书籍 > <s:property value="book.name"/> </p>
	<div class="icon">
		<img class="pic" src='<s:property value="book.picture"/>'> 
	</div>
	<div class="desc">
		<p>书箱名称：<s:property value="book.name"/></p>
		<p>书籍作者：<s:property value="book.author"/></p>
		<p>书籍价格：<s:property value="book.price"/></p>
		<p>书籍介绍：<s:property value="book.desc"/></p>
		<button class="addCart">加入购物车</button>
	</div>
</div>

</body>
</html>