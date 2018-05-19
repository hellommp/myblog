<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>后台首页</title>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath }" var="blog" />

<!-- 下面是easyui的环境 -->
<link rel="stylesheet"
	href="${blog}/jquery-easyui-1.5.5.1/themes/icon.css"
	type="text/css"></link>
<link rel="stylesheet"
	href="${blog}/jquery-easyui-1.5.5.1/themes/icons.css"
	type="text/css"></link>
<link rel="stylesheet"
	href="${blog}/jquery-easyui-1.5.5.1/themes/default/easyui.css"
	type="text/css"></link>
<script type="text/javascript"
	src="${blog}/jquery-easyui-1.5.5.1/jquery.min.js"></script>
<script type="text/javascript"
	src="${blog}/jquery-easyui-1.5.5.1/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${blog}/jquery-easyui-1.5.5.1/locale/easyui-lang-zh_CN.js"></script>

<script type="text/javascript" src="http://localhost:8080/myblog/js/houtaiJS/shouye.js"></script>

<style type="text/css">
body {
	font-family: microsoft yahei;
}
</style>
</head>
<body class="easyui-layout">
	<div region="north" style="height: 78px; background-color: #E0ECFF">
		<table style="padding: 5px" width="100%">
			<tr>
				<td width="50%">
					<h2>博客后台系统</h2>
				</td>
				<td valign="bottom" align="right" width="50%"><font size="3">&nbsp;&nbsp;<strong>欢迎：</strong>admin
				</font></td>
			</tr>
		</table>
	</div>
	<div region="west" style="width: 200px" title="导航菜单" split="true">
		<div class="easyui-accordion" data-options="fit:true,border:false">
			<div title="常用操作" data-options="selected:true,iconCls:'icon-item'"
				style="padding: 10px">
				<a
					href="javascript:openTab('写博客','admin/writeBlog','icon-writeblog')"
					class="easyui-linkbutton"
					data-options="plain:true,iconCls:'icon-writeblog'"
					style="width: 150px">写博客</a> <a
					href="javascript:openTab('评论审核','admin/commentManage','icon-plsh')"
					class="easyui-linkbutton"
					data-options="plain:true,iconCls:'icon-plsh'" style="width: 150px">评论审核</a>
			</div>
			<div title="博客管理" data-options="iconCls:'icon-bkgl'"
				style="padding: 10px;">
				<a
					href="javascript:openTab('写博客','admin/writeBlog','icon-writeblog')"
					class="easyui-linkbutton"
					data-options="plain:true,iconCls:'icon-writeblog'"
					style="width: 150px;">写博客</a> <a
					href="javascript:openTab('博客信息管理','admin/blogManage','icon-bkgl')"
					class="easyui-linkbutton"
					data-options="plain:true,iconCls:'icon-bkgl'" style="width: 150px;">博客信息管理</a>
			</div>
			<div title="博客类别管理" data-options="iconCls:'icon-bklb'"
				style="padding: 10px">
				<a href="javascript:openTab('博客类别信息管理','admin/blgl','icon-bklb')"
					class="easyui-linkbutton"
					data-options="plain:true,iconCls:'icon-bklb'" style="width: 150px;">博客类别信息管理</a>
			</div>
			<div title="评论管理" data-options="iconCls:'icon-plgl'"
				style="padding: 10px">
				<a href="javascript:openTab('评论审核','admin/commentManage','icon-plsh')"
					class="easyui-linkbutton"
					data-options="plain:true,iconCls:'icon-plsh'" style="width: 150px">评论审核</a>
				<a href="javascript:openTab('评论信息管理','admin/comments','icon-plgl')"
					class="easyui-linkbutton"
					data-options="plain:true,iconCls:'icon-plgl'" style="width: 150px;">评论信息管理</a>
			</div>
			<div title="个人信息管理" data-options="iconCls:'icon-grxx'"
				style="padding: 10px">
				<a href="javascript:openTab('修改个人信息','writeBlog.jsp','icon-grxxxg')"
					class="easyui-linkbutton"
					data-options="plain:true,iconCls:'icon-grxxxg'"
					style="width: 150px;">修改个人信息</a>
			</div>
			<div title="系统管理" data-options="iconCls:'icon-system'"
				style="padding: 10px">
				<a href="javascript:openTab('友情链接管理','writeBlog.jsp','icon-link')"
					class="easyui-linkbutton"
					data-options="plain:true,iconCls:'icon-link'" style="width: 150px">友情链接管理</a>
				<a
					href="javascript:openTab('修改密码','writeBlog.jsp','icon-modifyPassword')"
					class="easyui-linkbutton"
					data-options="plain:true,iconCls:'icon-modifyPassword'"
					style="width: 150px;">修改密码</a> <a
					href="javascript:openTab('刷新系统缓存','writeBlog.jsp','icon-refresh')"
					class="easyui-linkbutton"
					data-options="plain:true,iconCls:'icon-refresh'"
					style="width: 150px;">刷新系统缓存</a> <a
					href="javascript:openTab('安全退出','writeBlog.jsp','icon-exit')"
					class="easyui-linkbutton"
					data-options="plain:true,iconCls:'icon-exit'" style="width: 150px;">安全退出</a>
			</div>
		</div>
	</div>
	<div data-options="region:'center'" style="background: #eee;">
		<div class="easyui-tabs" fit="true" border="false" id="tabs">
			<div title="首页" data-options="iconCls:'icon-home'">
				<div align="center" style="padding-top: 100px">
					<font color="red" size="10">欢迎使用</font>
				</div>
			</div>
		</div>
	</div>
	<div region="south" style="height: 25px; padding: 5px" align="center">
		<div region="south" style="height: 25px; padding: 5px" align="center">
			Copyright © 版权所有</div>
	</div>


</body>
</html>