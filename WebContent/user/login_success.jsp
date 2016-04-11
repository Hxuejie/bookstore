<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../css/base.css" rel="stylesheet" type="text/css"/>
<style type="text/css">
.userName{
	color: red;
}
</style>
<title>登录成功</title>
</head>
<body>
	<div  class="center">
		<img src="../res/success.png"/><p class="label" >登录成功！</p>
		<p class="label" >登录名：<font class="userName"><s:property value="username"/></font></p>
		<br>
		<a href='<s:url action="booklist" namespace="/store"/>'>进入书籍列表</a>
	</div>
</body>
</html>