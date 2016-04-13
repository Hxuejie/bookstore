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
	margin-left: auto;
	margin-right: auto;
	margin-top: 150px;
	width:700px;
}
td{
color:white;
}
input{
width:300px;
height:50px;
}
</style>
<title>添加书籍</title>
</head>
<body>
<div class="center">
	<s:form action="addbook" namespace="/store"  method="get">
		<table>
			<tr>
				<td>名称:</td>
				<td><input name="name" type="text"></td>
			</tr>
			<tr>
				<td>作者:</td>
				<td><input name="author" type="text"></td>
			</tr>
			<tr>
				<td>价格:</td>
				<td><input name="price" type="text"></td>
			</tr>
			<tr>
				<td>描述:</td>
				<td><input name="desc" type="text"></td>
			</tr>
			<tr>
				<td>图片:</td>
				<td><input name="picture" type="text"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit">添加</button>
					<button type="reset">重置</button>
				</td>
			</tr>
		</table>
	</s:form>
	</div>
</body>
</html>