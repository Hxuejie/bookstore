<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/base.css" rel="stylesheet" type="text/css"/>
<title>用户登录</title>
</head>
<body>
	<div class="center">
	<img src="res/logo.png">
	<br>
	<s:form action="login" namespace="/user"  method="post">
		<table>
			<tr>
				<td class="label">用户名:</td>
				<td><input name="username" type="text"></td>
			</tr>
			<tr>
				<td class="label" align="right">密码:</td>
				<td><input name="password" type="password"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="登录">
				</td>
			</tr>
		</table>
	</s:form>
	<br>
	<s:a href="user/register.jsp">注册</s:a>
	</div>
</body>
</html>