<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../css/base.css" rel="stylesheet" type="text/css"/>
<title>网上书店</title>
</head>
<body>
书籍列表： <s:form action="booklist" namespace="/store"><input name="keyword" type="text"><button type="submit">搜索</button></s:form> <br>
<br>
<s:a action="cart" namespace="/store">购物车</s:a>
<br>
<table bordercolor="#0FF" border="1px" cellspacing="0px" cellpadding="10px">
	<tr align="center">
		<td>书籍图片</td>
		<td>书籍名称</td>
		<td>作者</td>
		<td>价格</td>
		<td>管理</td>
	</tr>
	<s:iterator value="bookList" id="book">
		<tr>
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
			<td> <s:property value="price"/> </td>
			<td> <s:a action="delbook" namespace="/store">
					<s:param name="bookID"><s:property value="id"/></s:param>
					删除
				 </s:a>  
				 <s:a action="editbook" namespace="/store">
				 	<s:param name="bookID"><s:property value="id"/></s:param>
				 	修改
				 </s:a> 
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
<a href="book_add.jsp">添加书籍</a>

</body>
</html>