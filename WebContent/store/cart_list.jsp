<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../css/base.css" rel="stylesheet" type="text/css"/>
<link href="../css/cart.css" rel="stylesheet" type="text/css"/>
<title>购物车</title>
</head>
<body>
<div class="cartCenter">
	<p>我的购物车：</p> 
	<br>
	<table class="altrowstable">
		<tr align="center">
			<td>书籍图片</td>
			<td>书籍名称</td>
			<td>作者</td>
			<td>价格</td>
			<td>管理</td>
		</tr>
		<s:iterator value="bookList" id="book">
			<tr>
				<td><img width="100px" height="140px" src="<s:property value="picture"/>"></td>
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
				<td> <s:property value="price"/> </td>
				<td> <s:a action="cartRemove" namespace="/store">
						<s:param name="bookID"><s:property value="id"/></s:param>
						删除
					 </s:a>  
				</td>
			</tr>
		</s:iterator>
	</table>
	<br>
	<br>
	<div style="float:right;">
	<s:a style="background-color: red; color: white; padding-left:10px;padding-right:10px; padding-top:5px; padding-bottom:5px; border-radius:3px;" action="createOrder" namespace="/store">结算</s:a>
	</div>
</div>

</body>
</html>