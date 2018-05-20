<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>博客管理</title>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath }" var="blog" />

<link rel="stylesheet" type="text/css"
	href="${blog}/jquery-easyui-1.5.5.1/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${blog}/jquery-easyui-1.5.5.1/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="${blog}/jquery-easyui-1.5.5.1/demo/demo.css">
<script type="text/javascript" src="${blog}/jquery-easyui-1.5.5.1/jquery.min.js"></script>
<script type="text/javascript"
	src="${blog}/jquery-easyui-1.5.5.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${blog}/js/houtaiJS/blogManage.js"></script>
</head>

<body>
	<table id="dg" title="博客管理" class="easyui-datagrid" fitColumns="true"
		pagination="true" url="${blog}/blog/listBlog" toolbar="#tb">
		<thead>
			<tr>
				<th field="cb" checkbox="true" align="center"></th>
				<th field="id" width="20" align="center">编号</th>
				<th field="title" width="200">标题</th>
				<th field="publishDate" width="100" align="center">发布日期</th>
				<th field="category" width="100" align="center"
					formatter="formatBlogType">博客类型</th>
			</tr>
		</thead>
	</table>
	<div id="tb">
		<div>
			标题 <input type="text" id="s_title" size="20"
				onkeydown="if(event.keyCode==13) searchBlog()"> <a
				href="javascript:searchBlog()" class="easyui-linkbutton"
				iconCls="icon-search" plain="true">搜索</a> <a
				href="javascript:deleteBlog()" class="easyui-linkbutton"
				iconCls="icon-remove" plain="true">删除</a> <a
				href="javascript:openBlogModifyTab()" class="easyui-linkbutton"
				iconCls="icon-edit" plain="true">修改</a> <a
				href="javascript:reload()" class="easyui-linkbutton"
				iconCls="icon-reload" plain="true">刷新</a>
		</div>
	</div>
</body>
</html>