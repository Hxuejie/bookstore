<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
</head>
<body>
	<s:form action="register" namespace="/user"  method="post">
		<table>
			<tr>
				<td>用户名:</td>
				<td><input name="username" type="text"></td>
			</tr>
			<tr>
				<td align="right">密码:</td>
				<td><input name="password" type="password"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="注册">
				</td>
			</tr>
		</table>
	</s:form>
	<br>
	<s:a href="login.jsp">登录</s:a>
</body>
</html>