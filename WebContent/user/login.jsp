<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/base.css" rel="stylesheet" type="text/css"/>
<link href="css/login.css" rel="stylesheet" type="text/css"/>
<title>用户登录</title>
</head>
<body>
	<div class="center">
	<!-- LOGO -->
	<img src="res/logo.png">
	<br>
	<s:form action="login" namespace="/user"  method="post">
		<table class="inputFrame">
			<!-- 用户名 -->
			<tr>
				<td class="label">用户名:</td>
				<td><input name="username" type="text"></td>
			</tr>
			<!-- 密码 -->
			<tr>
				<td class="label" align="right">密码:</td>
				<td><input name="password" type="password"></td>
			</tr>
			<!-- 登录、注册 -->
			<tr>
				<td colspan="2" align="center">
					<s:a class="reg" type="button" href="user/register.jsp">注册</s:a>
					<input class="loginBtn" type="submit" value="登录">
				</td>
			</tr>
		</table>
	</s:form>
	<br>
	</div>
</body>
</html>