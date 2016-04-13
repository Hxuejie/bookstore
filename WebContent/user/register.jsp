<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../css/base.css" rel="stylesheet" type="text/css"/>
<style type="text/css">
td{
	color:white;
}
.title {
	font-size: 30px;
	color: #bfbf00;
}
/* 居中  */
.center { 
	margin-left: auto;
	margin-right: auto;
	margin-top: 200px;
	width:400px; 
	height:100px;
}
/* 注册按钮 */
.regBtn {
	margin-top:10px;
	padding-left: 40px;
	padding-right: 40px;
	background-color: orange;
	border-width: 0px;
	color: white;
}
</style>
<title>用户注册</title>
</head>
<body>
<div class="center">
	<p style="margin-left:50px;" class="title">用户注册</p>
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
				<td>手机:</td>
				<td><input name="phone" type="text"></td>
			</tr>
			<tr>
				<td>地址:</td>
				<td><input name="address" type="text"></td>
			</tr>
			<tr>
				<td>email:</td>
				<td><input name="email" type="text"></td>
			</tr>
			<tr>
				<td></td>
				<td align="center">
					<input class="regBtn" type="submit" value="注册">
				</td>
			</tr>
		</table>
	</s:form>
	<br>
	<s:a href="login.jsp">登录</s:a>
</div>
</body>
</html>