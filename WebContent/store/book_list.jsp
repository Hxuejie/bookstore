<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../css/base.css" rel="stylesheet" type="text/css"/>
<link href="../css/list.css" rel="stylesheet" type="text/css"/>
<title>网上书店</title>
</head>
<body>
	<!-- 左上角LOGO -->
	<img class="logo" alt="LOGO" src="../res/logo.png" width="200px" height="50px" > 
	<!-- 搜索框 -->
	<div class="searchBar">
		<s:form action="booklist" namespace="/store">
			<font class="label">搜索：</font> 
			<input style="width: 80%; height: 30px" maxlength="255" name="keyword" type="text">
			<button class="searchBtn" type="submit">搜索</button>
		</s:form>
	</div>
	<!-- 购物车 -->
	<div class="cart">
		<img width="50px" height="50px" alt="购物车" src="../res/cart.jpg"><s:a action="cart" namespace="/store">购物车</s:a>
	</div>
	<!-- 书籍列表 -->	
	<br>
	<br>
	<table class="list">
		<tr align="center">
			<th class="label">序号</th>
			<th class="label">书籍图片</th>
			<th class="label">书籍名称</th>
			<th class="label">作者</th>
			<th class="label">价格</th>
			<th class="label">操作</th>
		</tr>
		<s:iterator value="bookList" id="book" status="i">
			<tr>
				<td><s:property value="#i.index + 1"/></td>
				<td><img src="<s:property value="picture"/>"></td>
				<td> 
					<a href="<s:url action="bookdesc" namespace="/store" >
								<s:param name="bookID" >
									<s:property value="id"/>
								</s:param>
							 </s:url>">
						<s:property value="name"/>
					</a> 
				</td>
				<td> <s:property value="author"/> </td>
				<td class="price"> <s:property value="price"/> </td>
				<td> 
					 <s:a action="cartAdd" namespace="/store">
					 	<s:param name="bookID"><s:property value="id"/></s:param>
					 	添加到购物车
					 </s:a> 
				</td>
			</tr>
		</s:iterator>
	</table>
	<br>
	<br>
	<s:a action="bookmanage" namespace="/store">书籍管理</s:a>

</body>
</html>