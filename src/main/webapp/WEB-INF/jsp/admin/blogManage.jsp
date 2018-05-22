<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>博客管理</title>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath }" var="blog" />

<link rel="stylesheet" type="text/css"
	href="${blog}/jquery-easyui-1.5.5.1/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${blog}/jquery-easyui-1.5.5.1/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="${blog}/jquery-easyui-1.5.5.1/demo/demo.css">
<script type="text/javascript"
	src="${blog}/jquery-easyui-1.5.5.1/jquery.min.js"></script>
<script type="text/javascript"
	src="${blog}/jquery-easyui-1.5.5.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${blog}/js/houtaiJS/blogManage.js"></script>
</head>

<body>
	<table id="dg" title="博客管理" class="easyui-datagrid" fitColumns="true"
		pagination="true" url="${blog}/blog/listBlog" toolbar="#tb"
		pageList="[5, 10, 15, 20]">
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

	<div id="dlg" class="easyui-dialog"
		style="width: 80%; height: 500px; padding: 10px 20px" closed="true"
		buttons="#dlg-buttons">
		<form id="fm" method="post">
			<table cellspacing="8px">
				<tr>
					<td >博客标题</td>
					<td><input type="text" id="title" name="title"
						class="easyui-validatebox" required="true"></td>
				</tr>
				<tr>
					<td>所属类别：</td>
					<td>
						<select id="category" class="easyui-combobox" style="width: 154px" 
							name="category" data-options="panelHeight:'auto',valueField:'id',
							textField:'name', url:'${blog}/category/category_list'">
							<option name="category"></option>
							<c:forEach items="${list }" var="category">
								<option value="${category.id }">${category.name}</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td valign="top">博客内容：</td>
					<td>
						<input type="text" id="content" name="content"
						class="easyui-validatebox" required="true" style="display:none">
						<script id="editor" name="content" type="text/plain"
							style="width:95%; height:200px;"></script>
					</td>
				</tr>
				<tr>
					<td>关键字：</td>
					<td><input type="text" id="keyWord" name="keyWord"
						class="easyui-validatebox" required="true" /></td>
				</tr>
			</table>
		</form>
	</div>

	<div id="dlg-buttons">
		<div>
			<a href="javascript:saveBlogType()" class="easyui-linkbutton"
				iconCls="icon-ok" plain="true">保存</a> <a
				href="javascript:closeBlogTypeDialog()" class="easyui-linkbutton"
				iconCls="icon-cancel" plain="true">关闭</a>
		</div>
	</div>

	<div class="se-preview-section-delimiter"></div>
	
	<script type="text/javascript" charset="utf-8"
		src="http://localhost:8080/myblog/ueditor/utf8-jsp/ueditor.config.js"></script>
	<script type="text/javascript" charset="utf-8"
		src="http://localhost:8080/myblog/ueditor/utf8-jsp/ueditor.all.js"></script>
	<script type="text/javascript" charset="utf-8"
		src="http://localhost:8080/myblog/ueditor/utf8-jsp/lang/zh-cn/zh-cn.js"></script>
	<script type="text/javascript">
	var ue = UE.getEditor('editor');
	</script>
</body>
</html>