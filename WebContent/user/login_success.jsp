<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/base.css" rel="stylesheet" type="text/css"/>
<title>登录成功</title>
</head>
<body>
<img src="../res/success.png">登录成功！<br>
<br>
登录名：<s:property value="username"/><br>
<br>
<a href='<s:url action="booklist" namespace="/store"/>'>获取书籍列表</a>
</body>
</html>